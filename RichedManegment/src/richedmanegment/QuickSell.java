package richedmanegment;

import Bean.BuyItemBean;
import Common.FilterJtable;
import Common.MathOperation;
import DBAction.DBBuyItem;
import DBAction.DBQuickSellItem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuickSell extends javax.swing.JFrame {

    int id;
    int id_cart;

    public QuickSell() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.loadStockTable();
        FilterJtable n = new FilterJtable();
        n.FilterJtable(stockTable, searchStockTable);
        itemprice.setEditable(false);
        itemname.setEditable(false);
        sum.setEditable(false);
        DBQuickSellItem db = new DBQuickSellItem();
        db.deleteDataInAddToCart();
        deletecart.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MainLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        searchStockTable = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sellprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        itemprice = new javax.swing.JTextField();
        addtocart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        addtocarttable = new javax.swing.JTable();
        sum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        deletecart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quick Sell");

        MainLabel.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        MainLabel.setText("Sell");
        MainLabel.setToolTipText("");

        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item No", "Name", "Quantity", "Buy Prce", "SellPrice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        stockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stockTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stockTable);
        if (stockTable.getColumnModel().getColumnCount() > 0) {
            stockTable.getColumnModel().getColumn(1).setMinWidth(0);
            stockTable.getColumnModel().getColumn(1).setPreferredWidth(0);
            stockTable.getColumnModel().getColumn(1).setMaxWidth(0);
            stockTable.getColumnModel().getColumn(1).setHeaderValue("Item No");
            stockTable.getColumnModel().getColumn(4).setHeaderValue("Buy Prce");
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Stock Table");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Item Name :");

        itemname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Sell Price    :");

        sellprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Quantity    :");

        quantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Price         :");

        itemprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        addtocart.setBackground(new java.awt.Color(204, 0, 0));
        addtocart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addtocart.setForeground(new java.awt.Color(255, 255, 255));
        addtocart.setText("Add to Cart");
        addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartActionPerformed(evt);
            }
        });

        addtocarttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Item Price", "Quantity", "SellPrice"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        addtocarttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addtocarttableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(addtocarttable);

        sum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Totle Value    :");

        deletecart.setText("Delete");
        deletecart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1121, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(searchStockTable)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellprice))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(quantity))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addtocart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemprice)
                            .addComponent(deletecart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sum)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(MainLabel)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchStockTable, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sellprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(itemprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(addtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deletecart, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stockTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
        DBBuyItem db = new DBBuyItem();
        int selectedRowIndex = stockTable.getSelectedRow();
        id = (int) model.getValueAt(selectedRowIndex, 0);

        ArrayList<BuyItemBean> dataList = db.getSelectedData(id);
        BuyItemBean bean = dataList.get(0);
        itemname.setText(bean.getItemName());
        sellprice.setText(Double.toString(bean.getSellPrice()));
        itemprice.setText("");
        quantity.setText("");
        deletecart.setEnabled(false);
    }//GEN-LAST:event_stockTableMouseClicked

    private void quantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyReleased
        this.calculateItemPrice();
    }//GEN-LAST:event_quantityKeyReleased

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityActionPerformed

    private void addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartActionPerformed
        this.addToCart();
    }//GEN-LAST:event_addtocartActionPerformed

    private void addtocarttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addtocarttableMouseClicked
        DefaultTableModel model = (DefaultTableModel) addtocarttable.getModel();
        int selectedRowIndex = addtocarttable.getSelectedRow();
        id_cart = (int) model.getValueAt(selectedRowIndex, 0);
        deletecart.setEnabled(true);
    }//GEN-LAST:event_addtocarttableMouseClicked

    private void deletecartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecartActionPerformed
        boolean succ = new DBQuickSellItem().DeleteStock(id_cart);
        if (succ) {
                JOptionPane.showMessageDialog(new JFrame(), "Deleted Details Succsess");
                this.setClean();
                this.loadCartTable();
                this.calulateTableSumSell();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Not Delete");
            }
    }//GEN-LAST:event_deletecartActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuickSell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuickSell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuickSell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuickSell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuickSell().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainLabel;
    private javax.swing.JButton addtocart;
    private javax.swing.JTable addtocarttable;
    private javax.swing.JButton deletecart;
    private javax.swing.JTextField itemname;
    private javax.swing.JTextField itemprice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField searchStockTable;
    private javax.swing.JTextField sellprice;
    private javax.swing.JTable stockTable;
    private javax.swing.JTextField sum;
    // End of variables declaration//GEN-END:variables
    public void loadStockTable() {
        DefaultTableModel model = (DefaultTableModel) stockTable.getModel();
        model.setRowCount(0);
        DBBuyItem db = new DBBuyItem();
        ArrayList<BuyItemBean> dataList = db.getTableData();
        Object rowData[] = new Object[6];
        for (int i = 0; dataList != null && i < dataList.size(); i++) {
            BuyItemBean bean = dataList.get(i);
            rowData[0] = bean.getId();
            rowData[1] = bean.getItemNo();
            rowData[2] = bean.getItemName();
            rowData[3] = bean.getItemQuantity();
            rowData[4] = bean.getBuyPrice();
            rowData[5] = bean.getSellPrice();
            model.addRow(rowData);
        }
    }

    private void calculateItemPrice() {
        Double item_price = 0.0;
        String sell_price = sellprice.getText();
        String quantityy = quantity.getText();
        item_price = Double.parseDouble(sell_price) * Double.parseDouble(quantityy);
        itemprice.setText(String.valueOf(item_price));
    }

    private void addToCart() {
        try {
            BuyItemBean bean = new BuyItemBean();
            bean.setId(id);
            bean.setItemQuantity(quantity.getText());
            bean.setSellPrice(Double.parseDouble(itemprice.getText()));
            bean.setBuyPrice(Double.parseDouble(sellprice.getText()));
            DBQuickSellItem db = new DBQuickSellItem();
            boolean succ = db.saveAddToCardToDB(bean);
            if (succ) {
                JOptionPane.showMessageDialog(new JFrame(), "Add TO CART Succsess");
                this.setClean();
                this.loadCartTable();
                this.calulateTableSumSell();
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Add TO CART Not Succsess");
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuickSell.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setClean() {
        itemname.setText("");
        sellprice.setText("");
        quantity.setText("");
        itemprice.setText("");
    }

    private void loadCartTable() {
        DefaultTableModel model = (DefaultTableModel) addtocarttable.getModel();
        model.setRowCount(0);
        DBQuickSellItem db = new DBQuickSellItem();
        ArrayList<BuyItemBean> dataList = db.getAddToCartTableData();
        Object rowData[] = new Object[6];
        for (int i = 0; dataList != null && i < dataList.size(); i++) {
            BuyItemBean bean = dataList.get(i);
            rowData[0] = bean.getId();
            rowData[1] = bean.getItemName();
            rowData[2] = bean.getBuyPrice();
            rowData[3] = bean.getItemQuantity();
            rowData[4] = bean.getSellPrice();
            model.addRow(rowData);
        }
    }

    private void calulateTableSumSell() {
        DefaultTableModel model = (DefaultTableModel) addtocarttable.getModel();
        int numberOfRaw = model.getRowCount();
        double total = 0;
        for (int i = 0; i < numberOfRaw; i++) {
            double value = Double.valueOf(model.getValueAt(i, 4).toString());
            total += value;
        }
        sum.setText(Double.toString(total));
    }

}
