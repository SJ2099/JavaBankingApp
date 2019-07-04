
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger;


public class DBConnection {
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/bankingmanagementsystem", "root", "");
        }catch (Exception ex){
            
            System.out.println(ex.getMessage());
        }
        
        
        return conn;
        
    }

}
