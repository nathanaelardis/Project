package Software;

//imports
import javax.swing.JOptionPane;
/**
 *
 * @author Nate01
 */
public class AddProduct extends javax.swing.JFrame //start class
{
    public AddProduct() //start
    {
        initComponents();
    }//finish

    private void initComponents() //start
    {

        jPanel1 = new javax.swing.JPanel();
        lblProductsType = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        lblProductsName = new javax.swing.JLabel();
        txtProductsType = new javax.swing.JTextField();
        lblPriceband01 = new javax.swing.JLabel();
        lblPriceBand02 = new javax.swing.JLabel();
        txtPriceBand01 = new javax.swing.JTextField();
        txtProductsName = new javax.swing.JTextField();
        txtPriceBand02 = new javax.swing.JTextField();
        lblProductstime = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAddProducts = new javax.swing.JButton();
        lblProductsTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {

            public void windowOpened(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProductsType.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblProductsType.setText("Product Type ");

        lblProductsName.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblProductsName.setText("Product Name");

        lblPriceband01.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        lblPriceband01.setText("Price Band 1");

        lblPriceBand02.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblPriceBand02.setText("Price Band 2");

        lblProductstime.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lblProductstime.setText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductsName)
                            .addComponent(lblProductsType)
                            .addComponent(lblPriceband01)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPriceBand02, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProductstime, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPriceBand01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txtProductsType, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProductsName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPriceBand02, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductsType)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductsName)
                    .addComponent(txtProductsType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPriceband01)
                    .addComponent(txtProductsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPriceBand01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPriceBand02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPriceBand02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductstime))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnAddProducts.setText("ADD Products");
        btnAddProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductsActionPerformed(evt);
            }
        });

        lblProductsTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        lblProductsTitle.setText("Add Products");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(lblProductsTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btnAddProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblProductsTitle)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        pack();
        setLocationRelativeTo(null);
    }//finish 
    
public void retrieve02(Products products)//start
{
    products.retreive();
}//finish

    public void btnAddProductsActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                               
        String Product_Type = txtBarcode.getText();
        String Product_Name = txtProductsType.getText();
        String Price_Band1 = txtProductsName.getText();
        String Price_Band2=txtPriceBand01.getText();
        String Barcode= ("*");
        String last_Update = ("000000");
        


        if(new ProductsUpdater().add(Product_Type, Product_Name, Price_Band1, Price_Band2, last_Update)){
            
            JOptionPane.showMessageDialog(null,"Successfuly Inserted");
        }
        else{
            JOptionPane.showMessageDialog(null,"Not Saved");
            
        }
        Products a = new Products();
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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }

        });
    }//finish main
    
//variables
    private javax.swing.JButton btnAddProducts;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPriceband01;
    private javax.swing.JLabel lblProductsType;
    private javax.swing.JLabel lblProductsName;
    private javax.swing.JLabel lblProductstime;
    private javax.swing.JLabel lblPriceBand02;
    private javax.swing.JLabel lblProductsTitle;
    private javax.swing.JTextField txtProductsName;
    private javax.swing.JTextField txtProductsType;
    private javax.swing.JTextField txtPriceBand02;
    private javax.swing.JTextField txtPriceBand01;
    private javax.swing.JTextField txtBarcode;
}//finish class