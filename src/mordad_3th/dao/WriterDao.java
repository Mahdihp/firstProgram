package mordad_3th.dao;

import mordad_3th.entity.Entity;
import mordad_3th.entity.MysqlException;
import mordad_3th.entity.WriterEntity;

import java.sql.*;

public class WriterDao extends Dao {

    public WriterDao() throws Exception {

    }

    @Override
    public void create(Entity entity) throws SQLException {

        WriterEntity writerEntity = (WriterEntity) entity;
        String sql = "INSERT INTO writer(id,name,age,style) VALUES(?,?,?,?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, writerEntity.getId());
        ps.setString(2, writerEntity.getName());
        ps.setInt(3, writerEntity.getAge());
        ps.setString(4, writerEntity.getStyle());
        ps.executeUpdate();

    }

    @Override
    public Entity read(int id) throws SQLException {
        String sql = "SELECT * FROM writer WHERE id=?;";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        int idWriter = rs.getInt("id");
        String name = rs.getString("name");
        int age = rs.getInt("age");
        String style = rs.getString("style");
        return new WriterEntity(idWriter, name, age, style);
    }

    @Override
    public void update(Entity entity) throws SQLException {

        WriterEntity writerEntity = (WriterEntity) entity;
        String sql = "UPDATE writer SET name=?,age=?,style=? WHERE id=?;";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.setString(1, writerEntity.getName());
        ps.setInt(2, writerEntity.getAge());
        ps.setString(3, writerEntity.getStyle());
        ps.setInt(4, writerEntity.getId());
        ps.executeUpdate();
    }

    public void delete(int id) throws SQLException {

        String sql = "DELETE FROM writer WHERE id=?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    public Entity[] readAll() throws SQLException {
        String sql = "SELECT * FROM writer";
        WriterEntity[] be = null;
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
    }

    public void empty() throws SQLException {
        String sql = "DELETE FROM writer";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.executeUpdate();

    }
}