package mordad_3th.dao;

import mordad_3th.entity.BookEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDao {

    public boolean create(BookEntity bookEntity) {
        String url = "jdbc:mysql://localhost:3306/library?user=root&password=";
        try {

            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection(url);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return true;// فعلا
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
