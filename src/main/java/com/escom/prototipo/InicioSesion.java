/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.escom.prototipo;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author Damaris
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent (this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        LogoPanel = new javax.swing.JPanel();
        OlvidasteConstrasenaBtn = new javax.swing.JButton();
        ConstrasenaField = new javax.swing.JPasswordField();
        LoginLabel = new javax.swing.JLabel();
        IngresarBtn = new javax.swing.JButton();
        UsuarioField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("InicioSesion");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        LogoPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout LogoPanelLayout = new javax.swing.GroupLayout(LogoPanel);
        LogoPanel.setLayout(LogoPanelLayout);
        LogoPanelLayout.setHorizontalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        LogoPanelLayout.setVerticalGroup(
            LogoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        OlvidasteConstrasenaBtn.setBackground(new java.awt.Color(242, 242, 242));
        OlvidasteConstrasenaBtn.setForeground(new java.awt.Color(0, 51, 255));
        OlvidasteConstrasenaBtn.setText("¿Olvidaste tu contraseña?");
        OlvidasteConstrasenaBtn.setBorder(null);
        OlvidasteConstrasenaBtn.setBorderPainted(false);
        OlvidasteConstrasenaBtn.setContentAreaFilled(false);
        OlvidasteConstrasenaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OlvidasteConstrasenaBtnActionPerformed(evt);
            }
        });

        ConstrasenaField.setText("jPasswordField1");

        LoginLabel.setFont(new java.awt.Font("Kokonor", 1, 18)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(51, 51, 255));
        LoginLabel.setText("Login");

        IngresarBtn.setBackground(new java.awt.Color(206, 226, 240));
        IngresarBtn.setText("Ingresar");

        UsuarioField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OlvidasteConstrasenaBtn)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConstrasenaField)
                            .addComponent(UsuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(IngresarBtn)
                        .addGap(18, 18, 18))
                    .addComponent(LogoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(LoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(UsuarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ConstrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OlvidasteConstrasenaBtn)
                    .addComponent(IngresarBtn))
                .addContainerGap())
        );

        LogoPanel.getAccessibleContext().setAccessibleName("Logo");
        UsuarioField.getAccessibleContext().setAccessibleName("Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(LoginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        LoginPanel.getAccessibleContext().setAccessibleName("LoginPanel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OlvidasteConstrasenaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OlvidasteConstrasenaBtnActionPerformed
        close();
        RecuperarContraseña rp = new RecuperarContraseña ();
        rp.setVisible(true);
    }//GEN-LAST:event_OlvidasteConstrasenaBtnActionPerformed

    private void UsuarioFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioFieldActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConstrasenaField;
    private javax.swing.JButton IngresarBtn;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPanel LogoPanel;
    private javax.swing.JButton OlvidasteConstrasenaBtn;
    private javax.swing.JTextField UsuarioField;
    // End of variables declaration//GEN-END:variables
}
