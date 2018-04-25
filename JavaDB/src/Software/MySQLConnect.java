package Software;
//import
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Nate01
 */
public class MySQLConnect //start class
{
    Connection conn=null;
    
    public static Connection ConnectDB()//start
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/product_database","root","hello1234");
            return conn;
        }
        
    catch(ClassNotFoundException | SQLException e){
    JOptionPane.showMessageDialog(null, e);
    return null;
}
    } //finish

}//finish class