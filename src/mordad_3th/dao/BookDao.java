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
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public BookEntity read(int id) {
        String sql = "SELECT * FROM book WHERE id=?;";
        BookEntity bookEntity = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int idBook = rs.getInt("id");
            String bookName = rs.getString("bookName");
            String isbn = rs.getString("isbn");
            String author = rs.getString("author");
            bookEntity = new BookEntity(idBook, bookName, isbn, author);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return bookEntity;
    }

    public boolean update(BookEntity bookEntity) {
        return true;// فعلا
    }

    public boolean delete(int id) {
        return true;// فعلا
    }

    public BookEntity[] readAll() {
        return null; //فعلا
    }

    public boolean deleteAll() {
        return true;// فعلا
    }


}
