package Helper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection connect = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/database_name";
            String user = "username";      // Veritabanı kullanıcı adınızı yazın
            String password = "password";      // Şifrenizi buraya yazın
            connect = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver bulunamadı.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Bağlantı hatası: " + e.getMessage());
            e.printStackTrace();
        }
        return connect;
    }
}
