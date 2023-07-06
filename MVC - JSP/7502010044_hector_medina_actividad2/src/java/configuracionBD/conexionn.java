
package configuracionbd;
import java.sql.*;

public class conexionn {
    Connection con;
    public conexionn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mascotascrud", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error" + e);
        }
    }

    public Connection getConnection() {
        return con;
    }
}
