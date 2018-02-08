package com.test.hibernate.demo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc
{
    public static void main(String[] args){

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker";
        String user = "eugene";
        String password = "eugene";
        try {
            System.out.println("connecting to cb "+jdbcUrl);

            Connection myConn = DriverManager.getConnection(jdbcUrl, user, password);

            System.out.println("connection successfull!!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
