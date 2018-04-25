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
public class SupplierUpdater //start class
{
    public DefaultTableModel getData()//start
    {
        
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Supplier_ID");
        dm.addColumn("Name");
        dm.addColumn("Postcode");
        dm.addColumn("Phone");
        dm.addColumn("Email Address");
        dm.addColumn("last update");
        
        
        String sql = "SELECT * FROM supplier_table";
        
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/product_database","root","hello1234");
            
            Statement s =(Statement) conn.prepareStatement(sql);
            
            ResultSet rs =s.executeQuery(sql);
            
            while(rs.next()){
                String Supplier_ID = rs.getString(1);
                String Name = rs.getString(2);
                String address = rs.getString(3);
                String postcode = rs.getString(4);
                String phone = rs.getString(5);
                String last_update = rs.getString(6);
                
                
                dm.addRow(new String[]{Supplier_ID,Name,address,postcode,phone,last_update});
                
            }
            
            return dm;
            
        }catch(Exception e){
        }
        
        return null;
    }//finish
    
    public boolean add(String Name,String Postcode,String Phone,String Email_Address, String last_Input )//start
    {
        
        String mysql="INSERT INTO supplier_table(`Supplier ID`, `Name`, `Postcode`, `Phone`, `Email Address`, `last update`)VALUES(NULL, '"+Name+"','"+Postcode+"','"+Phone+"','"+Email_Address+"','"+last_Input+"')";
        
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
    
    public boolean update(String Supplier_ID,String Name,String Postcode,String Phone,String Email_Address,String last_update)//start
    {
        
        
        String sql="UPDATE `supplier_table` SET `Name`='"+Name+"',`Postcode`='"+Postcode+"',`Phone`='"+Phone+"',`Email Address`='"+Email_Address+"' WHERE `Supplier ID`='"+Supplier_ID+"'";
        
        
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
        
        String sql="DELETE FROM supplier_table WHERE Name ='"+Name+"'";
                                               
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