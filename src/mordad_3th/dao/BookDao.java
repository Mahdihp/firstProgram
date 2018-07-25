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
        String sql = "INSERT INTO book(id,bookName,isbn,author) VALUES(?,?,?,?);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, bookEntity.getId());
            ps.setString(2, bookEntity.getBookName());
            ps.setString(3, bookEntity.getIsbn());
            ps.setString(4, bookEntity.getAuthor());
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
            String bookName = rs.getString("bookName");
            String isbn = rs.getString("isbn");
            String author = rs.getString("author");
            return new BookEntity(idBook, bookName, isbn, author);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean update(BookEntity bookEntity) {
        try {
            String sql = "UPDATE book SET bookName=?,isbn=?,author=? WHERE id=?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, bookEntity.getBookName());
            ps.setString(2, bookEntity.getIsbn());
            ps.setString(3, bookEntity.getAuthor());
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
            rs.last();
            be = new BookEntity[rs.getRow()];
            rs.beforeFirst();
            int i = 0;
            while (rs.next()) {
                int idBook = rs.getInt("id");
                String bookName = rs.getString("bookName");
                String isbn = rs.getString("isbn");
                String author = rs.getString("author");
                be[i] = new BookEntity(idBook, bookName, isbn, author);
                i++;
            }

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
