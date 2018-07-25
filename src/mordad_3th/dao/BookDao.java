package mordad_3th.dao;

import mordad_3th.entity.BookEntity;

import java.sql.*;

public class BookDao {

    private Connection connection = null;
    private String url = "jdbc:mysql://localhost:3306/library?user=root&password=";

    public BookDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean create(BookEntity bookEntity) {
        String sql = "INSERT INTO book(id,bookName,isbn,writer_id) VALUES(?,?,?,?);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, bookEntity.getId());
            ps.setString(2, bookEntity.getName());
            ps.setString(3, bookEntity.getIsbn());
            ps.setInt(4, bookEntity.getWriterId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public BookEntity read(int id) {
        String sql = "SELECT * FROM book WHERE id=?;";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int idBook = rs.getInt("id");
            String name = rs.getString("name");
            String isbn = rs.getString("isbn");
            int writer_id = rs.getInt("writer_id");
            return new BookEntity(idBook, name, isbn, writer_id);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean update(BookEntity bookEntity) {
        try {
            String sql = "UPDATE book SET name=?,isbn=?,writer_id=? WHERE id=?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, bookEntity.getName());
            ps.setString(2, bookEntity.getIsbn());
            ps.setInt(3, bookEntity.getWriterId());
            ps.setInt(4, bookEntity.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(int id) {
        try {
            String sql = "DELETE FROM book WHERE id=?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public BookEntity[] readAll() {
        String sql = "SELECT * FROM book";
        BookEntity[] be = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.last();// move to last row
            be = new BookEntity[rs.getRow()]; // get row count
            rs.beforeFirst(); // move to first row
            int i = 0;
            while (rs.next()) {
                int idBook = rs.getInt("id");
                String name = rs.getString("name");
                String isbn = rs.getString("isbn");
                int writer_id = rs.getInt("writer_id");
                be[i] = new BookEntity(idBook, name, isbn, writer_id);
                i++;
            }
            return be;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean empty() {
        try {
            String sql = "DELETE FROM book";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


}
