package Software;
//imports
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nate01
 */
public class Supplier extends javax.swing.JFrame //start class
{
/**
 *
 * @author Nate01
 */
    public Supplier() //start
    {
        initComponents();
        
        retreive();

    }//finish
    
    public void retreive()//start
    {
       DefaultTableModel dm = new SupplierUpdater().getData();
        
        tblSupplierContent.setModel(dm);
    }//finish

    private void initComponents() //start
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplierContent = new javax.swing.JTable();
        lblback01 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblSupplierID = new javax.swing.JLabel();
        txtSupplierPostcode = new javax.swing.JTextField();
        lblSupplierName = new javax.swing.JLabel();
        lblSupplierPostcode = new javax.swing.JLabel();
        lblCustomerPhone = new javax.swing.JLabel();
        txtpostcode = new javax.swing.JTextField();
        txtSupplierPhone = new javax.swing.JTextField();
        txtSupplierName = new javax.swing.JTextField();
        lblCustomerPostcode = new javax.swing.JLabel();
        btnDeleteSupplier = new javax.swing.JButton();
        btn_Supplier_Edit = new javax.swing.JButton();
        btnSupplierAdd = new javax.swing.JButton();
        lblSupplierTitle = new javax.swing.JLabel();
        btnProducts_Supplier = new javax.swing.JButton();
        btnCustomer_Supplier = new javax.swing.JButton();
        btnMainMenu_Supplier = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Supplier");
        setLocation(new java.awt.Point(400, 100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);

        tblSupplierContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblSupplierContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSupplierContentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {

            }
        });
        jScrollPane1.setViewportView(tblSupplierContent);

        lblSupplierID.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblSupplierID.setText("Name");

        lblSupplierName.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblSupplierName.setText("Address");

        lblSupplierPostcode.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblSupplierPostcode.setText("Postcode");

        lblCustomerPhone.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblCustomerPhone.setText("");

        lblCustomerPostcode.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblCustomerPostcode.setText("Phone");

        btnDeleteSupplier.setText("Delete Record");
        btnDeleteSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSupplierActionPerformed(evt);
            }
        });

        btn_Supplier_Edit.setText("Update Record");
        btn_Supplier_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Supplier_EditActionPerformed(evt);
            }
        });

        btnSupplierAdd.setText("New Record");
        btnSupplierAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierAddActionPerformed(evt);
            }
        });

        lblSupplierTitle.setFont(new java.awt.Font("Calibri", 0, 36));
        lblSupplierTitle.setText("Supplier");

        btnProducts_Supplier.setText("Products");
        btnProducts_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducts_SupplierActionPerformed(evt);
            }
        });

        btnCustomer_Supplier.setText("Customer");
        btnCustomer_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomer_SupplierActionPerformed(evt);
            }
        });

        btnMainMenu_Supplier.setText("Main Menu");
        btnMainMenu_Supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenu_SupplierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCustomer_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteSupplier, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Supplier_Edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupplierAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProducts_Supplier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMainMenu_Supplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSupplierPostcode)
                            .addComponent(lblSupplierName)
                            .addComponent(lblSupplierID)
                            .addComponent(lblCustomerPostcode)
                            .addComponent(lblCustomerPhone))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSupplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPhone)
                                .addComponent(txtpostcode)
                                .addComponent(txtSupplierPostcode)
                                .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblback01)
                        .addGap(31, 31, 31)
                        .addComponent(lblSupplierTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(332, 332, 332))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(btnMainMenu_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCustomer_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProducts_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(lblback01))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblSupplierTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierID)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnSupplierAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Supplier_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSupplierName)
                            .addComponent(txtSupplierPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSupplierPostcode)
                            .addComponent(txtpostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustomerPostcode)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustomerPhone)
                            .addComponent(txtSupplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
        setLocationRelativeTo(null);
    }//finish
    
    public String method(String Strin) //start
    {
    
      Strin = Strin.substring(0, Strin.length()-1);
    
    return Strin;
    }//finish
    private void tblSupplierContentMouseClicked(java.awt.event.MouseEvent evt) //start
    {                                                
        String SupplierID = tblSupplierContent.getValueAt(tblSupplierContent.getSelectedRow(),0).toString();
        String Name = tblSupplierContent.getValueAt(tblSupplierContent.getSelectedRow(),1).toString();
        String Address = tblSupplierContent.getValueAt(tblSupplierContent.getSelectedRow(),2).toString();
        String postcode = tblSupplierContent.getValueAt(tblSupplierContent.getSelectedRow(),3).toString();
        String phone = tblSupplierContent.getValueAt(tblSupplierContent.getSelectedRow(),4).toString();
        String last_update = tblSupplierContent.getValueAt(tblSupplierContent.getSelectedRow(),5).toString();

        txtSupplierName.setText(Name);
        txtSupplierPostcode.setText(Address);
        txtpostcode.setText(postcode);
        txtPhone.setText(phone);
        txtSupplierPhone.setText(SupplierID);
    }//finish

    private void btnDeleteSupplierActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                 
        String[] option = {"YES","NO"};

        int answer = JOptionPane.showOptionDialog(null, "Sure To Delete?", "DELETED", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);

        if(answer==0){

            int index = tblSupplierContent.getSelectedRow();
            String Name =tblSupplierContent.getValueAt(index,1).toString();
            if(new SupplierUpdater().delete(Name)){

                JOptionPane.showMessageDialog(null,"Deleted");
                          retreive();
                txtSupplierName.setText("");
                txtSupplierPostcode.setText("");
                txtpostcode.setText("");
                txtPhone.setText("");
                txtSupplierPhone.setText("");
                

            }
            else{
                JOptionPane.showMessageDialog(null,"not deleted");
            }
        }
    }//finish

    private void btn_Supplier_EditActionPerformed(java.awt.event.ActionEvent evt) //start
    { 
        int index = tblSupplierContent.getSelectedRow();
        String id =tblSupplierContent.getValueAt(index,0).toString();
  

        if(new SupplierUpdater().update(id,txtSupplierName.getText() ,txtSupplierPostcode.getText(),txtpostcode.getText(),txtPhone.getText(), txtSupplierPhone.getText())){

            JOptionPane.showMessageDialog(null,"updated");
            
            txtSupplierName.setText("");
            txtSupplierPostcode.setText("");
            txtpostcode.setText("");
            txtPhone.setText("");
            txtSupplierPhone.setText("");


        }
        else{
            JOptionPane.showMessageDialog(null,"not updated");
        }
        retreive();
    } //finish
    
    private void btnSupplierAddActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                               
        AddSupplier a = new AddSupplier();
        a.setVisible(true);
        this.setVisible(false);
        retreive();
    }//finish

    private void btnProducts_SupplierActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                                      
        new Products().setVisible(true);
        this.setVisible(false);
    } //finish

    private void btnCustomer_SupplierActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                                     
        new Customers().setVisible(true);
        this.setVisible(false);
    }//finish

    private void btnMainMenu_SupplierActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                                     
        new Main_Menu().setVisible(true);
        this.setVisible(false);
    }//finish

    public static void main(String args[]) //start main
    {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);  
            }
        });
    }//finish main

    
    //variables
    private javax.swing.JButton btnSupplierAdd;
    private javax.swing.JButton btnDeleteSupplier;
    private javax.swing.JButton btnMainMenu_Supplier;
    private javax.swing.JButton btnProducts_Supplier;
    private javax.swing.JButton btnCustomer_Supplier;
    private javax.swing.JButton btn_Supplier_Edit;
    private javax.swing.JLabel lblSupplierID;
    private javax.swing.JLabel lblback01;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSupplierPostcode;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblCustomerPhone;
    private javax.swing.JLabel lblCustomerPostcode;
    private javax.swing.JLabel lblSupplierTitle;
    private javax.swing.JTable tblSupplierContent;
    private javax.swing.JTextField txtpostcode;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtSupplierPostcode;
    private javax.swing.JTextField txtSupplierPhone;
    private javax.swing.JTextField txtPhone;
}//finish class