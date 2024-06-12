/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.com.hyunseda.market.presentation;

import co.com.hyunseda.market.infra.Observer;
import co.com.hyunseda.market.market.ItemShoppingCart;
import co.com.hyunseda.market.market.Order;
import co.com.hyunseda.market.service.ShoppingCartService;
import co.com.hyunseda.patron.builder.Facturador;
import co.com.hyunseda.patron.builder.FirstThreeItemsandFourtDiscount;
import co.com.hyunseda.patron.builder.Invoicebuilder;
import co.com.hyunseda.patron.builder.SecondItemDiscount;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author X1605
 */
public class GUIShoppingCart extends javax.swing.JFrame implements Observer{

    private ShoppingCartService shoppingcarservice;
    /**
     * Creates new form ShoppingCar
     */
    public GUIShoppingCart(ShoppingCartService shoppingcarservice) {
       initComponents(); 
       this.shoppingcarservice = shoppingcarservice;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblShoppingCar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblShoppingCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblShoppingCar);

        jLabel1.setText("Carrito de compras");

        jLabel2.setText("Total:");

        lbTotal.setText(".");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jButton2.setText("Pagar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(lbTotal))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        lbTotal.setText(".");
        DefaultTableModel model = (DefaultTableModel) tblShoppingCar.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Order orden = new Order();
        orden.avanzar();
        orden.avanzar();
        orden.avanzar();
        
        Facturador factura = new Facturador();
        
        if(shoppingcarservice.getShoppingCar().getItems().get(0).getAmount()==2){
            System.out.println("entra+-----------------------------------");
            Invoicebuilder SecondItemDiscount = new SecondItemDiscount();
            
            factura.setInvoicebuilder(SecondItemDiscount);
            factura.constuirFactura(shoppingcarservice.getShoppingCar().getItems());
            //otra forma de implementar 
           // double imprimir=0;
          //  Factura guiFactura= new Factura(factura.getIncoice(),imprimir);
      //guiFactura.setVisible(true);
        }else{
            //falta validar los amount de cada item
            
           if(shoppingcarservice.getShoppingCar().getTotalItems()>=3){
               System.out.println("entra+-----------------------------------");
                       JOptionPane.showMessageDialog(null, "entro+++++++");

               Invoicebuilder FirstThreeItemsandFourtDiscount =new FirstThreeItemsandFourtDiscount();
               factura.setInvoicebuilder(FirstThreeItemsandFourtDiscount);
             factura.constuirFactura(shoppingcarservice.getShoppingCar().getItems());
             
           }
        }
        // lo comentamos para probar el patron builder
      //  GUIPago pago = new GUIPago(shoppingcarservice.calculateTotal()); 
      //  pago.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    @Override
   public void update(Object o) {
        System.out.println("Entra a uptade");
        shoppingcarservice = (ShoppingCartService)o;
        lbTotal.setText(String.valueOf(shoppingcarservice.calculateTotal()));
        fillTable(shoppingcarservice.getShoppingCar().getItems());
    }
    
    private void fillTable(List<ItemShoppingCart> listItems) {
        initializeTable();
        DefaultTableModel model = (DefaultTableModel) tblShoppingCar.getModel();

        Object rowData[] = new Object[3];//No columnas
        for (int i = 0; i < listItems.size(); i++) {
            rowData[0] = listItems.get(i).getProduct().getName();
            rowData[1] = listItems.get(i).getAmount();
            rowData[2] = listItems.get(i).getProduct().getPrice();
            //rowData[2] = listItems.get(i).getDescription();
            
            model.addRow(rowData);
        }
    }
    private void initializeTable() {
        tblShoppingCar.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Name", "Cantidad", "Precio"
                }
        ));
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tblShoppingCar;
    // End of variables declaration//GEN-END:variables
}
