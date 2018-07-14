package tamrin_in_class_2.dao;

import tamrin_in_class_2.DBConnection;
import tamrin_in_class_2.model.Person;

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
