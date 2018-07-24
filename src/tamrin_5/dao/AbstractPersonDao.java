package tamrin_5.dao;

import tamrin_5.dao.DBConnection;
import tamrin_5.dao.Dao;
import tamrin_5.model.Person;

import java.sql.Connection;

public abstract class AbstractPersonDao<T extends  Person> implements Dao<T>{

    Connection connection;

    public AbstractPersonDao() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        connection = DBConnection.getConnection();
    }

}
