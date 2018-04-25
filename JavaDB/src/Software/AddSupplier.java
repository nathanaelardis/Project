package Software;

//imports
import javax.swing.JOptionPane;
/**
 *
 * @author Nate01
 */
public class AddSupplier extends javax.swing.JFrame //start class
{
    public AddSupplier() //start
    {
        initComponents();
    }//finish

    private void initComponents() //start
    {

        jPanel1 = new javax.swing.JPanel();
        lblSupplierName = new javax.swing.JLabel();
        txtSupplier_ID = new javax.swing.JTextField();
        lblSupplierPostcode = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        lblSupplierPhone = new javax.swing.JLabel();
        lblSupplierEmail = new javax.swing.JLabel();
        txtSupplierPhone = new javax.swing.JTextField();
        txtSupplierPostcode = new javax.swing.JTextField();
        txtSupplierEmail = new javax.swing.JTextField();
        lblSupplierTime = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAddSupplier = new javax.swing.JButton();
        lblSupplierTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowOpened(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblSupplierName.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblSupplierName.setText("Name");

        lblSupplierPostcode.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblSupplierPostcode.setText("Postcode");

        lblSupplierPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        lblSupplierPhone.setText("Phone");

        lblSupplierEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblSupplierEmail.setText("Email Address");

        lblSupplierTime.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblSupplierTime.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSupplierPostcode)
                            .addComponent(lblSupplierName)
                            .addComponent(lblSupplierPhone)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSupplierEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSupplierTime, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtSupplierPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSupplierPostcode, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSupplier_ID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSupplierEmail, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierName)
                    .addComponent(txtSupplier_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplierPostcode)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSupplierPhone)
                    .addComponent(txtSupplierPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSupplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSupplierEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSupplierTime))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnAddSupplier.setText("ADD Supplier");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });

        lblSupplierTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        lblSupplierTitle.setText("Add Supplier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lblSupplierTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btnAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblSupplierTitle)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        pack();
        setLocationRelativeTo(null);
    }//finish 
    
public void retrieve01(Supplier supplier)//start
{
    supplier.retreive();
}//finish

    public void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                               
        String Name = txtSupplier_ID.getText();
        String Postcode = txtSupplierName.getText();
        String Phone = txtSupplierPostcode.getText();
        String Email_Address=txtSupplierPhone.getText();
        String Supplier_ID= ("*");
        String last_Update = ("000000");
        


        if(new SupplierUpdater().add(Name, Postcode, Phone, Email_Address, last_Update)){
            
            JOptionPane.showMessageDialog(null,"Successfuly Inserted");
        }
        else{
            JOptionPane.showMessageDialog(null,"Not Saved");
            
        }
        Supplier a = new Supplier();
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
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSupplier().setVisible(true);
            }

        });
    }//finish main
    
//variables
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSupplierPhone;
    private javax.swing.JLabel lblSupplierName;
    private javax.swing.JLabel lblSupplierPostcode;
    private javax.swing.JLabel lblSupplierTime;
    private javax.swing.JLabel lblSupplierEmail;
    private javax.swing.JLabel lblSupplierTitle;
    private javax.swing.JTextField txtSupplierPostcode;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtSupplierEmail;
    private javax.swing.JTextField txtSupplierPhone;
    private javax.swing.JTextField txtSupplier_ID;
}//finish class