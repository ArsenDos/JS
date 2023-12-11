package org.example;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/";
        String name = "root";
        String pass = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager.getConnection(url, name, pass)) {






        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

