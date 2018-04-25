package Software;
//imports
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nate01
 */
public class Customers extends javax.swing.JFrame //start class
{

/**
 *
 * @author Nate01
 */
    public Customers() //start
    {
        initComponents();
        
        retreive();

    }//finish
    
    public void retreive()//start
    {
       DefaultTableModel dm = new CustomersUpdater().getData();
        
        tblCustomerContent.setModel(dm);
    }//finish

    private void initComponents() //start
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerContent = new javax.swing.JTable();
        lblback = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblCustomerID = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        lblCustomerName = new javax.swing.JLabel();
        lblCustomerAddress = new javax.swing.JLabel();
        lblCustomerPhone = new javax.swing.JLabel();
        txtpostcode = new javax.swing.JTextField();
        txtCustomerPhone = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblCustomerPostcode = new javax.swing.JLabel();
        btnDeleteCustomer = new javax.swing.JButton();
        btn_Customer_Edit = new javax.swing.JButton();
        btnCustomerAdd = new javax.swing.JButton();
        lblCustomerTitle = new javax.swing.JLabel();
        btnProducts_Customers = new javax.swing.JButton();
        btnSupplier_Customer = new javax.swing.JButton();
        btnMainMenu_Customer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Customers");
        setLocation(new java.awt.Point(400, 100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);

        tblCustomerContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblCustomerContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerContentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {

            }
        });
        jScrollPane1.setViewportView(tblCustomerContent);

        lblCustomerID.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblCustomerID.setText("Name");

        lblCustomerName.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblCustomerName.setText("Address");

        lblCustomerAddress.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblCustomerAddress.setText("Postcode");

        lblCustomerPhone.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblCustomerPhone.setText("");

        lblCustomerPostcode.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblCustomerPostcode.setText("Phone");

        btnDeleteCustomer.setText("Delete Record");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        btn_Customer_Edit.setText("Update Record");
        btn_Customer_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Customer_EditActionPerformed(evt);
            }
        });

        btnCustomerAdd.setText("New Record");
        btnCustomerAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerAddActionPerformed(evt);
            }
        });

        lblCustomerTitle.setFont(new java.awt.Font("Calibri", 0, 36));
        lblCustomerTitle.setText("Customers");

        btnProducts_Customers.setText("Products");
        btnProducts_Customers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProducts_CustomersActionPerformed(evt);
            }
        });

        btnSupplier_Customer.setText("Supplier");
        btnSupplier_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplier_CustomerActionPerformed(evt);
            }
        });

        btnMainMenu_Customer.setText("Main Menu");
        btnMainMenu_Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenu_CustomerActionPerformed(evt);
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
                    .addComponent(btnSupplier_Customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Customer_Edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomerAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProducts_Customers, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMainMenu_Customer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerAddress)
                            .addComponent(lblCustomerName)
                            .addComponent(lblCustomerID)
                            .addComponent(lblCustomerPostcode)
                            .addComponent(lblCustomerPhone))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPhone)
                                .addComponent(txtpostcode)
                                .addComponent(txtaddress)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblback)
                        .addGap(31, 31, 31)
                        .addComponent(lblCustomerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(332, 332, 332))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(btnMainMenu_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSupplier_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProducts_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(lblback))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCustomerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerID)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnCustomerAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Customer_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustomerName)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustomerAddress)
                            .addComponent(txtpostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustomerPostcode)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustomerPhone)
                            .addComponent(txtCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
        setLocationRelativeTo(null);
    }//finish
    
    public String method(String Strin) //start
    {
    
      Strin = Strin.substring(0, Strin.length()-1);
    
    return Strin;
    }//finish
    private void tblCustomerContentMouseClicked(java.awt.event.MouseEvent evt) //start
    {                                                
        String CustomerID = tblCustomerContent.getValueAt(tblCustomerContent.getSelectedRow(),0).toString();
        String Name = tblCustomerContent.getValueAt(tblCustomerContent.getSelectedRow(),1).toString();
        String Address = tblCustomerContent.getValueAt(tblCustomerContent.getSelectedRow(),2).toString();
        String postcode = tblCustomerContent.getValueAt(tblCustomerContent.getSelectedRow(),3).toString();
        String phone = tblCustomerContent.getValueAt(tblCustomerContent.getSelectedRow(),4).toString();
        String last_update = tblCustomerContent.getValueAt(tblCustomerContent.getSelectedRow(),5).toString();

        txtName.setText(Name);
        txtaddress.setText(Address);
        txtpostcode.setText(postcode);
        txtPhone.setText(phone);
        txtCustomerPhone.setText(CustomerID);
    }//finish

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                 
        String[] option = {"YES","NO"};

        int answer = JOptionPane.showOptionDialog(null, "Sure To Delete?", "DELETED", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);

        if(answer==0){

            int index = tblCustomerContent.getSelectedRow();
            String Name =tblCustomerContent.getValueAt(index,1).toString();
            if(new CustomersUpdater().delete(Name)){

                JOptionPane.showMessageDialog(null,"Deleted");
                          retreive();
                txtName.setText("");
                txtaddress.setText("");
                txtpostcode.setText("");
                txtPhone.setText("");
                txtCustomerPhone.setText("");
                

            }
            else{
                JOptionPane.showMessageDialog(null,"not deleted");
            }
        }
    }//finish

    private void btn_Customer_EditActionPerformed(java.awt.event.ActionEvent evt) //start
    { 
        int index = tblCustomerContent.getSelectedRow();
        String id =tblCustomerContent.getValueAt(index,0).toString();
  

        if(new CustomersUpdater().update(id,txtName.getText() ,txtaddress.getText(),txtpostcode.getText(),txtPhone.getText(), txtCustomerPhone.getText())){

            JOptionPane.showMessageDialog(null,"updated");
            
            txtName.setText("");
            txtaddress.setText("");
            txtpostcode.setText("");
            txtPhone.setText("");
            txtCustomerPhone.setText("");


        }
        else{
            JOptionPane.showMessageDialog(null,"not updated");
        }
        retreive();
    } //finish
    
    private void btnCustomerAddActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                               
        AddCustomers a = new AddCustomers();
        a.setVisible(true);
        this.setVisible(false);
        retreive();
    }//finish

    private void btnProducts_CustomersActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                                      
        new Products().setVisible(true);
        this.setVisible(false);
    } //finish

    private void btnSupplier_CustomerActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                                     
        new Supplier().setVisible(true);
        this.setVisible(false);
    }//finish

    private void btnMainMenu_CustomerActionPerformed(java.awt.event.ActionEvent evt) //start
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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);  
            }
        });
    }//finish main

    
    //variables
    private javax.swing.JButton btnCustomerAdd;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnMainMenu_Customer;
    private javax.swing.JButton btnProducts_Customers;
    private javax.swing.JButton btnSupplier_Customer;
    private javax.swing.JButton btn_Customer_Edit;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblback;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerAddress;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerPhone;
    private javax.swing.JLabel lblCustomerPostcode;
    private javax.swing.JLabel lblCustomerTitle;
    private javax.swing.JTable tblCustomerContent;
    private javax.swing.JTextField txtpostcode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtCustomerPhone;
    private javax.swing.JTextField txtPhone;
}//finish class