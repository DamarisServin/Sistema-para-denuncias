
package com.escom.prototipo;

import com.escom.prototipo.DTOs.UsuarioDto;
import com.escom.prototipo.email.EmailSender;
import com.escom.validaciones.Validaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Damaris
 */
public class RecuperarContraseña extends javax.swing.JFrame {

    /**
     * Creates new form RecuperarContraseña
     */
    public RecuperarContraseña() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RecuperarPanel = new javax.swing.JPanel();
        RecuperarLabel = new javax.swing.JLabel();
        CorreoField = new javax.swing.JTextField();
        RecuperarBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        BRRC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        RecuperarLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        RecuperarLabel.setText("Recuperar Contraseña");

        CorreoField.setText("Ingrese su correo");
        CorreoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoFieldActionPerformed(evt);
            }
        });

        RecuperarBtn.setBackground(new java.awt.Color(153, 204, 255));
        RecuperarBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        RecuperarBtn.setForeground(new java.awt.Color(255, 0, 51));
        RecuperarBtn.setText("Recupera contraseña");
        RecuperarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecuperarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RecuperarPanelLayout = new javax.swing.GroupLayout(RecuperarPanel);
        RecuperarPanel.setLayout(RecuperarPanelLayout);
        RecuperarPanelLayout.setHorizontalGroup(
            RecuperarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecuperarPanelLayout.createSequentialGroup()
                .addGroup(RecuperarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RecuperarPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CorreoField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RecuperarPanelLayout.createSequentialGroup()
                        .addGroup(RecuperarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RecuperarPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(RecuperarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RecuperarPanelLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(RecuperarBtn)))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RecuperarPanelLayout.setVerticalGroup(
            RecuperarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecuperarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RecuperarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CorreoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(RecuperarBtn)
                .addGap(21, 21, 21))
        );

        jButton1.setBackground(new java.awt.Color(249, 238, 249));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BRRC.setBackground(new java.awt.Color(230, 253, 225));
        BRRC.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BRRC.setForeground(new java.awt.Color(204, 0, 204));
        BRRC.setText("Regresar");
        BRRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRRCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(RecuperarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BRRC)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(RecuperarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BRRC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CorreoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoFieldActionPerformed

    private void RecuperarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecuperarBtnActionPerformed
       Validaciones v = new Validaciones();
       UsuarioDto dto = new UsuarioDto();
       String correo = CorreoField.getText();
       String psw = v.generateRandomString();
       if(v.isEmail(correo)){
           
           dto.cambiarContrasena(correo, psw );
           EmailSender es = new EmailSender();
           es.setTo(correo);
           es.setNewPasMsg(psw);

           if (es.sendMail())
                JOptionPane.showMessageDialog(null, "Se envio un mensaje al correo proporcionado!", "Correo Enviado", JOptionPane.WARNING_MESSAGE);
       }else{
            JOptionPane.showMessageDialog(null, "El correo proporcionado no cumple con el formato correcto", "Campo vacío", JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_RecuperarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BRRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRRCActionPerformed
        // TODO add your handling code here:
        InicioSesion Rci = new InicioSesion();
        Rci.setVisible(true);
        dispose();
    }//GEN-LAST:event_BRRCActionPerformed

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
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BRRC;
    private javax.swing.JTextField CorreoField;
    private javax.swing.JButton RecuperarBtn;
    private javax.swing.JLabel RecuperarLabel;
    private javax.swing.JPanel RecuperarPanel;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
