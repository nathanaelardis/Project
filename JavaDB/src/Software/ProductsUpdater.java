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
public class ProductsUpdater //start class
{
    public DefaultTableModel getData()//start
    {
        
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Barcode");
        dm.addColumn("Name");
        dm.addColumn("Product Name");
        dm.addColumn("Price Band 01");
        dm.addColumn("Price Band 02");
        dm.addColumn("last update");
        
        
        String sql = "SELECT * FROM product_table";
        
        try{
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/product_database","root","hello1234");
            
            Statement s =(Statement) conn.prepareStatement(sql);
            
            ResultSet rs =s.executeQuery(sql);
            
            while(rs.next()){
                String Barcode = rs.getString(1);
                String Name = rs.getString(2);
                String Product_Name = rs.getString(3);
                String Price_Band_01 = rs.getString(4);
                String Price_Band_02 = rs.getString(5);
                String last_update = rs.getString(6);
                
                
                dm.addRow(new String[]{Barcode,Name,Product_Name,Price_Band_01,Price_Band_02,last_update});
                
            }
            
            return dm;
            
        }catch(Exception e){
        }
        
        return null;
    }//finish
    
    public boolean add(String Product_Type,String Product_Name,String Price_Band01,String Price_Band02, String last_Input )//start
    {
        
        String mysql="INSERT INTO product_table(`Barcode`, `Product type`, `Product name`, `Price Band 1`, `Price Band 2`, `last update`)VALUES(NULL, '"+Product_Type+"','"+Product_Name+"','"+Price_Band01+"','"+Price_Band02+"','"+last_Input+"')";
        
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
    
    public boolean update(String Barcode,String Product_Type,String Product_Name,String Price_Band01,String Price_Band02,String last_update)//start
    {
        
        
        String sql="UPDATE `product_table` SET `Product type`='"+Product_Type+"',`Product name`='"+Product_Name+"',`Price Band 1`='"+Price_Band01+"',`Price Band 2`='"+Price_Band02+"' WHERE `Barcode`='"+Barcode+"'";
        
        
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
        
        String sql="DELETE FROM product_table WHERE Barcode ='"+Name+"'";
                                               
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