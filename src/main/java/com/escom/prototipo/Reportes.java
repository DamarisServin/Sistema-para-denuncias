/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.escom.prototipo;

import com.escom.prototipo.DAOs.Denuncia;
import com.escom.prototipo.DTOs.DenunciaDto;
import com.escom.prototipo.pdf.PdfGenerator;
import java.io.FileOutputStream;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author damar
 */
public class Reportes extends javax.swing.JFrame {

    DateFormat df;
    Date date;
    DefaultTableModel model;

    /**
     * Creates new form Reportes
     */
    public Reportes() {

        df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date = new Date();
        df.format(date);

        DenunciaDto dto = new DenunciaDto();
        model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Fecha Denuncia");
        model.addColumn("Nombre Denunciante");
        model.addColumn("Edad Denunciante");
        model.addColumn("Genero Denunciante");
        model.addColumn("Correo Denunciante");
        model.addColumn("Archivo PDF");

        ArrayList<Denuncia> list = dto.getAllDenuncians();
//        ArrayList<Date> date1 = dn.getDatesDenuncia();
//        ArrayList<Date> date2 = dn.getDatesHechos();
//        ArrayList<String> ids = dn.getIds();
//        ArrayList<String> anonimo = dn.getAnonimos();
//        String aux;

        for (Denuncia d : list) {

            //      model.addRow(new Object[] {ids.get(i),date1.get(i),date2.get(i),aux });
            model.addRow(new Object[]{
                d.getId(),
                d.getFecha(),
                d.getDd().getNombre_completo(),
                d.getDd().getEdad(),
                d.getDd().getGenero(),
                d.getDd().getCorreo(),
                "Descargar"
            });
        }

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();
        idFind = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Export = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(this.MAXIMIZED_BOTH);

        jLabel1.setFont(new java.awt.Font("Krungthep", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO");
        jLabel1.setToolTipText("");

        jTable1.setModel(model);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el id de la denuncia que desea consultar");

        Export.setText("Exportar a Excel");
        Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idFind, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Buscar)
                .addGap(41, 41, 41)
                .addComponent(Export)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(idFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Export))
                .addGap(42, 42, 42))
        );

        setBounds(0, 0, 718, 474);
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        new FormatoConsulta(idFind.getText()).setVisible(true);
        dispose();
    }//GEN-LAST:event_BuscarActionPerformed

    private void ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportActionPerformed
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Datos");

        // Obtener el modelo de la tabla
        TableModel tm = this.model;

        // Crear la fila de encabezado
        Row headerRow = sheet.createRow(0);
        for (int col = 0; col < tm.getColumnCount(); col++) {
            Cell cell = headerRow.createCell(col);
            cell.setCellValue(tm.getColumnName(col));
        }

        // Llenar el contenido de la tabla
        for (int row = 0; row < tm.getRowCount(); row++) {
            Row excelRow = sheet.createRow(row + 1);
            for (int col = 0; col < tm.getColumnCount(); col++) {
                Cell cell = excelRow.createCell(col);
                cell.setCellValue(tm.getValueAt(row, col).toString());
            }
        }

        // Escribir el libro de trabajo a un archivo Excel
        try (FileOutputStream outputStream = new FileOutputStream("output.xlsx")) {
            workbook.write(outputStream);
            System.out.println("Archivo Excel creado exitosamente en: " + "output.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_ExportActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.rowAtPoint(evt.getPoint());
        int col = jTable1.columnAtPoint(evt.getPoint());
        String str = jTable1.getModel().getValueAt(row, 0).toString();
        System.out.println(str);
        if (col == 6) {
            DenunciaDto dto = new DenunciaDto();
            
            PdfGenerator pdf = new PdfGenerator();
            pdf.createPDF("Denuncia"+str+".pdf", dto.getDatosDenunciaById(str));
        }
        System.out.println("Row: " + row + ", Column: " + col);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Export;
    private javax.swing.JTextField idFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
