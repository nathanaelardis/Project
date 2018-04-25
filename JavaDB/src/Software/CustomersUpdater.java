package Software;
//imports
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nate01
 */
public class CustomersUpdater //start class
{
    public DefaultTableModel getData()//start
    {
        
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Customer_ID");
        dm.addColumn("Name");
        dm.addColumn("address");
        dm.addColumn("postcode");
        dm.addColumn("phone");
        dm.addColumn("last update");
        
        
        String sql = "SELECT * FROM customer_table";
        
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/product_database","root","hello1234");
            
            Statement s =(Statement) conn.prepareStatement(sql);
            
            ResultSet rs =s.executeQuery(sql);
            
            while(rs.next()){
                String Customer_ID = rs.getString(1);
                String Name = rs.getString(2);
                String address = rs.getString(3);
                String postcode = rs.getString(4);
                String phone = rs.getString(5);
                String last_update = rs.getString(6);
                
                
                dm.addRow(new String[]{Customer_ID,Name,address,postcode,phone,last_update});
                
            }
            
            return dm;
            
        }catch(Exception e){
        }
        
        return null;
    }//finish
    
    public boolean add(String Name,String address,String postcode,String phone, String last_Input )//start
    {
        
        String mysql="INSERT INTO customer_table(`Customer ID`, `Name`, `address`, `postcode`, `phone`, `last update`)VALUES(NULL, '"+Name+"','"+address+"','"+postcode+"','"+phone+"','"+last_Input+"')";
        
        try{
            
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/product_database","root","hello1234");
            
            Statement state =(Statement) conn.prepareStatement(mysql);
            
            state.execute(mysql);
            
            return true;
        }catch(Exception e){
                        e.printStackTrace();
        }
        return false;
    }//finsh
    
    public boolean update(String Customer_ID,String Name,String address,String postcode,String phone,String last_update)//start
    {
        
        
        String sql="UPDATE `customer_table` SET `Name`='"+Name+"',`address`='"+address+"',`postcode`='"+postcode+"',`phone`='"+phone+"' WHERE `Customer ID`='"+Customer_ID+"'";
        
        
        try{
            
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/product_database","root","hello1234");
            
            Statement state =(Statement) conn.prepareStatement(sql);
            
            state.execute(sql);
            
            
            
            return true;
        }catch(Exception e){
        }
        return false;
        
    }//finish
    
public boolean delete(String Name)//start
    {
        
        String sql="DELETE FROM customer_table WHERE Name ='"+Name+"'";
                                               
        try{
            
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/product_database","root","hello1234");
            
            Statement state =(Statement) conn.prepareStatement(sql);
            
            state.execute(sql);
            
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
        
    }//finish
}//finish class