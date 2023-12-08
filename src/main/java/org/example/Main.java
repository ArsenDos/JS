package org.example;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306";

        String name = "root";
        String pass = "root";


        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url , name , pass)) {

            Statement statement = connection.createStatement();
            statement.execute("insert into test1(name) value(Arsen)");
            ResultSet resultSet = statement.getResultSet();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }



            } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }


    }

    }
