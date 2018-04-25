package Software;
//import
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Nate01
 */
public class Main //start class
{

    public static void main(String[] args) throws Exception//start main
    {
        
        new Thread(){
       public void run() {
                
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                
                new Login().setVisible(true);
            }
       
    }.start();
        try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            
        }
    }//finish main
    }//finish class