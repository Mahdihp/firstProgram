package com.mahdi.service.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Dao implements Crud {

    private static String url = "jdbc:mysql://localhost:3306/library?user=root&password=";
    protected static Connection connection = null;

    public Dao() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection(url);

    }


}
