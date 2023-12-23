
package com.escom.prototipo;

import com.escom.prototipo.DAOs.Centro_de_ayuda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class CentrosAyuda extends javax.swing.JFrame {

    DefaultTableModel model;
            
    public CentrosAyuda() {
        ArrayList<Centro_de_ayuda> list = (new Centro_de_ayuda()).getCentros();
        model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Direccion");
        model.addColumn("Contacto");
        model.addColumn("Especialidades");
        for(Centro_de_ayuda c : list){
        model.addRow(new Object[] {c.getNombre(),c.getDireccion(),c.getContacto(),c.getEspecialidad().toString()});
        }
//        model.addRow(new Object[]{"hola","hola","hola","hola"});
        initComponents();
        this.setLocationRelativeTo(null);
    }// fin public centrosayuda

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        Inicio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BCASalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TCA = new javax.swing.JTable();
        BCAMostrar = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CentrosAyuda");

        Inicio.setBackground(new java.awt.Color(206, 226, 240));
        Inicio.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Inicio.setText("Inicio");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Krungthep", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("CENTROS DE AYUDA");

        BCASalir.setBackground(new java.awt.Color(249, 238, 249));
        BCASalir.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        BCASalir.setForeground(new java.awt.Color(255, 0, 0));
        BCASalir.setText("Salir");
        BCASalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCASalirActionPerformed(evt);
            }
        });

        TCA.setModel(model);
        jScrollPane1.setViewportView(TCA);

        BCAMostrar.setBackground(new java.awt.Color(206, 226, 240));
        BCAMostrar.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BCAMostrar.setForeground(new java.awt.Color(216, 102, 20));
        BCAMostrar.setText("Mostrar");
        BCAMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCAMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BCAMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                                .addComponent(BCASalir)))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BCAMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCASalir))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:
        Bienvenido Bv = new Bienvenido();
        Bv.setVisible(true);
        dispose();
    }//GEN-LAST:event_InicioActionPerformed

    private void BCASalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCASalirActionPerformed
        // TODO add your handling code here:
        System.exit(WIDTH);
    }//GEN-LAST:event_BCASalirActionPerformed

    private void BCAMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCAMostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BCAMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(CentrosAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CentrosAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CentrosAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CentrosAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CentrosAyuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCAMostrar;
    private javax.swing.JButton BCASalir;
    private javax.swing.JButton Inicio;
    public javax.swing.JTable TCA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
