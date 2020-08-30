package servlet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    public static void main(String[] args) throws SQLException {
        System.out.println("连接中数据库中...");
        Connection connection = get();
        String driverName = connection.getMetaData().getDriverName();
        System.out.println(driverName);
        System.out.println("连接成功");
    }

    public static Connection get() {
        System.out.println("连接中数据库中...");
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/kiyuiro?serverTimezone=GMT%2B8";
            String user = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("连接成功");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void close(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
