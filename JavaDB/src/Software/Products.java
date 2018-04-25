package Software;
//imports
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Nate01
 */
public class Products extends javax.swing.JFrame //start class
{

/**
 *
 * @author Nate01
 */
    public Products() //start
    {
        initComponents();
        
        retreive();

    }//finish
    
    public void retreive()//start
    {
       DefaultTableModel dm = new ProductsUpdater().getData();
        
        tblProductsContent.setModel(dm);
    }//finish

    private void initComponents() //start
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductsContent = new javax.swing.JTable();
        lblback02 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblBarcode = new javax.swing.JLabel();
        txtProductsName = new javax.swing.JTextField();
        lblProductsType = new javax.swing.JLabel();
        lblProductsName = new javax.swing.JLabel();
        lblPriceBand02 = new javax.swing.JLabel();
        txtPriceBand01 = new javax.swing.JTextField();
        txtPriceBand02 = new javax.swing.JTextField();
        txtProductType = new javax.swing.JTextField();
        lblPriceBand01 = new javax.swing.JLabel();
        btnDeleteProduct = new javax.swing.JButton();
        btnProductsEdit = new javax.swing.JButton();
        btnProductAdd = new javax.swing.JButton();
        lblProductsTitle = new javax.swing.JLabel();
        btnCustomer_Products = new javax.swing.JButton();
        btnSupplier_Products = new javax.swing.JButton();
        btnMainMenu_Products = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Products");
        setLocation(new java.awt.Point(400, 100));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);

        tblProductsContent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblProductsContent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsContentMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {

            }
        });
        jScrollPane1.setViewportView(tblProductsContent);

        lblBarcode.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblBarcode.setText("Product Type");

        lblProductsType.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblProductsType.setText("Product Name");

        lblProductsName.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblProductsName.setText("Price Band 1");

        lblPriceBand02.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblPriceBand02.setText("");

        lblPriceBand01.setFont(new java.awt.Font("Tahoma", 0, 12));
        lblPriceBand01.setText("Price Band 2");

        btnDeleteProduct.setText("Delete Record");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductsActionPerformed(evt);
            }
        });

        btnProductsEdit.setText("Update Record");
        btnProductsEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Products_EditActionPerformed(evt);
            }
        });

        btnProductAdd.setText("New Record");
        btnProductAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductsAddActionPerformed(evt);
            }
        });

        lblProductsTitle.setFont(new java.awt.Font("Calibri", 0, 36));
        lblProductsTitle.setText("Products");

        btnCustomer_Products.setText("Customers");
        btnCustomer_Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomers_ProductsActionPerformed(evt);
            }
        });

        btnSupplier_Products.setText("Supplier");
        btnSupplier_Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplier_ProductsActionPerformed(evt);
            }
        });

        btnMainMenu_Products.setText("Main Menu");
        btnMainMenu_Products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenu_ProductsActionPerformed(evt);
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
                    .addComponent(btnSupplier_Products, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteProduct, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProductsEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomer_Products, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMainMenu_Products, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductsName)
                            .addComponent(lblProductsType)
                            .addComponent(lblBarcode)
                            .addComponent(lblPriceBand01)
                            .addComponent(lblPriceBand02))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPriceBand02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPhone)
                                .addComponent(txtPriceBand01)
                                .addComponent(txtProductsName)
                                .addComponent(txtProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblback02)
                        .addGap(31, 31, 31)
                        .addComponent(lblProductsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(332, 332, 332))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addComponent(btnMainMenu_Products, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSupplier_Products, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCustomer_Products, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(lblback02))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblProductsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBarcode)
                    .addComponent(txtProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnProductAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductsEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductsType)
                            .addComponent(txtProductsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductsName)
                            .addComponent(txtPriceBand01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPriceBand01)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPriceBand02)
                            .addComponent(txtPriceBand02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        pack();
        setLocationRelativeTo(null);
    }//finish
    
    public String method(String Strin) //start
    {
    
      Strin = Strin.substring(0, Strin.length()-1);
    
    return Strin;
    }//finish
    private void tblProductsContentMouseClicked(java.awt.event.MouseEvent evt) //start
    {                                                
        String Barcode = tblProductsContent.getValueAt(tblProductsContent.getSelectedRow(),0).toString();
        String Name = tblProductsContent.getValueAt(tblProductsContent.getSelectedRow(),1).toString();
        String Product_Name = tblProductsContent.getValueAt(tblProductsContent.getSelectedRow(),2).toString();
        String Price_Band01 = tblProductsContent.getValueAt(tblProductsContent.getSelectedRow(),3).toString();
        String Price_Band02 = tblProductsContent.getValueAt(tblProductsContent.getSelectedRow(),4).toString();
        String last_update = tblProductsContent.getValueAt(tblProductsContent.getSelectedRow(),5).toString();

        txtProductType.setText(Name);
        txtProductsName.setText(Product_Name);
        txtPriceBand01.setText(Price_Band01);
        txtPhone.setText(Price_Band02);
        txtPriceBand02.setText(Barcode);
    }//finish

    private void btnDeleteProductsActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                 
        String[] option = {"YES","NO"};

        int answer = JOptionPane.showOptionDialog(null, "Sure To Delete?", "DELETED", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[1]);

        if(answer==0){

            int index = tblProductsContent.getSelectedRow();
            String Name =tblProductsContent.getValueAt(index,0).toString();
            if(new ProductsUpdater().delete(Name)){

                JOptionPane.showMessageDialog(null,"Deleted");
                          retreive();
                txtProductType.setText("");
                txtProductsName.setText("");
                txtPriceBand01.setText("");
                txtPhone.setText("");
                txtPriceBand02.setText("");
                

            }
            else{
                JOptionPane.showMessageDialog(null,"not deleted");
            }
        }
    }//finish

    private void btn_Products_EditActionPerformed(java.awt.event.ActionEvent evt) //start
    { 
        int index = tblProductsContent.getSelectedRow();
        String id =tblProductsContent.getValueAt(index,0).toString();
  

        if(new ProductsUpdater().update(id,txtProductType.getText() ,txtProductsName.getText(),txtPriceBand01.getText(),txtPhone.getText(), txtPriceBand02.getText())){

            JOptionPane.showMessageDialog(null,"updated");
            
            txtProductType.setText("");
            txtProductsName.setText("");
            txtPriceBand01.setText("");
            txtPhone.setText("");
            txtPriceBand02.setText("");


        }
        else{
            JOptionPane.showMessageDialog(null,"not updated");
        }
        retreive();
    } //finish
    
    private void btnProductsAddActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                               
        AddProduct a = new AddProduct();
        a.setVisible(true);
        this.setVisible(false);
        retreive();
    }//finish

    private void btnCustomers_ProductsActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                                      
        new Customers().setVisible(true);
        this.setVisible(false);
    } //finish

    private void btnSupplier_ProductsActionPerformed(java.awt.event.ActionEvent evt) //start
    {                                                     
        new Supplier().setVisible(true);
        this.setVisible(false);
    }//finish

    private void btnMainMenu_ProductsActionPerformed(java.awt.event.ActionEvent evt) //start
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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);  
            }
        });
    }//finish main

    
    //variables
    private javax.swing.JButton btnProductAdd;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnMainMenu_Products;
    private javax.swing.JButton btnCustomer_Products;
    private javax.swing.JButton btnSupplier_Products;
    private javax.swing.JButton btnProductsEdit;
    private javax.swing.JLabel lblBarcode;
    private javax.swing.JLabel lblback02;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblProductsName;
    private javax.swing.JLabel lblProductsType;
    private javax.swing.JLabel lblPriceBand02;
    private javax.swing.JLabel lblPriceBand01;
    private javax.swing.JLabel lblProductsTitle;
    private javax.swing.JTable tblProductsContent;
    private javax.swing.JTextField txtPriceBand01;
    private javax.swing.JTextField txtProductType;
    private javax.swing.JTextField txtProductsName;
    private javax.swing.JTextField txtPriceBand02;
    private javax.swing.JTextField txtPhone;
}//finish class