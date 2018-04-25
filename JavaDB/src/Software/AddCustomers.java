package Software;

//imports
import javax.swing.JOptionPane;
/**
 *
 * @author Nate01
 */
public class AddCustomers extends javax.swing.JFrame //start class
{
    public AddCustomers() //start
    {
        initComponents();
    }//finish

    private void initComponents() //start
    {

        jPanel1 = new javax.swing.JPanel();
        lblCustomerName = new javax.swing.JLabel();
        txtCustomer_ID = new javax.swing.JTextField();
        lblCustomerAddress = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblCustomerPostcode = new javax.swing.JLabel();
        lblCustomerPhone = new javax.swing.JLabel();
        txtCustomerPostcode = new javax.swing.JTextField();
        txtCustomerAddress = new javax.swing.JTextField();
        txtCustomerPhone = new javax.swing.JTextField();
        lblCustomertime = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAddCustomer = new javax.swing.JButton();
        lblCustomerTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowOpened(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCustomerName.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblCustomerName.setText("Name");

        lblCustomerAddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblCustomerAddress.setText("Address");

        lblCustomerPostcode.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        lblCustomerPostcode.setText("Postcode");

        lblCustomerPhone.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblCustomerPhone.setText("Phone");

        lblCustomertime.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblCustomertime.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCustomerAddress)
                            .addComponent(lblCustomerName)
                            .addComponent(lblCustomerPostcode)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCustomertime, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCustomerPostcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCustomer_ID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCustomerPhone, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerName)
                    .addComponent(txtCustomer_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerAddress)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerPostcode)
                    .addComponent(txtCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomertime))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnAddCustomer.setText("ADD Customer");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        lblCustomerTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        lblCustomerTitle.setText("Add Customers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lblCustomerTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblCustomerTitle)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        pack();
        setLocationRelativeTo(null);
    }//finish 
    
public void retrieve01(Customers customers)//start
{
    customers.retreive();
}//finish

    public void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                               
        String Name = txtCustomer_ID.getText();
        String address = txtCustomerName.getText();
        String postcode = txtCustomerAddress.getText();
        String phone=txtCustomerPostcode.getText();
        String Customer_ID= ("*");
        String last_Update = ("000000");
        


        if(new CustomersUpdater().add(Name, address, postcode, phone, last_Update)){
            
            JOptionPane.showMessageDialog(null,"Successfuly Inserted");
        }
        else{
            JOptionPane.showMessageDialog(null,"Not Saved");
            
        }
        Customers a = new Customers();
            a.setVisible(true);
            this.setVisible(false);

        
    }//finish
    
    static void main(String args[]) //start main
    {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomers().setVisible(true);
            }

        });
    }//finish main
    
//variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCustomerPostcode;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerAddress;
    private javax.swing.JLabel lblCustomertime;
    private javax.swing.JLabel lblCustomerPhone;
    private javax.swing.JLabel lblCustomerTitle;
    private javax.swing.JTextField txtCustomerAddress;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerPhone;
    private javax.swing.JTextField txtCustomerPostcode;
    private javax.swing.JTextField txtCustomer_ID;
}//finish class