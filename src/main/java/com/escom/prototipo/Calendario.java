package com.escom.prototipo;

import com.escom.prototipo.DTOs.DenunciaDto;
import com.toedter.calendar.IDateEvaluator;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;

public class Calendario extends javax.swing.JFrame {

    public Calendario() {
        initComponents();
    }

    public void clickedOnDay(PropertyChangeEvent evt) {
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        com.toedter.calendar.JCalendar jCalendar = new com.toedter.calendar.JCalendar();
        Bic = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(this.MAXIMIZED_BOTH);

        HighlightEvaluator evaluator = new HighlightEvaluator();
        evaluator.add();
        jCalendar.getDayChooser().addDateEvaluator(evaluator);
        jCalendar.setCalendar(jCalendar.getCalendar());
        jCalendar.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener(){
            @Override
            public void propertyChange(PropertyChangeEvent evt){
                System.out.println(jCalendar.getDate());
                clickedOnDay(evt);

            }
        });

        Bic.setBackground(new java.awt.Color(206, 226, 240));
        Bic.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Bic.setText("Inicio");
        Bic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bic)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bic)
                .addGap(22, 22, 22))
        );

        setBounds(0, 0, 636, 389);
    }// </editor-fold>//GEN-END:initComponents

    private void BicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BicActionPerformed
        // TODO add your handling code here:
        Bienvenido bI = new Bienvenido();
        bI.setVisible(true);
        dispose();
    }//GEN-LAST:event_BicActionPerformed

    private static class HighlightEvaluator implements IDateEvaluator {

        private DenunciaDto dto=new DenunciaDto();
        private final List<Date> list = new ArrayList<>();

        public void add() {
            list.addAll(dto.getDates());
        }

        @Override
        public boolean isSpecial(Date date) {
            return list.contains(date);
        }

        @Override
        public Color getSpecialForegroundColor() {
            return Color.red.darker();
        }

        @Override
        public Color getSpecialBackroundColor() {
            return Color.BLUE;
        }

        @Override
        public String getSpecialTooltip() {
            return "Denuncia";
        }

        @Override
        public boolean isInvalid(Date date) {
            return false;
        }

        @Override
        public Color getInvalidForegroundColor() {
            return null;
        }

        @Override
        public Color getInvalidBackroundColor() {
            return null;
        }

        @Override
        public String getInvalidTooltip() {
            return null;
        }
    }

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
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bic;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
