package Software;
//import
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Nate01
 */
public class Main_Menu extends javax.swing.JFrame //start class
{
Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Main_Menu() //start
    {
        initComponents();
    }//finish

    private void initComponents() //start
    {

        btnProducts02 = new javax.swing.JButton();
        btnCustomers01 = new javax.swing.JButton();
        lblMain_menu = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnSupplier01 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 100));
        setUndecorated(true);
        setResizable(false);

        btnProducts02.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnProducts02.setText("Products");
        btnProducts02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducts02ActionPerformed(evt);
            }
        });

        btnCustomers01.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnCustomers01.setText("Customers");
        btnCustomers01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomers01ActionPerformed(evt);
            }
        });

        lblMain_menu.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        lblMain_menu.setText("Main Menu");

        btnLogout.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnSupplier01.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnSupplier01.setText("Suppliers");
        btnSupplier01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplier01ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(lblMain_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btnProducts02, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(btnCustomers01, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(btnSupplier01, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(303, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblMain_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomers01, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProducts02, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnSupplier01, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        pack();
    }//finish

    private void btnProducts02ActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                              
new Products().setVisible(true);
     this.setVisible(false);
    }//finish

    private void btnCustomers01ActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                               
      new Customers().setVisible(true);
     this.setVisible(false);
    }//finish

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                          
         new Login().setVisible(true);
         this.setVisible(false);
    }//finish

    private void btnSupplier01ActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                              
        new Supplier().setVisible(true);
        this.setVisible(false);
    }//finish

    public static void main(String args[])// start main
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() //start
        {
            public void run() {
                new Main_Menu().setVisible(true);
            }
        });//strt
    }//finish main

    private javax.swing.JButton btnCustomers01;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProducts02;
    private javax.swing.JButton btnSupplier01;
    private javax.swing.JLabel lblMain_menu;
}//finish class