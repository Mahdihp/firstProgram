package mordad_3th.dao;

import mordad_3th.entity.WriterEntity;

import java.sql.*;

public class WriterDao {

    private Connection connection = null;
    private String url = "jdbc:mysql://localhost:3306/library?user=root&password=";

    public WriterDao() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean create(WriterEntity writerEntity) {
        String sql = "INSERT INTO writer(id,name,age,style) VALUES(?,?,?,?);";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, writerEntity.getId());
            ps.setString(2, writerEntity.getName());
            ps.setInt(3, writerEntity.getAge());
            ps.setString(4, writerEntity.getStyle());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public WriterEntity read(int id) {
        String sql = "SELECT * FROM writer WHERE id=?;";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int idWriter = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String style = rs.getString("style");
            return new WriterEntity(idWriter, name, age, style);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public boolean update(WriterEntity writerEntity) {
        try {
            String sql = "UPDATE writer SET name=?,age=?,style=? WHERE id=?;";
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, writerEntity.getName());
            ps.setInt(2, writerEntity.getAge());
            ps.setString(3, writerEntity.getStyle());
            ps.setInt(4, writerEntity.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean delete(int id) {
        try {
            String sql = "DELETE FROM writer WHERE id=?;";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public WriterEntity[] readAll() {
        String sql = "SELECT * FROM writer";
        WriterEntity[] be = null;
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.last();// move to last row
            be = new WriterEntity[rs.getRow()]; // get row count
            rs.beforeFirst(); // move to first row
            int i = 0;
            while (rs.next()) {
                int idWriter = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String style = rs.getString("style");
                be[i] = new WriterEntity(idWriter, name, age, style);
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
            String sql = "DELETE FROM writer";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}