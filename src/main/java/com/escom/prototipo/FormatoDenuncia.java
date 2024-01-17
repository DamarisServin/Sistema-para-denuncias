package com.escom.prototipo;

import com.escom.prototipo.DAOs.Datos_denunciante;
import com.escom.prototipo.DAOs.Datos_involucrado;
import com.escom.prototipo.DAOs.Denuncia;
import com.escom.prototipo.DAOs.Descripcion_hechos;
import com.escom.prototipo.DAOs.Tutor;
import com.escom.prototipo.DTOs.DenunciaDto;
import com.escom.validaciones.Validaciones;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FormatoDenuncia extends javax.swing.JFrame {

    static DateFormat df;
    static Date date;
    static Datos_denunciante dd;
    static Datos_involucrado di;
    static Descripcion_hechos dh;
    static Denuncia dnc;
    static DenunciaDto dto;
    static String file;
    static Validaciones v = new Validaciones();
    static boolean isCoordinador;

    public FormatoDenuncia(boolean b) {
        isCoordinador = b;
        dto = new DenunciaDto();
        df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date = new Date();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AñoPresentField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        MinutosField = new javax.swing.JTextField();
        HoraField = new javax.swing.JTextField();
        HoraField.setText(date.getHours()+"");
        jLabel8 = new javax.swing.JLabel();
        DiaPresentField = new javax.swing.JTextField();
        MesPresentField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        NombreDenuncianteField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        EdadDenuncianteField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        GeneroDenuncianteCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        DomicilioDenuncianteField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TelefonoDenuncianteField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CorreoDenuncianteField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        OcupacionDenuncianteCombo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        UADenuncianteField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TurnoDenuncianteCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        AnonimatoCombo = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel22.setVisible(false);
        jLabel23 = new javax.swing.JLabel();
        NombreInvolucradoField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        DependenciaInvolucradoField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        TurnoInvolucradoCombo = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        TipoInvolucradoCombo = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        DiaHechosField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        MesHechosField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        AñoHechosField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        HoraHechosField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        LugarHechosField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        DescripcionHechosField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        TestigosHechosField = new javax.swing.JTextField();
        EnviarButton = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
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
        ElementoProbatorioCombo = new javax.swing.JComboBox<>();
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
        GeneroTutor = new javax.swing.JComboBox<>();
        GeneroTutor.setVisible(false);
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
        ArchivoButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel3.setText("Fecha de la Denuncia:");

        jLabel5.setText("de");

        jLabel6.setText("del");

        AñoPresentField.setEnabled(false);
        AñoPresentField.setText((date.getYear()+1900)+"");

        jLabel7.setText("Hora de la denuncia:");

        MinutosField.setEnabled(false);
        MinutosField.setText(date.getMinutes()+"");

        HoraField.setEnabled(false);

        jLabel8.setText("Horas");

        DiaPresentField.setEnabled(false);
        DiaPresentField.setText(date.getDate()+"");

        MesPresentField.setEnabled(false);
        MesPresentField.setText((date.getMonth()+1)+"");

        jLabel10.setText("Nombre completo:");

        NombreDenuncianteField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreDenuncianteFieldFocusLost(evt);
            }
        });

        jLabel11.setText("Edad:");

        EdadDenuncianteField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EdadDenuncianteFieldFocusLost(evt);
            }
        });

        jLabel12.setText("Años");

        jLabel13.setText("Género:");

        GeneroDenuncianteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel14.setText("Domicilio: (opcional)");

        DomicilioDenuncianteField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DomicilioDenuncianteFieldFocusLost(evt);
            }
        });

        jLabel15.setText("Télefono (extensión en su caso):");

        TelefonoDenuncianteField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TelefonoDenuncianteFieldFocusLost(evt);
            }
        });

        jLabel16.setText("Correo Electrónico:");

        CorreoDenuncianteField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CorreoDenuncianteFieldFocusLost(evt);
            }
        });

        jLabel17.setText("Ocupación");

        OcupacionDenuncianteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno/a", "Trabajador/ra" }));
        OcupacionDenuncianteCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                OcupacionDenuncianteComboFocusLost(evt);
            }
        });

        jLabel18.setText("Unidad académica de procedencia:");

        UADenuncianteField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                UADenuncianteFieldFocusLost(evt);
            }
        });

        jLabel19.setText("Turno:");

        TurnoDenuncianteCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino" }));

        jLabel9.setText("Minutos");

        jLabel21.setText("¿Desea que su denuncía sea anónima?:");

        AnonimatoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel22.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tutor");

        jLabel23.setText("Nombre completo respecto de quien se presenta la denuncia:");

        NombreInvolucradoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreInvolucradoFieldFocusLost(evt);
            }
        });

        jLabel24.setText("Dependencia Politécnica de procedencia:");

        DependenciaInvolucradoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DependenciaInvolucradoFieldFocusLost(evt);
            }
        });

        jLabel25.setText("Turno:");

        TurnoInvolucradoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutino", "Vespertino" }));

        jLabel26.setText("Tipo de persona involucrada:");

        TipoInvolucradoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alumno/a", "Profesor/a" }));

        jLabel27.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Descripción de los hechos");

        jLabel28.setText("Fecha en qué ocurrieron los hechos:");

        jLabel29.setText("a");

        jLabel30.setText("de");

        jLabel31.setText("de ");

        jLabel32.setText("Hora aproximada:");

        jLabel33.setText("Lugar dónde ocurrieron los hechos:");

        LugarHechosField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                LugarHechosFieldFocusLost(evt);
            }
        });

        jLabel34.setText("Describa cómo ocurrieron los hechos:");

        DescripcionHechosField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DescripcionHechosFieldFocusLost(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 51, 51));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Testigos");

        jLabel36.setText("Indique el nombre completo de los principales testigos en caso de tenerlos y datos de localización (teléfono, extensión, correo).");

        EnviarButton.setBackground(new java.awt.Color(51, 102, 255));
        EnviarButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EnviarButton.setText("Enviar");
        EnviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarButtonActionPerformed(evt);
            }
        });

        jLabel37.setText("Por favor, revise que la información sea correcta antes de proceder.");

        jLabel20.setText("Nombre Completo del Padre, Madre, Tutor o Tutora: ");

        NombreTutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NombreTutorFocusLost(evt);
            }
        });

        jLabel38.setText("Semestre:");
        jLabel38.setVisible(false);

        SemestreField.setVisible(false);
        SemestreField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SemestreFieldFocusLost(evt);
            }
        });

        jLabel39.setText("Grupo: ");
        jLabel39.setVisible(false);

        GrupoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                GrupoFieldFocusLost(evt);
            }
        });
        GrupoField.setVisible(false);

        jLabel40.setText("Carrera: ");
        jLabel40.setVisible(false);

        CarreraField.setVisible(false);
        CarreraField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CarreraFieldFocusLost(evt);
            }
        });

        jLabel41.setText("Funcion Actual: ");
        jLabel41.setVisible(false);

        FuncionField.setVisible(false);
        FuncionField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FuncionFieldFocusLost(evt);
            }
        });

        jLabel42.setText("Tipo de contrato: ");
        jLabel42.setVisible(false);

        ContratoField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContratoFieldFocusLost(evt);
            }
        });
        ContratoField.setVisible(false);

        jLabel43.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 51, 51));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Medios Probatorios");

        jLabel44.setText("En caso de no contar con ellos, pero que se sepa de su existencia, indique dónde se localizan o a quién le consta.");

        OtrosField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                OtrosFieldFocusLost(evt);
            }
        });

        jLabel45.setText("¿Cuenta con documentos que sustenten se denuncia o algún elemento probatorio adicional?");

        ElementoProbatorioCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        ElementoProbatorioCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ElementoProbatorioComboFocusLost(evt);
            }
        });

        jLabel46.setText("Descríbelos:");

        ElementoProbatorioField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ElementoProbatorioFieldFocusLost(evt);
            }
        });

        jLabel47.setText("Edad:");

        EdadTutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EdadTutorFocusLost(evt);
            }
        });

        jLabel48.setText("Años");

        jLabel49.setText("Género:");

        GeneroTutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel50.setText("Domicilio: (opcional)");

        DomicilioTutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DomicilioTutorFocusLost(evt);
            }
        });

        jLabel51.setText("Télefono (extensión en su caso):");

        TelefonoTutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TelefonoTutorFocusLost(evt);
            }
        });

        jLabel52.setText("Correo Electrónico:");

        CorreoTutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CorreoTutorFocusLost(evt);
            }
        });

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

        ArchivoButton.setText("Elegir Archivo...");
        ArchivoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(206, 226, 240));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setText("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11)
                        .addGap(30, 30, 30)
                        .addComponent(EdadDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(GeneroDenuncianteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel17)
                        .addGap(72, 72, 72)
                        .addComponent(OcupacionDenuncianteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(UADenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(TurnoDenuncianteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(AnonimatoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel47)
                        .addGap(57, 57, 57)
                        .addComponent(EdadTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel49)
                        .addGap(45, 45, 45)
                        .addComponent(GeneroTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(137, 137, 137)
                        .addComponent(TurnoInvolucradoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel26)
                        .addGap(45, 45, 45)
                        .addComponent(TipoInvolucradoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel28)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel29)
                        .addGap(6, 6, 6)
                        .addComponent(DiaHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel30)
                        .addGap(6, 6, 6)
                        .addComponent(MesHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel31)
                        .addGap(6, 6, 6)
                        .addComponent(AñoHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(HoraHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(ElementoProbatorioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(ArchivoButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel44))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(HoraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(DiaPresentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(MesPresentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(AñoPresentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MinutosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))))
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
                                .addComponent(jLabel16)
                                .addGap(29, 29, 29)
                                .addComponent(CorreoDenuncianteField))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(TelefonoDenuncianteField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                .addComponent(DomicilioTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EnviarButton)
                            .addComponent(jLabel37))
                        .addGap(110, 110, 110)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BIFDD)))
                .addGap(0, 297, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(DiaPresentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(MesPresentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(AñoPresentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(HoraField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MinutosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addGap(37, 37, 37)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(GeneroDenuncianteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel17))
                    .addComponent(OcupacionDenuncianteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19))
                    .addComponent(TurnoDenuncianteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(AnonimatoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel49))
                    .addComponent(GeneroTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel25))
                    .addComponent(TurnoInvolucradoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel26))
                    .addComponent(TipoInvolucradoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiaHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AñoHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel32))
                    .addComponent(HoraHechosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
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
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ElementoProbatorioCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ArchivoButton)
                    .addComponent(jLabel4))
                .addGap(17, 17, 17)
                .addComponent(jLabel46)
                .addGap(12, 12, 12)
                .addComponent(ElementoProbatorioField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addGap(12, 12, 12)
                .addComponent(OtrosField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(EnviarButton)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jButton1))
                .addGap(25, 25, 25))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 2103, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 884, 2123);
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarButtonActionPerformed
        if (crearDatosDenuncia()) {
            if (crearDatosInvolucrado()) {
                if (crearDescripcionHechos()) {

                    if (dd.getOcupacion().contains("Alumno")) {
                        dd.setAlumnoDenunciante(SemestreField.getText(), GrupoField.getText(), CarreraField.getText());
                    }
                    if (dd.getOcupacion().contains("Trabajador")) {
                        dd.setTrabajadorDenunciante(FuncionField.getText(), ContratoField.getText());
                    }
                    if (dd.getEdad() < 18 && crearDatosTutor()) {
                        System.out.println("Guardado con tutor");
                    }

                    dnc = new Denuncia(df.format(date), dd, di, dh);

                    if (dto.saveDenuncia(dnc)) {
                        JOptionPane.showMessageDialog(null, "Denuncia guerdada con exito", "Submit", JOptionPane.WARNING_MESSAGE);
                        Bienvenido Ifdd = new Bienvenido(isCoordinador);
                        Ifdd.setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo guardar la denuncia, por favor intentelo nuevamente", "Submit", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, que la descripcion de los hechos sean correctos", "Campo invalido", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, que los datos del involucrado sean correctos", "Campo invalido", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, que los datos del denunciante sean correctos", "Campo invalido", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_EnviarButtonActionPerformed

    private boolean crearDatosTutor() {
        String aux1 = NombreTutor.getText();
        String aux2 = EdadTutor.getText();
        String aux3 = GeneroTutor.getSelectedItem().toString();
        String aux4 = DomicilioTutor.getText();
        String aux5 = TelefonoTutor.getText();
        String aux6 = CorreoTutor.getText();

        boolean rtrn = false;

        if (aux1.isEmpty() || aux2.isEmpty() || aux3.isEmpty() || aux5.isEmpty() || aux6.isEmpty()) {
            System.out.println("Alguno de los espacios esta vacio");
            JOptionPane.showMessageDialog(null, "Alguno de los campos obligatorios esta vacío", "Campo vacío", JOptionPane.WARNING_MESSAGE);

        } else if (v.isLetters(aux1) && v.isEdad(aux2) && v.isLetters(aux3) && v.isLetters(aux4) && v.isPhone(aux5) && v.isEmail(aux6)) {
            dd.setTt(new Tutor(aux1, Integer.parseInt(aux2), aux3, aux4, aux5, aux6));
            rtrn = true;
        }
        return rtrn;
    }

    private boolean crearDatosDenuncia() {

        String aux1 = NombreDenuncianteField.getText();
        String aux2 = EdadDenuncianteField.getText();
        String aux3 = (String) GeneroDenuncianteCombo.getSelectedItem();
        String aux4 = DomicilioDenuncianteField.getText();
        String aux5 = TelefonoDenuncianteField.getText();
        String aux6 = CorreoDenuncianteField.getText();
        String aux7 = (String) OcupacionDenuncianteCombo.getSelectedItem();
        String aux8 = UADenuncianteField.getText();
        String aux9 = (String) TurnoDenuncianteCombo.getSelectedItem();
        String aux10 = (String) AnonimatoCombo.getSelectedItem();

        boolean flag = false;
        boolean rtrn = false;

        if (aux10.startsWith("S")) {
            flag = true;
        }

        if (aux1.isEmpty() || aux2.isEmpty() || aux3.isEmpty() || aux5.isEmpty() || aux6.isEmpty() || aux7.isEmpty() || aux8.isEmpty() || aux9.isEmpty() || aux10.isEmpty()) {
            System.out.println("Alguno de los campos obligatorios del denunciante esta vacío");
        } else if (v.isLetters(aux1) && v.isEdad(aux2) && v.isLettersNumbers(aux4) && v.isPhone(aux5) && v.isEmail(aux6) && v.isLetters(aux8)) {
            dd = new Datos_denunciante(aux1, Integer.parseInt(aux2), aux3, aux4, aux5, aux6, aux7, aux8, aux9, flag);
            rtrn = true;
        }
        return rtrn;
    }

    private boolean crearDatosInvolucrado() {
        String aux1 = NombreInvolucradoField.getText();
        String aux2 = DependenciaInvolucradoField.getText();
        String aux3 = (String) TurnoInvolucradoCombo.getSelectedItem();
        String aux4 = (String) TipoInvolucradoCombo.getSelectedItem();

        boolean rtrn = false;
        if (aux1.isEmpty() || aux2.isEmpty() || aux3.isEmpty() || aux4.isEmpty()) {
            System.out.println("Alguno de los campos obligatorios del involucrado esta vacío");
        } else if (v.isLetters(aux1) && v.isLetters(aux2)) {
            di = new Datos_involucrado(aux1, aux2, aux3);
            rtrn = true;
        }
        return rtrn;
    }

    private boolean crearDescripcionHechos() {

        String aux1 = DiaHechosField.getText();
        String aux2 = MesHechosField.getText();
        String aux3 = AñoHechosField.getText();
        String aux4 = HoraHechosField.getText();
        String aux5 = LugarHechosField.getText();
        String aux6 = DescripcionHechosField.getText();
        String aux7 = TestigosHechosField.getText();
        String aux8 = (String) ElementoProbatorioCombo.getSelectedItem();
        String aux9 = ElementoProbatorioField.getText();
        String aux10 = OtrosField.getText();
        boolean flag = false;
        boolean rtrn = false;

        if (aux8.startsWith("S")) {
            flag = true;
        }

        if (aux1.isEmpty() || aux2.isEmpty() || aux3.isEmpty() || aux4.isEmpty() || aux5.isEmpty() || aux6.isEmpty()) {
            System.out.println("Alguno de los campos obligatorios en la descripcion de los hechos esta vacío");
        } else if (v.isLetters(aux5) && v.isLetters(aux6) && v.isLetters(aux7) && v.isLetters(aux9) && v.isLetters(aux10)) {
            if (v.isNumber(aux1) && v.isNumber(aux2) && v.isNumber(aux3)) {
                if (v.isHour(aux4)) {
                    dh = new Descripcion_hechos(v.getDate(aux1, aux2, aux3, aux4), aux5, aux6, aux7, flag, aux9, aux10);
                    dh.setArchivo(file);
                    rtrn = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Asegurate que la fecha tenga el siguiente formato:  HH:MM", "Campo inválido", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Verifica que la fecha sea correcta", "Campo inválido", JOptionPane.WARNING_MESSAGE);
            }
        }
        return rtrn;
    }


    private void EdadDenuncianteFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EdadDenuncianteFieldFocusLost
        if (v.isEdad(EdadDenuncianteField.getText())) {
            if (Integer.parseInt(EdadDenuncianteField.getText()) < 18) {
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

            } else {
                jLabel20.setVisible(false);
                jLabel22.setVisible(false);
                jLabel47.setVisible(false);
                jLabel48.setVisible(false);
                jLabel49.setVisible(false);
                jLabel50.setVisible(false);
                jLabel51.setVisible(false);
                jLabel52.setVisible(false);
                NombreTutor.setVisible(false);
                EdadTutor.setVisible(false);
                GeneroTutor.setVisible(false);
                TelefonoTutor.setVisible(false);
                DomicilioTutor.setVisible(false);
                CorreoTutor.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifica que la edad ingresada sea correcta", "Campo inválido", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_EdadDenuncianteFieldFocusLost

    private void OcupacionDenuncianteComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OcupacionDenuncianteComboFocusLost
        if (OcupacionDenuncianteCombo.getSelectedIndex() == 0) {
            GrupoField.setVisible(true);
            SemestreField.setVisible(true);
            CarreraField.setVisible(true);
            jLabel38.setVisible(true);
            jLabel39.setVisible(true);
            jLabel40.setVisible(true);

            ContratoField.setVisible(false);
            FuncionField.setVisible(false);
            jLabel41.setVisible(false);
            jLabel42.setVisible(false);
        } else {
            GrupoField.setVisible(false);
            SemestreField.setVisible(false);
            CarreraField.setVisible(false);
            jLabel38.setVisible(false);
            jLabel39.setVisible(false);
            jLabel40.setVisible(false);

            ContratoField.setVisible(true);
            FuncionField.setVisible(true);
            jLabel41.setVisible(true);
            jLabel42.setVisible(true);

        }

    }//GEN-LAST:event_OcupacionDenuncianteComboFocusLost

    private void NombreDenuncianteFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreDenuncianteFieldFocusLost
        if (!v.isLetters(NombreDenuncianteField.getText()))
            JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_NombreDenuncianteFieldFocusLost

    private void DomicilioDenuncianteFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DomicilioDenuncianteFieldFocusLost
        if (!v.isLettersNumbers(DomicilioDenuncianteField.getText()))
            JOptionPane.showMessageDialog(null, "El formato del domicio no es valido", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_DomicilioDenuncianteFieldFocusLost

    private void TelefonoDenuncianteFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoDenuncianteFieldFocusLost
        if (!v.isPhone(TelefonoDenuncianteField.getText()))
            JOptionPane.showMessageDialog(null, "El formato del telefono no es valido", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_TelefonoDenuncianteFieldFocusLost

    private void CorreoDenuncianteFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CorreoDenuncianteFieldFocusLost
        if (!v.isEmail(CorreoDenuncianteField.getText()))
            JOptionPane.showMessageDialog(null, "El correo proporcionado no cumple con el formato correcto", "Campo vacío", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_CorreoDenuncianteFieldFocusLost

    private void SemestreFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SemestreFieldFocusLost
        if (!v.isNumber(SemestreField.getText()))
            JOptionPane.showMessageDialog(null, "El semestre tiene que ser un numero", "Campo vacío", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_SemestreFieldFocusLost

    private void GrupoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_GrupoFieldFocusLost
        if (!v.isLettersNumbers(GrupoField.getText()))
            JOptionPane.showMessageDialog(null, "El grupo no puede contener carecteres especiales", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_GrupoFieldFocusLost

    private void CarreraFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CarreraFieldFocusLost
        if (!v.isLetters(CarreraField.getText()))
            JOptionPane.showMessageDialog(null, "La carrera solo puede contener letras", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_CarreraFieldFocusLost

    private void FuncionFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FuncionFieldFocusLost
        if (!v.isLetters(FuncionField.getText()))
            JOptionPane.showMessageDialog(null, "La funcion solo puede contener letras", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_FuncionFieldFocusLost

    private void ContratoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContratoFieldFocusLost
        if (!v.isLetters(ContratoField.getText()))
            JOptionPane.showMessageDialog(null, "El contrato solo puede contener letras", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_ContratoFieldFocusLost

    private void UADenuncianteFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UADenuncianteFieldFocusLost
        if (!v.isLetters(UADenuncianteField.getText()))
            JOptionPane.showMessageDialog(null, "La unidad academica solo puede contener letras", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_UADenuncianteFieldFocusLost

    private void NombreTutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreTutorFocusLost
        if (!v.isLetters(NombreTutor.getText()))
            JOptionPane.showMessageDialog(null, "El nombre del tutor solo puede contener letras", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_NombreTutorFocusLost

    private void NombreInvolucradoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NombreInvolucradoFieldFocusLost
        if (!v.isLetters(NombreInvolucradoField.getText()))
            JOptionPane.showMessageDialog(null, "El nombre del involucrado solo puede contener letras", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_NombreInvolucradoFieldFocusLost

    private void DependenciaInvolucradoFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DependenciaInvolucradoFieldFocusLost
        if (!v.isLettersNumbers(DependenciaInvolucradoField.getText()))
            JOptionPane.showMessageDialog(null, "La dependencia no puede tener caracteres especiales", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_DependenciaInvolucradoFieldFocusLost

    private void LugarHechosFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LugarHechosFieldFocusLost
        if (!v.isLettersNumbers(LugarHechosField.getText()))
            JOptionPane.showMessageDialog(null, "El lugar no puede tener caracteres especiales", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_LugarHechosFieldFocusLost

    private void DescripcionHechosFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DescripcionHechosFieldFocusLost
        if (!v.isLettersNumbers(DescripcionHechosField.getText()))
            JOptionPane.showMessageDialog(null, "La descripcion no puede tener caracteres especiales", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_DescripcionHechosFieldFocusLost

    private void ElementoProbatorioComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ElementoProbatorioComboFocusLost
        if (ElementoProbatorioCombo.getSelectedIndex() == 0) {
            jLabel46.setVisible(true);
            ElementoProbatorioField.setVisible(true);
            ArchivoButton.setVisible(true);
        } else {
            jLabel46.setVisible(false);
            ElementoProbatorioField.setVisible(false);
            ArchivoButton.setVisible(false);
        }
    }//GEN-LAST:event_ElementoProbatorioComboFocusLost

    private void ElementoProbatorioFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ElementoProbatorioFieldFocusLost
        if (!v.isLettersNumbers(ElementoProbatorioField.getText()))
            JOptionPane.showMessageDialog(null, "La descripcion no puede tener caracteres especiales", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_ElementoProbatorioFieldFocusLost

    private void OtrosFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OtrosFieldFocusLost
        if (!v.isLettersNumbers(OtrosField.getText()))
            JOptionPane.showMessageDialog(null, "La descripcion no puede tener caracteres especiales", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_OtrosFieldFocusLost

    private void EdadTutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EdadTutorFocusLost
        if (!v.isEdad(EdadTutor.getText()))
            JOptionPane.showMessageDialog(null, "Verifica que la edad del tutor ingresada sea correcta", "Campo inválido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_EdadTutorFocusLost

    private void DomicilioTutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DomicilioTutorFocusLost
        if (!v.isLettersNumbers(DomicilioDenuncianteField.getText()))
            JOptionPane.showMessageDialog(null, "El formato del domicio no es valido", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_DomicilioTutorFocusLost

    private void TelefonoTutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoTutorFocusLost
        if (!v.isPhone(TelefonoDenuncianteField.getText()))
            JOptionPane.showMessageDialog(null, "El formato del telefono no es valido", "Campo invalido", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_TelefonoTutorFocusLost

    private void CorreoTutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CorreoTutorFocusLost
        if (!v.isEmail(CorreoDenuncianteField.getText()))
            JOptionPane.showMessageDialog(null, "El correo proporcionado no cumple con el formato correcto", "Campo vacío", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_CorreoTutorFocusLost

    private void BIFDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIFDDActionPerformed
        // TODO add your handling code here:
        Bienvenido Ifdd = new Bienvenido(isCoordinador);
        Ifdd.setVisible(true);
        dispose();
    }//GEN-LAST:event_BIFDDActionPerformed

    private void ArchivoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        // Muestra el file chooser y captura la respuesta del usuario
        int returnValue = fileChooser.showOpenDialog(null);
        

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            System.out.println("Archivo seleccionado: " + fileChooser.getSelectedFile().getAbsolutePath());
            file = fileChooser.getSelectedFile().getAbsolutePath();
            jLabel4.setText(file);
        }
    }//GEN-LAST:event_ArchivoButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Bienvenido bv = new Bienvenido(isCoordinador);
        bv.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormatoDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormatoDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormatoDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormatoDenuncia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormatoDenuncia(isCoordinador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AnonimatoCombo;
    private javax.swing.JButton ArchivoButton;
    private javax.swing.JTextField AñoHechosField;
    private javax.swing.JTextField AñoPresentField;
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
    private javax.swing.JComboBox<String> ElementoProbatorioCombo;
    private javax.swing.JTextField ElementoProbatorioField;
    private javax.swing.JButton EnviarButton;
    private javax.swing.JTextField FuncionField;
    private javax.swing.JComboBox<String> GeneroDenuncianteCombo;
    private javax.swing.JComboBox<String> GeneroTutor;
    private javax.swing.JTextField GrupoField;
    private javax.swing.JTextField HoraField;
    private javax.swing.JTextField HoraHechosField;
    private javax.swing.JTextField LugarHechosField;
    private javax.swing.JTextField MesHechosField;
    private javax.swing.JTextField MesPresentField;
    private javax.swing.JTextField MinutosField;
    private javax.swing.JTextField NombreDenuncianteField;
    private javax.swing.JTextField NombreInvolucradoField;
    private javax.swing.JTextField NombreTutor;
    private javax.swing.JComboBox<String> OcupacionDenuncianteCombo;
    private javax.swing.JTextField OtrosField;
    private javax.swing.JTextField SemestreField;
    private javax.swing.JTextField TelefonoDenuncianteField;
    private javax.swing.JTextField TelefonoTutor;
    private javax.swing.JTextField TestigosHechosField;
    private javax.swing.JComboBox<String> TipoInvolucradoCombo;
    private javax.swing.JComboBox<String> TurnoDenuncianteCombo;
    private javax.swing.JComboBox<String> TurnoInvolucradoCombo;
    private javax.swing.JTextField UADenuncianteField;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
