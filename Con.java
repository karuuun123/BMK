package bank.management.system;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;

    public Con() {
        try {
            // ✅ Correct database name (bankSystem)
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankSystem", "root", "karan@143");
            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
