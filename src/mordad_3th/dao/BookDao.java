package mordad_3th.dao;

import mordad_3th.entity.BookEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDao {

    public boolean create(BookEntity bookEntity) {
        String url = "jdbc:mysql://localhost:3306/library?user=root&password=";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        return null;// فعلا
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
