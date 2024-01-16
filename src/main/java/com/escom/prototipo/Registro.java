package com.escom.prototipo;

import com.escom.prototipo.DAOs.Usuario;
import com.escom.prototipo.DTOs.UsuarioDto;
import static com.escom.prototipo.FormatoDenuncia.v;
import com.escom.validaciones.Validaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Damaris
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
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

        jButton1 = new javax.swing.JButton();
        RegistrarPanel = new javax.swing.JPanel();
        Registro = new javax.swing.JLabel();
        NombreField = new javax.swing.JTextField();
        PaternoField = new javax.swing.JTextField();
        MaternoField = new javax.swing.JTextField();
        CorreoField = new javax.swing.JTextField();
        NoEmpleadoField = new javax.swing.JTextField();
        EscuelaBox = new javax.swing.JComboBox<>();
        ContrasenaField = new javax.swing.JPasswordField();
        ContrasenaField2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RolBox = new javax.swing.JComboBox<>();
        RegistrarseBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        RegistrarPanel.setBackground(new java.awt.Color(249, 249, 249));

        Registro.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        Registro.setForeground(new java.awt.Color(255, 0, 0));
        Registro.setText("Registro");

        NombreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreFieldFocusLost(evt);
            }
        });

        PaternoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PaternoFieldFocusLost(evt);
            }
        });

        MaternoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                MaternoFieldFocusLost(evt);
            }
        });

        CorreoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CorreoFieldFocusLost(evt);
            }
        });

        NoEmpleadoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NoEmpleadoFieldFocusLost(evt);
            }
        });

        EscuelaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija su escuela", "CECYT 1", "CECYT 2", "CECYT 3", "CECYT 4", "CECYT 5", "CECYT 6", "CECYT 7", "CECYT 8", "CECYT 9", "CECYT 10", "CECYT 11", "CECYT 12", "CECYT 13", "CECYT 14", "CECYT 15", "CECYT 16", "CECYT 17", "CECYT 18", "CECYT 19", "CET 1", "CICS STO", "CICS UMA", "ENBA", "ENCB", "ENMYH", "ESCA STO", "ESCA TEPEPAN", "ESCOM", "ESE", "ESEO", "ESFM", "ESIME ZAC", "ESIME AZC", "ESIME CUL", "ESIME TIC", "ESIQIE", "ESIT", "ESIA TEC", "ESIA TIC", "ESIA ZAC", "ESM", "EST", "UPIIC", "UPIBI", "UPIIG", "UPIIZ", "UPIIH", "UPIIP", "UPIIT", "UPICSA", "UPIITA", "UPIEM" }));
        EscuelaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscuelaBoxActionPerformed(evt);
            }
        });

        ContrasenaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContrasenaFieldFocusLost(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno");

        jLabel4.setText("Correo electronico");

        jLabel5.setText("Número de empleado");

        jLabel6.setText("Escuela");

        jLabel7.setText("Ingrese su contraseña");

        jLabel8.setText("Confirme su contraseña");

        jLabel9.setText("Rol");

        RolBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija su rol", "Coordinador", "PAAE o Docente" }));
        RolBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RegistrarPanelLayout = new javax.swing.GroupLayout(RegistrarPanel);
        RegistrarPanel.setLayout(RegistrarPanelLayout);
        RegistrarPanelLayout.setHorizontalGroup(
            RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
            .addGroup(RegistrarPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistrarPanelLayout.createSequentialGroup()
                        .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addComponent(jLabel3))
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistrarPanelLayout.createSequentialGroup()
                                .addComponent(ContrasenaField2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarPanelLayout.createSequentialGroup()
                                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RolBox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ContrasenaField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(EscuelaBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 182, Short.MAX_VALUE)
                                        .addComponent(NoEmpleadoField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CorreoField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(MaternoField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(PaternoField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(NombreField, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(19, 19, 19))))
                    .addGroup(RegistrarPanelLayout.createSequentialGroup()
                        .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addContainerGap())))
        );
        RegistrarPanelLayout.setVerticalGroup(
            RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaternoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaternoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorreoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EscuelaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RolBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContrasenaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistrarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContrasenaField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(58, 58, 58))
        );

        RegistrarseBtn.setBackground(new java.awt.Color(206, 226, 240));
        RegistrarseBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        RegistrarseBtn.setText("Registrarse");
        RegistrarseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(249, 238, 249));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegistrarseBtn)
                        .addGap(26, 26, 26)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(RegistrarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(RegistrarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RegistrarseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EscuelaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscuelaBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_EscuelaBoxActionPerformed

    private void RegistrarseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseBtnActionPerformed
        Validaciones v = new Validaciones();
        String aux1 = NombreField.getText();
        String aux2 = PaternoField.getText();
        String aux3 = MaternoField.getText();
        String aux4 = CorreoField.getText();
        String aux5 = NoEmpleadoField.getText();
        String aux6 = (String) EscuelaBox.getSelectedItem();
        String aux7 = new String(ContrasenaField.getPassword());
        String aux8 = new String(ContrasenaField2.getPassword());
        String aux9 = (String) RolBox.getSelectedItem();

        if (aux1.isEmpty() || aux2.isEmpty() || aux3.isEmpty() || aux4.isEmpty() || aux5.isEmpty() || aux6.isEmpty() || aux7.isEmpty() || aux8.isEmpty() || aux9.isEmpty()) {
            System.out.println("Alguno de los espacios esta vacio");
            JOptionPane.showMessageDialog(null, "Alguno de los campos obligatorios esta vacío", "Campo vacío", JOptionPane.WARNING_MESSAGE);
        } else {

            if (!v.isEmail(aux4)) {
                JOptionPane.showMessageDialog(null, "Verifica que el correo ingresado cumpla con los requisitos necesarios", "Campo inválido", JOptionPane.WARNING_MESSAGE);

            } else if (!aux7.equals(aux8)) {
                System.out.println("Las contraseñas no coinciden");
                JOptionPane.showMessageDialog(null, "Los campos de las contraseñas no coinciden", "Campo incorrecto", JOptionPane.WARNING_MESSAGE);
            } else {

                UsuarioDto dto = new UsuarioDto();
                if (dto.saveUsuario(new Usuario(aux1, aux2, aux3, aux7, aux4, aux6, aux5, aux9))) {
                    InicioSesion in = new InicioSesion();
                    in.setVisible(true);
                    dispose();
                } else {
                    System.out.println("No se guardo al usuario");
                    JOptionPane.showMessageDialog(null, "Algo ocurrio el usuario no fue dado de alta", "Error", JOptionPane.WARNING_MESSAGE);

                }

            }
        }


    }//GEN-LAST:event_RegistrarseBtnActionPerformed

    private void NombreFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreFieldFocusLost
        if (!v.isLetters(NombreField.getText())) {
            JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras", "Campo invalido", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_NombreFieldFocusLost

    private void PaternoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PaternoFieldFocusLost
        if (!v.isLetters(PaternoField.getText()))
            JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_PaternoFieldFocusLost

    private void MaternoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MaternoFieldFocusLost
        if (!v.isLetters(MaternoField.getText()))
            JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_MaternoFieldFocusLost

    private void CorreoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CorreoFieldFocusLost
        if (!v.isEmail(CorreoField.getText()))
            JOptionPane.showMessageDialog(null, "Correo invalido", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_CorreoFieldFocusLost

    private void NoEmpleadoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NoEmpleadoFieldFocusLost
        if (!v.isLettersNumbers(NoEmpleadoField.getText()))
            JOptionPane.showMessageDialog(null, "El numero de empleado es invalido", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_NoEmpleadoFieldFocusLost

    private void ContrasenaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContrasenaFieldFocusLost
        if (!v.isLettersNumbers(new String(ContrasenaField.getPassword()))) {
            JOptionPane.showMessageDialog(null, "La contraseña tiene caracteres invalidos", "Campo invalido", JOptionPane.WARNING_MESSAGE);
        }
        if (ContrasenaField.getPassword().length < 8)
            JOptionPane.showMessageDialog(null, "La contraseña tiene que tener al menos 8 caracteres", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_ContrasenaFieldFocusLost

    private void RolBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RolBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ContrasenaField;
    private javax.swing.JPasswordField ContrasenaField2;
    private javax.swing.JTextField CorreoField;
    private javax.swing.JComboBox<String> EscuelaBox;
    private javax.swing.JTextField MaternoField;
    private javax.swing.JTextField NoEmpleadoField;
    private javax.swing.JTextField NombreField;
    private javax.swing.JTextField PaternoField;
    private javax.swing.JPanel RegistrarPanel;
    private javax.swing.JButton RegistrarseBtn;
    private javax.swing.JLabel Registro;
    private javax.swing.JComboBox<String> RolBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
