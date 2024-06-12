/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.com.hyunseda.market.presentation;

import co.com.hyunseda.market.access.FactoryCategory;
import co.com.hyunseda.market.access.FactoryProduct;
import co.com.hyunseda.market.access.ICategoryRepository;
import co.com.hyunseda.market.access.IProductRepository;
import co.com.hyunseda.market.service.CategoryService;
import co.com.hyunseda.market.service.ProductService;
import com.raven.main.GUIMain;
import com.unicauca.clientuserhttpclient.presentation.LOGIN;

/**
 *
 * @author Felipe Castro
 */
public class GUIInicio extends javax.swing.JFrame {
    /**
     * Creates new form GUIInicio
     */
        
    private CategoryService categoryService ;
    private ProductService productService ;
    
    
    public GUIInicio(CategoryService categoryService , ProductService productService ) {
        initComponents();
        this.categoryService = categoryService;
        this.productService = productService;
                
        //setVisible(true); mio
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(550, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 100));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        jPanel1Layout.rowHeights = new int[] {0};
        jPanel1.setLayout(jPanel1Layout);

        jButton1.setText("Visitante");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuestActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jButton1, gridBagConstraints);

        jButton3.setText("Editor");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jButton3, gridBagConstraints);

        jButton2.setText("Administrador");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministratorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jButton2, gridBagConstraints);

        jButton4.setText("Super Administrador");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuperAdminActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 0;
        jPanel1.add(jButton4, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuestActionPerformed
        // TODO add your handling code here:
        GUIGuest visitante = new GUIGuest( productService);
        visitante.setVisible(true);
        GUIMain mai = new GUIMain(productService);
         mai.setVisible(true);
         
        
    }//GEN-LAST:event_btnGuestActionPerformed

    private void btnAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministratorActionPerformed
        //setVisible(false); mio
        //uniciamos el login para validar que sea un administrador
        LOGIN instanceLogin = new LOGIN();
        instanceLogin.setVisible(true);
        
        //esto aun no esto va dentro del login para que lo abra cuando se valido con su token 
      /*  GUIAdmin instance = new GUIAdmin(categoryService, productService);
        instance.setVisible(true);*/
        
         
    }//GEN-LAST:event_btnAdministratorActionPerformed

    private void btnEditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditorActionPerformed

    private void btnSuperAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuperAdminActionPerformed
        // TODO add your handling code here 
        //validando registro con spring scurity
        
        LOGIN instanceLogin = new LOGIN();
        instanceLogin.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnSuperAdminActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
