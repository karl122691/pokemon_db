/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class DBConnection {
        private static final String URL = "jdbc:mysql://localhost:3306/pokemon_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; // change if needed

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // optional in modern Java, but safe to include
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
