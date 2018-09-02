package com.mahdi.service.dao;



import com.mahdi.service.model.BookEntity;
import com.mahdi.service.model.Entity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDao extends com.mahdi.service.dao.Dao {

    public BookDao() throws Exception {

    }

    @Override
    public void create(Entity entity) throws SQLException {
        BookEntity bookEntity = (BookEntity) entity;

        String sql = "INSERT INTO book(id,bookName,isbn,writer_id) VALUES(?,?,?,?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, bookEntity.getId());
        ps.setString(2, bookEntity.getName());
        ps.setString(3, bookEntity.getIsbn());
        ps.setInt(4, bookEntity.getWriterId());
        ps.executeUpdate();

    }

    @Override
    public Entity read(int id) throws SQLException {
        String sql = "SELECT * FROM book WHERE id=?;";

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        rs.next();
        int idBook = rs.getInt("id");
        String name = rs.getString("name");
        String isbn = rs.getString("isbn");
        int writer_id = rs.getInt("writer_id");
        return new BookEntity(idBook, name, isbn, writer_id);

    }

    public void update(Entity entity) throws SQLException {
        BookEntity bookEntity = (BookEntity) entity;
        String sql = "UPDATE book SET name=?,isbn=?,writer_id=? WHERE id=?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, bookEntity.getName());
        ps.setString(2, bookEntity.getIsbn());
        ps.setInt(3, bookEntity.getWriterId());
        ps.setInt(4, bookEntity.getId());
        ps.executeUpdate();

    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM book WHERE id=?;";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();

    }

    public Entity[] readAll() throws SQLException {
        String sql = "SELECT * FROM book";
        BookEntity[] be = null;

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
    }

    public void empty() throws SQLException {
        String sql = "DELETE FROM book";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.executeUpdate();

    }


}
