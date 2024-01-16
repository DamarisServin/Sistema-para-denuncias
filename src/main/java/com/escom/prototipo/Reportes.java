package com.escom.prototipo;

import com.escom.prototipo.DAOs.Estadisticas;
import com.escom.prototipo.DTOs.DenunciaDto;
import com.toedter.calendar.IDateEvaluator;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import java.util.Date;
import java.util.List;



public class Reportes extends javax.swing.JFrame {

   boolean isCoordinador;
    
    public Reportes(boolean b) {
        isCoordinador = b;
        initComponents();
        DenunciaDto dto = new DenunciaDto();
        Estadisticas es = dto.getEstadisticaAll();
        t1.setText(es.getTotal()+"");
        t2.setText(es.getMenores()+"");
        t3.setText(es.getFemeninos()+"");
        t4.setText(es.getMasculinos()+"");
        t5.setText(es.getAnonimos()+"");
        t6.setText(es.getAlumnos()+"");
        t7.setText(es.getTrabajadores()+"");
        t8.setText(es.getMedios()+"");
        t9.setText(es.getTestigos()+"");
        t10.setText(es.getUnidades()+"");

        es = dto.getEstadisticaSemestral();
        s1.setText(es.getTotal()+"");
        s2.setText(es.getMenores()+"");
        s3.setText(es.getFemeninos()+"");
        s4.setText(es.getMasculinos()+"");
        s5.setText(es.getAnonimos()+"");
        s6.setText(es.getAlumnos()+"");
        s7.setText(es.getTrabajadores()+"");
        s8.setText(es.getMedios()+"");
        s9.setText(es.getTestigos()+"");
        s10.setText(es.getUnidades()+"");        

        es = dto.getEstadisticaBimestral();
        b1.setText(es.getTotal()+"");
        b2.setText(es.getMenores()+"");
        b3.setText(es.getFemeninos()+"");
        b4.setText(es.getMasculinos()+"");
        b5.setText(es.getAnonimos()+"");
        b6.setText(es.getAlumnos()+"");
        b7.setText(es.getTrabajadores()+"");
        b8.setText(es.getMedios()+"");
        b9.setText(es.getTestigos()+"");
        b10.setText(es.getUnidades()+"");       
        
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
        tp = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        t12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        s9 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        s10 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        s6 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        s7 = new javax.swing.JLabel();
        s2 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        s3 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        s8 = new javax.swing.JLabel();
        s4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        b3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        b5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        b6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        b7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        b8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        b9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        b10 = new javax.swing.JLabel();

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

        tp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setText("Denuncias con Testigos");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel22.setText("Denuncias Anonimas");

        t9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        t5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel25.setText("Unidades diferentes presentadas");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel26.setText("Alumnos");

        t10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel28.setText("Total de Denuncias");

        t6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        t1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel31.setText("Trabajadores");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel32.setText("Menores de Edad");

        t7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        t2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel35.setText("Género Femenino");

        t3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel37.setText("Denuncias con Medios Probatorios");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel38.setText("Género Masculino");

        t8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        t4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        t11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        t12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel26)
                    .addComponent(jLabel22)
                    .addComponent(jLabel38)
                    .addComponent(jLabel35)
                    .addComponent(jLabel28)
                    .addComponent(jLabel32)
                    .addComponent(jLabel25)
                    .addComponent(jLabel21)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t7)
                    .addComponent(t6)
                    .addComponent(t5)
                    .addComponent(t4)
                    .addComponent(t3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(t1)
                        .addComponent(t2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(t8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(t9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(t10, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(202, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(t12)
                        .addComponent(t11))
                    .addContainerGap(271, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(t1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(t2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(t3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(t4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(t5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(t6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(t7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(t8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(t9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(t10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(260, Short.MAX_VALUE)
                    .addComponent(t12)
                    .addGap(142, 142, 142)
                    .addComponent(t11)
                    .addGap(52, 52, 52)))
        );

        tp.addTab("Todas las Denuncias", jPanel2);

        jLabel41.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel41.setText("Denuncias con Testigos");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel42.setText("Denuncias Anonimas");

        s9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        s5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel45.setText("Unidades diferentes presentadas");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel46.setText("Alumnos");

        s10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel48.setText("Total de Denuncias");

        s6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        s1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel51.setText("Trabajadores");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel52.setText("Menores de Edad");

        s7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        s2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel55.setText("Género Femenino");

        s3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel57.setText("Denuncias con Medios Probatorios");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel58.setText("Género Masculino");

        s8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        s4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jLabel46)
                    .addComponent(jLabel42)
                    .addComponent(jLabel58)
                    .addComponent(jLabel55)
                    .addComponent(jLabel48)
                    .addComponent(jLabel52)
                    .addComponent(jLabel45)
                    .addComponent(jLabel41)
                    .addComponent(jLabel57))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s7)
                    .addComponent(s6)
                    .addComponent(s5)
                    .addComponent(s4)
                    .addComponent(s3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(s1)
                        .addComponent(s2))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(s8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(s9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(s10, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(s1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(s2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(s3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(s4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(s5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(s6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(s7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(s8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(s9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(s10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp.addTab("Ultimo Semestre", jPanel3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Total de Denuncias");

        b1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Menores de Edad");

        b2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Género Femenino");

        b3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Género Masculino");

        b4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Denuncias Anonimas");

        b5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setText("Alumnos");

        b6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Trabajadores");

        b7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Denuncias con Medios Probatorios");

        b8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("Denuncias con Testigos");

        b9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setText("Unidades diferentes presentadas");

        b10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7)
                    .addComponent(b6)
                    .addComponent(b5)
                    .addComponent(b4)
                    .addComponent(b3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b1)
                        .addComponent(b2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(b8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(b10, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(b1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(b2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(b3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(b4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(b5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(b6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(b7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(b8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(b9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(b10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp.addTab("Ultimo Bimestre", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bic)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Bic)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setBounds(0, 0, 920, 588);
    }// </editor-fold>//GEN-END:initComponents

    private void BicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BicActionPerformed
        // TODO add your handling code here:
        Bienvenido bI = new Bienvenido(isCoordinador);
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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes(true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bic;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b10;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JLabel b5;
    private javax.swing.JLabel b6;
    private javax.swing.JLabel b7;
    private javax.swing.JLabel b8;
    private javax.swing.JLabel b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel s1;
    private javax.swing.JLabel s10;
    private javax.swing.JLabel s2;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s6;
    private javax.swing.JLabel s7;
    private javax.swing.JLabel s8;
    private javax.swing.JLabel s9;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t10;
    private javax.swing.JLabel t11;
    private javax.swing.JLabel t12;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    private javax.swing.JTabbedPane tp;
    // End of variables declaration//GEN-END:variables

}
