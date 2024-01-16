package com.escom.prototipo;

import com.escom.prototipo.DAOs.Denuncia;
import com.escom.prototipo.DAOs.Tutor;
import com.escom.prototipo.DTOs.DenunciaDto;

public class FormatoConsulta extends javax.swing.JFrame {

    static DenunciaDto dto;
    static Denuncia dnc;


    public FormatoConsulta(String id) {
        
        dto= new DenunciaDto();
        dnc = dto.getDatosDenunciaById(id);
        initComponents();

        DiaPresentField.setText(dnc.getFecha());
        NombreDenuncianteField.setText(dnc.getDd().getNombre_completo());
        EdadDenuncianteField.setText(dnc.getDd().getEdad() + "");
        if(dnc.getDd().getEdad()<18){
            Tutor tt = dto.getTutorByDenuncianteId(dnc.getDd().getId());
            jLabel20.setVisible(true);
            jLabel22.setVisible(true);
            jLabel47.setVisible(true);
            jLabel48.setVisible(true);
            jLabel49.setVisible(true);
            jLabel50.setVisible(true);
            jLabel51.setVisible(true);
            jLabel52.setVisible(true);
            NombreTutor.setVisible(true);
            EdadTutor.setVisible(true);
            GeneroTutor.setVisible(true);
            TelefonoTutor.setVisible(true);
            DomicilioTutor.setVisible(true);
            CorreoTutor.setVisible(true);
            
            NombreTutor.setText(tt.getNombre_completo());
            EdadTutor.setText(tt.getEdad()+"");
            GeneroTutor.setText(tt.getGenero());
            TelefonoTutor.setText(tt.getTelefono());
            DomicilioTutor.setText(tt.getDomicilio());
            CorreoTutor.setText(tt.getCorreo());
        
        }
        GeneroDenuncianteField.setText(dnc.getDd().getGenero());
        DomicilioDenuncianteField.setText(dnc.getDd().getDomicilio());
        TelefonoDenuncianteField.setText(dnc.getDd().getTelefono());
        CorreoDenuncianteField.setText(dnc.getDd().getCorreo());
        UADenuncianteField.setText(dnc.getDd().getUnidad_academica());
        OcupacionDenuncianteField.setText(dnc.getDd().getOcupacion());
        if (dnc.getDd().getOcupacion().contains("Alumno")) {
            GrupoField.setVisible(true);
            SemestreField.setVisible(true);
            CarreraField.setVisible(true);
            jLabel38.setVisible(true);
            jLabel39.setVisible(true);
            jLabel40.setVisible(true);

            SemestreField.setText(dnc.getDd().getSemestre());
            GrupoField.setText(dnc.getDd().getGrupo());
            CarreraField.setText(dnc.getDd().getCarrera());
        } else {
            ContratoField.setVisible(true);
            FuncionField.setVisible(true);
            jLabel41.setVisible(true);
            jLabel42.setVisible(true);

            ContratoField.setText(dnc.getDd().getContrato());
            FuncionField.setText(dnc.getDd().getFuncion());
        }

        TurnoDenuncianteField.setText(dnc.getDd().getTurno());
        AnonimoField.setText(dnc.getDd().getAnonimoString());

        NombreInvolucradoField.setText(dnc.getDi().getNombre_completo());
        DependenciaInvolucradoField.setText(dnc.getDi().getDependencia_politecnico());
        TurnoInvolucradoField.setText(dnc.getDi().getTurno());

        DiaHechosField.setText(dnc.getDh().getFecha());
        DescripcionHechosField.setText(dnc.getDh().getDescripcion());
        LugarHechosField.setText(dnc.getDh().getLugar());
        TestigosHechosField.setText(dnc.getDh().getTestigos());
        MediosField.setText(dnc.getDh().getMediosString());
        ElementoProbatorioField.setText(dnc.getDh().getMediosDescripcion());
        OtrosField.setText(dnc.getDh().getOtros());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DiaPresentField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        NombreDenuncianteField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        EdadDenuncianteField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DomicilioDenuncianteField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TelefonoDenuncianteField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CorreoDenuncianteField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        UADenuncianteField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel22.setVisible(false);
        jLabel23 = new javax.swing.JLabel();
        NombreInvolucradoField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        DependenciaInvolucradoField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        DiaHechosField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        LugarHechosField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        DescripcionHechosField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        TestigosHechosField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel20.setVisible(false);
        NombreTutor = new javax.swing.JTextField();
        NombreTutor.setVisible(false);
        jLabel38 = new javax.swing.JLabel();
        SemestreField = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        GrupoField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        CarreraField = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        FuncionField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        ContratoField = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        OtrosField = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        ElementoProbatorioField = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel47.setVisible(false);
        EdadTutor = new javax.swing.JTextField();
        EdadTutor.setVisible(false);
        jLabel48 = new javax.swing.JLabel();
        jLabel48.setVisible(false);
        jLabel49 = new javax.swing.JLabel();
        jLabel49.setVisible(false);
        jLabel50 = new javax.swing.JLabel();
        jLabel50.setVisible(false);
        DomicilioTutor = new javax.swing.JTextField();
        DomicilioTutor.setVisible(false);
        jLabel51 = new javax.swing.JLabel();
        jLabel51.setVisible(false);
        TelefonoTutor = new javax.swing.JTextField();
        TelefonoTutor.setVisible(false);
        jLabel52 = new javax.swing.JLabel();
        jLabel52.setVisible(false);
        CorreoTutor = new javax.swing.JTextField();
        CorreoTutor.setVisible(false);
        jLabel53 = new javax.swing.JLabel();
        BIFDD = new javax.swing.JButton();
        GeneroDenuncianteField = new javax.swing.JTextField();
        GeneroTutor = new javax.swing.JTextField();
        GeneroTutor.setVisible(false);
        TurnoDenuncianteField = new javax.swing.JTextField();
        AnonimoField = new javax.swing.JTextField();
        TurnoInvolucradoField = new javax.swing.JTextField();
        MediosField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        OcupacionDenuncianteField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(this.MAXIMIZED_BOTH);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORMATO DE DENUNCIA");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos de la persona que presenta la denuncia");

        jLabel3.setText("Fecha y hora de la Denuncia:");

        DiaPresentField.setEnabled(false);

        jLabel10.setText("Nombre completo:");

        NombreDenuncianteField.setEnabled(false);

        jLabel11.setText("Edad:");

        EdadDenuncianteField.setEnabled(false);

        jLabel12.setText("Años");

        jLabel13.setText("Género:");

        jLabel14.setText("Domicilio: (opcional)");

        DomicilioDenuncianteField.setEnabled(false);

        jLabel15.setText("Télefono (extensión en su caso):");

        TelefonoDenuncianteField.setEnabled(false);

        jLabel16.setText("Correo Electrónico:");

        CorreoDenuncianteField.setEnabled(false);

        jLabel18.setText("Unidad académica de procedencia:");

        UADenuncianteField.setEnabled(false);

        jLabel19.setText("Turno:");

        jLabel21.setText("¿Desea que su denuncía sea anónima?:");

        jLabel22.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tutor");

        jLabel23.setText("Nombre completo respecto de quien se presenta la denuncia:");

        NombreInvolucradoField.setEnabled(false);

        jLabel24.setText("Dependencia Politécnica de procedencia:");

        DependenciaInvolucradoField.setEnabled(false);

        jLabel25.setText("Turno:");

        jLabel27.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Descripción de los hechos");

        jLabel28.setText("Fecha en qué ocurrieron los hechos:");

        DiaHechosField.setEnabled(false);

        jLabel33.setText("Lugar dónde ocurrieron los hechos:");

        LugarHechosField.setEnabled(false);

        jLabel34.setText("Describa cómo ocurrieron los hechos:");

        DescripcionHechosField.setEnabled(false);

        jLabel35.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Testigos");

        jLabel36.setText("Indique el nombre completo de los principales testigos en caso de tenerlos y datos de localización (teléfono, extensión, correo).");

        TestigosHechosField.setEnabled(false);

        jLabel20.setText("Nombre Completo del Padre, Madre, Tutor o Tutora: ");

        NombreTutor.setEnabled(false);

        jLabel38.setText("Semestre:");
        jLabel38.setVisible(false);

        SemestreField.setVisible(false);
        SemestreField.setEnabled(false);

        jLabel39.setText("Grupo: ");
        jLabel39.setVisible(false);

        GrupoField.setEnabled(false);
        GrupoField.setVisible(false);

        jLabel40.setText("Carrera: ");
        jLabel40.setVisible(false);

        CarreraField.setVisible(false);
        CarreraField.setEnabled(false);

        jLabel41.setText("Funcion Actual: ");
        jLabel41.setVisible(false);

        FuncionField.setVisible(false);
        FuncionField.setEnabled(false);

        jLabel42.setText("Tipo de contrato: ");
        jLabel42.setVisible(false);

        ContratoField.setEnabled(false);
        ContratoField.setVisible(false);

        jLabel43.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 51, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Medios Probatorios");

        jLabel44.setText("En caso de no contar con ellos, pero que se sepa de su existencia, indique dónde se localizan o a quién le consta.");

        OtrosField.setEnabled(false);

        jLabel45.setText("¿Cuenta con documentos que sustenten se denuncia o algún elemento probatorio adicional?");

        jLabel46.setText("Descríbelos:");

        ElementoProbatorioField.setEnabled(false);

        jLabel47.setText("Edad:");

        EdadTutor.setEnabled(false);

        jLabel48.setText("Años");

        jLabel49.setText("Género:");

        jLabel50.setText("Domicilio: (opcional)");

        DomicilioTutor.setEnabled(false);

        jLabel51.setText("Télefono (extensión en su caso):");

        TelefonoTutor.setEnabled(false);

        jLabel52.setText("Correo Electrónico:");

        CorreoTutor.setEnabled(false);

        jLabel53.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 51, 51));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Datos de la persona involucrada");

        BIFDD.setBackground(new java.awt.Color(206, 226, 240));
        BIFDD.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        BIFDD.setText("Inicio");
        BIFDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIFDDActionPerformed(evt);
            }
        });

        GeneroDenuncianteField.setEnabled(false);

        GeneroTutor.setEnabled(false);

        TurnoDenuncianteField.setEnabled(false);

        AnonimoField.setEnabled(false);

        TurnoInvolucradoField.setEnabled(false);

        MediosField.setEnabled(false);

        jLabel17.setText("Ocupación");

        OcupacionDenuncianteField.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(SemestreField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel39)
                        .addGap(30, 30, 30)
                        .addComponent(GrupoField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel40)
                        .addGap(25, 25, 25)
                        .addComponent(CarreraField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel41)
                        .addGap(25, 25, 25)
                        .addComponent(FuncionField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(ContratoField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(AnonimoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(NombreInvolucradoField, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel24)
                        .addGap(44, 44, 44)
                        .addComponent(DependenciaInvolucradoField, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(TurnoInvolucradoField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(DiaHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(DiaPresentField, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(DomicilioDenuncianteField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(NombreDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(TelefonoDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(35, 35, 35)
                                .addComponent(CorreoDenuncianteField))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(53, 53, 53)
                                .addComponent(CorreoTutor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TelefonoTutor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(12, 12, 12)
                                .addComponent(NombreTutor))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addGap(43, 43, 43)
                                .addComponent(DomicilioTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(GeneroDenuncianteField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(30, 30, 30)
                                .addComponent(EdadDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel12))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel49))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EdadTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel48))
                            .addComponent(GeneroTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(82, 82, 82)
                                .addComponent(TurnoDenuncianteField))
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addComponent(UADenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OtrosField, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(ElementoProbatorioField, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TestigosHechosField, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(DescripcionHechosField))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel33)
                .addGap(32, 32, 32)
                .addComponent(LugarHechosField))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BIFDD))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MediosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(OcupacionDenuncianteField)))
                .addGap(574, 574, 574))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BIFDD)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DiaPresentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel10))
                    .addComponent(NombreDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EdadDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(GeneroDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel14))
                    .addComponent(DomicilioDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15))
                    .addComponent(TelefonoDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16))
                    .addComponent(CorreoDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(OcupacionDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SemestreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GrupoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel40))
                    .addComponent(CarreraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel41))
                    .addComponent(FuncionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel42))
                    .addComponent(ContratoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(UADenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(TurnoDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(AnonimoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel20))
                    .addComponent(NombreTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EdadTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(GeneroTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel50))
                    .addComponent(DomicilioTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(TelefonoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(CorreoTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel53)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel23))
                    .addComponent(NombreInvolucradoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(DependenciaInvolucradoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(TurnoInvolucradoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel27)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(DiaHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel33))
                    .addComponent(LugarHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel34))
                    .addComponent(DescripcionHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addGap(12, 12, 12)
                .addComponent(TestigosHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addGap(25, 25, 25)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MediosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addGap(12, 12, 12)
                .addComponent(ElementoProbatorioField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addGap(12, 12, 12)
                .addComponent(OtrosField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        setBounds(0, 0, 884, 2123);
    }// </editor-fold>//GEN-END:initComponents


    private void BIFDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIFDDActionPerformed
        // TODO add your handling code here:
        Bienvenido Ifdd = new Bienvenido(true);
        Ifdd.setVisible(true);
        dispose();
    }//GEN-LAST:event_BIFDDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //Get Date
//        System.out.println(df.format(date));
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormatoConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormatoConsulta("2").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnonimoField;
    private javax.swing.JButton BIFDD;
    private javax.swing.JTextField CarreraField;
    private javax.swing.JTextField ContratoField;
    private javax.swing.JTextField CorreoDenuncianteField;
    private javax.swing.JTextField CorreoTutor;
    private javax.swing.JTextField DependenciaInvolucradoField;
    private javax.swing.JTextField DescripcionHechosField;
    private javax.swing.JTextField DiaHechosField;
    private javax.swing.JTextField DiaPresentField;
    private javax.swing.JTextField DomicilioDenuncianteField;
    private javax.swing.JTextField DomicilioTutor;
    private javax.swing.JTextField EdadDenuncianteField;
    private javax.swing.JTextField EdadTutor;
    private javax.swing.JTextField ElementoProbatorioField;
    private javax.swing.JTextField FuncionField;
    private javax.swing.JTextField GeneroDenuncianteField;
    private javax.swing.JTextField GeneroTutor;
    private javax.swing.JTextField GrupoField;
    private javax.swing.JTextField LugarHechosField;
    private javax.swing.JTextField MediosField;
    private javax.swing.JTextField NombreDenuncianteField;
    private javax.swing.JTextField NombreInvolucradoField;
    private javax.swing.JTextField NombreTutor;
    private javax.swing.JTextField OcupacionDenuncianteField;
    private javax.swing.JTextField OtrosField;
    private javax.swing.JTextField SemestreField;
    private javax.swing.JTextField TelefonoDenuncianteField;
    private javax.swing.JTextField TelefonoTutor;
    private javax.swing.JTextField TestigosHechosField;
    private javax.swing.JTextField TurnoDenuncianteField;
    private javax.swing.JTextField TurnoInvolucradoField;
    private javax.swing.JTextField UADenuncianteField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
