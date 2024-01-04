/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.escom.prototipo;

/**
 *
 * @author Damaris
 */
public class Bienvenido extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenido
     */
    public Bienvenido() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        Bienvenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BDenuncia = new javax.swing.JButton();
        BReportes = new javax.swing.JButton();
        BCentros = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        BBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido");

        jLabel1.setFont(new java.awt.Font("Krungthep", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("BIENVENIDO");

        BDenuncia.setBackground(new java.awt.Color(206, 226, 240));
        BDenuncia.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BDenuncia.setText("Denuncia");
        BDenuncia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BDenuncia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDenunciaActionPerformed(evt);
            }
        });

        BReportes.setBackground(new java.awt.Color(206, 226, 240));
        BReportes.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BReportes.setText("Reportes");
        BReportes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReportesActionPerformed(evt);
            }
        });

        BCentros.setBackground(new java.awt.Color(206, 226, 240));
        BCentros.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BCentros.setText("Centros de ayuda");
        BCentros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCentrosActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Bodoni 72 Oldstyle", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 51, 102));
        label1.setText("<html>PROTOTIPO PARA LA COORDINACIÓN Y EL SEGUIMIENTO DE DENUNCIAS POR VIOLENCIA DE GÉNERO EN LA ESCOM<html>");

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/montes/Library/CloudStorage/OneDrive-InstitutoPolitecnicoNacional/TTR/2024-1/Proyecto/PROYECT 3/Sin título/src/main/java/com/escom/prototipo/logi.png")); // NOI18N

        BBSalir.setBackground(new java.awt.Color(249, 238, 249));
        BBSalir.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        BBSalir.setForeground(new java.awt.Color(255, 0, 0));
        BBSalir.setText("Salir");
        BBSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BienvenidoLayout = new javax.swing.GroupLayout(Bienvenido);
        Bienvenido.setLayout(BienvenidoLayout);
        BienvenidoLayout.setHorizontalGroup(
            BienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BienvenidoLayout.createSequentialGroup()
                .addGroup(BienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BienvenidoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(BReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)
                        .addGroup(BienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BCentros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(BienvenidoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BienvenidoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(350, 350, 350))
        );
        BienvenidoLayout.setVerticalGroup(
            BienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BienvenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(BienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BienvenidoLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(BienvenidoLayout.createSequentialGroup()
                        .addGroup(BienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BDenuncia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BCentros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(BBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReportesActionPerformed
        // TODO add your handling code here:
        Calendario Cl = new Calendario();
        Cl.setVisible(true);
        dispose();
    }//GEN-LAST:event_BReportesActionPerformed

    private void BBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBSalirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_BBSalirActionPerformed

    private void BDenunciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDenunciaActionPerformed
        // TODO add your handling code here:
        //this.setVisible(true);
        FormatoDenuncia Fd = new FormatoDenuncia();
        Fd.setVisible(true);
    }//GEN-LAST:event_BDenunciaActionPerformed

    private void BCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCentrosActionPerformed
        // TODO add your handling code here:
        CentrosAyuda Ca = new CentrosAyuda();
        Ca.setVisible(true);
        dispose();
    }//GEN-LAST:event_BCentrosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBSalir;
    private javax.swing.JButton BCentros;
    private javax.swing.JButton BDenuncia;
    private javax.swing.JButton BReportes;
    private javax.swing.JPanel Bienvenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
