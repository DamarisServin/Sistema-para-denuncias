/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.DTOs;

import com.escom.prototipo.DAOs.Datos_denunciante;
import com.escom.prototipo.DAOs.Datos_involucrado;
import com.escom.prototipo.DAOs.Denuncia;
import com.escom.prototipo.DAOs.Descripcion_hechos;
import com.escom.prototipo.DAOs.Estadisticas;
import com.escom.prototipo.DAOs.Tutor;
import com.escom.prototipo.conexion.Conexion;
import com.itextpdf.text.pdf.parser.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author damar
 */
public class DenunciaDto {

    public ArrayList getAllDenuncians() {
        ArrayList<Denuncia> list = new ArrayList<>();
        Conexion con = new Conexion();
        try {
            con.conectar();

            String str = "select * from datosDenuncia;";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                list.add(new Denuncia(
                        rsguarda.getInt("idDenuncia"),
                        rsguarda.getString("fechaDenuncia").substring(0, 10),
                        new Datos_denunciante(
                                rsguarda.getString("nombreDenunciante"),
                                rsguarda.getInt("edadDenunciante"),
                                rsguarda.getString("generoDenunciante"),
                                rsguarda.getString("domicilioDenunciante"),
                                rsguarda.getString("telefonoDenunciante"),
                                rsguarda.getString("correoDenunciante"),
                                rsguarda.getString("ocupacionDenunciante"),
                                rsguarda.getString("unidadDenunciante"),
                                rsguarda.getString("turnoDenunciante"),
                                rsguarda.getBoolean("anonimoDenunciante")
                        ),
                        new Datos_involucrado(
                                rsguarda.getString("nombreInvolucrado"),
                                rsguarda.getString("dependenciaInvolucrado"),
                                rsguarda.getString("turnoInvolucrado")
                        ),
                        new Descripcion_hechos(
                                rsguarda.getString("fechaHechos"),
                                rsguarda.getString("lugarHechos"),
                                rsguarda.getString("descripcionHechos"),
                                rsguarda.getString("testigosHechos"),
                                rsguarda.getBoolean("mediosHechos"),
                                rsguarda.getString("mediosDescripcionHechos"),
                                rsguarda.getString("otrosHechos")
                        )
                ));

            }

            con.cierraConexion();

        } catch (SQLException e) {
            System.out.println(e + " getAllDenuncians()");
        }
        return list;
    }

    public boolean saveDenuncia(Denuncia d) {

        saveDatosDenunciante(d.getDd());
        saveDatosInvolucrado(d.getDi());
        saveDescripcionHechos(d.getDh());

        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaDenuncia(0, '"
                    + d.getFecha() + "', "
                    + d.getDd().getId() + ", "
                    + d.getDi().getId() + ", "
                    + 1 + ", "
                    + d.getDh().getId() + ");";
            System.out.println(str);
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Denuncia guardada con exito")) {
                    System.out.println("Denuncia guardada con exito");
                    d.setId(Integer.parseInt(rsguarda.getString("id")));
                    return true;
                } else {
                    System.out.println("Ocurrio un error: saveDenuncia() ");
                }
            }
            con.cierraConexion();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " saveDenuncia()");
        }
        return false;

    }

    private boolean saveDatosDenunciante(Datos_denunciante dd) {
        Conexion con = new Conexion();
        int aux = 0;
        String str;
        if (dd.getEdad() < 18) {
            saveDatosTutor(dd.getTt());
            aux = dd.getTt().getId();
            str = "call guardaDatosDenunciante(0, '"
                    + dd.getNombre_completo() + "', '"
                    + dd.getEdad() + "', '"
                    + dd.getGeneroIndex() + "', '"
                    + dd.getDomicilio() + "', '"
                    + dd.getTelefono() + "', '"
                    + dd.getCorreo() + "', '"
                    + dd.getOcupacion() + "', '"
                    + dd.getUnidad_academica() + "', '"
                    + dd.getTurno() + "', '"
                    + dd.getAnonimoIndex() + "', '"
                    + aux + "');";
            
        }else{
             str = "call guardaDatosDenunciante(0, '"
                    + dd.getNombre_completo() + "', '"
                    + dd.getEdad() + "', '"
                    + dd.getGeneroIndex() + "', '"
                    + dd.getDomicilio() + "', '"
                    + dd.getTelefono() + "', '"
                    + dd.getCorreo() + "', '"
                    + dd.getOcupacion() + "', '"
                    + dd.getUnidad_academica() + "', '"
                    + dd.getTurno() + "', '"
                    + dd.getAnonimoIndex() + "', null);";
        }
        try {
            con.conectar();


            System.out.println(str);
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Datos del denunciante guardados con exito")) {

                    dd.setId(Integer.parseInt(rsguarda.getString("id")));
                    System.out.println("Datos del denunciante guardados con exito " + dd.getId());
                    return true;
                } else {
                    System.out.println("Ocurrio un error: saveDatosDenunciante() ");
                }
            }
            con.cierraConexion();
            if (dd.getOcupacion().contains("Alumno")) {
                saveAlumnoDenunciante(dd);

            }
            if (dd.getOcupacion().contains("Trabajador")) {
                saveTrabajadorDenunciante(dd);

            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " saveDatosDenunciante()");
        }
        return false;

    }

    private boolean saveAlumnoDenunciante(Datos_denunciante dd) {

        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaAlumnoDenunciante(0, '"
                    + dd.getSemestre() + "', '"
                    + dd.getGrupo() + "', '"
                    + dd.getCarrera() + "', '"
                    + dd.getId() + "');";
            System.out.println(str);
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Alumno denunciante guardado con exito")) {

                    System.out.println("Alumno denunciante guardado con exito ");
                    return true;
                } else {
                    System.out.println("Ocurrio un error: saveAlumnoDenunciante() ");
                }
            }
            con.cierraConexion();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " saveAlumnoDenunciante()");
        }
        return false;

    }

    private boolean saveTrabajadorDenunciante(Datos_denunciante dd) {

        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaTrabajadorDenunciante(0, '"
                    + dd.getContrato() + "', '"
                    + dd.getFuncion() + "', '"
                    + dd.getId() + "');";
            System.out.println(str);
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Trabajador denunciante guardado con exito")) {

                    System.out.println("Trabajador denunciante guardado con exito ");
                    return true;
                } else {
                    System.out.println("Ocurrio un error: saveTrabajadorDenunciante() ");
                }
            }
            con.cierraConexion();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " saveTrabajadorDenunciante()");
        }
        return false;

    }

    private boolean saveDatosTutor(Tutor tt) {

        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaDatosTutor(0, '"
                    + tt.getNombre_completo() + "', '"
                    + tt.getEdad() + "', '"
                    + tt.getGeneroIndex() + "', '"
                    + tt.getDomicilio() + "', '"
                    + tt.getTelefono() + "', '"
                    + tt.getCorreo() + "');";
            System.out.println(str);
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Datos del tutor guardados con exito")) {

                    tt.setId(Integer.parseInt(rsguarda.getString("id")));
                    System.out.println("Datos del tutor guardados con exito " + tt.getId());
                    return true;
                } else {
                    System.out.println("Ocurrio un error: saveDatosTutor() ");
                }
            }
            con.cierraConexion();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " saveDatosTutor()");
        }
        return false;

    }

    private boolean saveDatosInvolucrado(Datos_involucrado di) {
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaDatosInvolucrado(0, '"
                    + di.getNombre_completo() + "', '"
                    + di.getDependencia_politecnico() + "', '"
                    + di.getTurno() + "');";
            System.out.println(str);
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Datos del involucrado guardados con exito")) {

                    di.setId(Integer.parseInt(rsguarda.getString("id")));
                    System.out.println("Datos del involucrado guardados con exito " + di.getId());
                    return true;
                } else {
                    System.out.println("Ocurrio un error: saveDatosInvolucrado() ");
                }
            }
            con.cierraConexion();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " saveDatosInvolucrado()");
        }
        return false;

    }

    private boolean saveDescripcionHechos(Descripcion_hechos dh) {
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaHechos(0, '"
                    + dh.getFecha() + "', '"
                    + dh.getLugar() + "', '"
                    + dh.getDescripcion() + "', '"
                    + dh.getTestigos() + "', '"
                    + dh.getMediosIndex()+ "', '"
                    + dh.getMediosDescripcion() + "', '"
                    + dh.getOtros() + "');";

            System.out.println(str);
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Hechos guardados con exito")) {

                    dh.setId(Integer.parseInt(rsguarda.getString("id")));
                    System.out.println("Hechos guardados con exito " + dh.getId());
                    return true;
                } else {
                    System.out.println("Ocurrio un error: saveDescripcionHechos() ");
                }
            }
            con.cierraConexion();
            if (dh.getMedios() && dh.getArchivo() != null) {
                System.out.println("Existen archivos para guardar");
                saveFiles(dh);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " saveDescripcionHechos()");
        }
        return false;

    }

    private void saveFiles(Descripcion_hechos dh) {
        Conexion con = new Conexion();
        try {
            con.conectar();
            System.out.println("saveFiles () en proceso");
            con.archivo(dh.getArchivo(), dh.getId());

            con.cierraConexion();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " saveFiles()");
        }
    }

    public ArrayList getDates() {
        ArrayList<Date> dates = new ArrayList<>();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "select fecha from Denuncia;";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                long db = rsguarda.getDate("fecha").getTime() - 64800000;
                dates.add(new Date(db));

            }
//            System.out.println(dates.toString());
            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " getDates()");
        }
        return dates;
    }

    public ArrayList getDatesDenuncia() {
        ArrayList<Date> dates = new ArrayList<>();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "select fecha from Denuncia;";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {

                dates.add(rsguarda.getDate("fecha"));

            }
//            System.out.println(dates.toString());
            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " getDates()");
        }
        return dates;
    }

    public ArrayList getDatesHechos() {
        ArrayList<Date> dates = new ArrayList<>();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "select fechahora from Descripcion_hechos;";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {

                dates.add(rsguarda.getDate("fechahora"));

            }
//            System.out.println(dates.toString());
            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " getDatesHechos()");
        }
        return dates;
    }

    public ArrayList getAnonimos() {
        ArrayList<String> an = new ArrayList<>();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "select anonimo from Datos_denunciante;";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                an.add(rsguarda.getString("anonimo"));
            }
            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " getAnonimos()");
        }
        return an;
    }

    public ArrayList getIds() {
        ArrayList<String> ids = new ArrayList<>();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "select id from Denuncia;";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {

                ids.add(rsguarda.getString("id"));

            }
            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " getIds()");
        }
        return ids;
    }

    public ArrayList getDenunciasByDate(String date) {
        ArrayList<Integer> ids = new ArrayList<>();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call consultarDenunciasByDate('" + date + "');";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                ids.add(rsguarda.getInt("id"));
            }
            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " getDenunciasByDate()");
        }
        return ids;
    }

    public Denuncia getDatosDenunciaById(String id) {
        Conexion con = new Conexion();
        Denuncia d = new Denuncia();
        try {
            con.conectar();

            String str = "call consultarDenunciaById('" + id + "');";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                d.setFecha(rsguarda.getString("fechaDenuncia").substring(0, 10));

                d.setDd(
                        new Datos_denunciante(
                                rsguarda.getInt("idDenunciante"),
                                rsguarda.getString("nombreDenunciante"),
                                rsguarda.getInt("edadDenunciante"),
                                rsguarda.getString("generoDenunciante"),
                                rsguarda.getString("domicilioDenunciante"),
                                rsguarda.getString("telefonoDenunciante"),
                                rsguarda.getString("correoDenunciante"),
                                rsguarda.getString("ocupacionDenunciante"),
                                rsguarda.getString("unidadDenunciante"),
                                rsguarda.getString("turnoDenunciante"),
                                rsguarda.getBoolean("anonimoDenunciante")
                        )
                );
                d.setDi(
                        new Datos_involucrado(
                                rsguarda.getInt("idInvolucrado"),
                                rsguarda.getString("nombreInvolucrado"),
                                rsguarda.getString("dependenciaInvolucrado"),
                                rsguarda.getString("turnoInvolucrado")
                        )
                );

                d.setDh(
                        new Descripcion_hechos(
                                rsguarda.getInt("idHechos"),
                                rsguarda.getString("fechaHechos").substring(0, 10),
                                rsguarda.getString("lugarHechos"),
                                rsguarda.getString("descripcionHechos"),
                                rsguarda.getString("testigosHechos"),
                                rsguarda.getBoolean("mediosHechos"),
                                rsguarda.getString("mediosDescripcionHechos"),
                                rsguarda.getString("otrosHechos")
                        )
                );
            }

            con.cierraConexion();

            if (d.getDd().getEdad() < 18) {
                d.getDd().setTt(getTutorByDenuncianteId(d.getDd().getId()));
            }
            if (d.getDd().getOcupacion().contains("Alumno")) {
                setAlumnoInfo(d.getDd());
            }
            if (d.getDd().getOcupacion().contains("Trabajador")) {
                setTrabajadorInfo(d.getDd());
            }

        } catch (SQLException e) {
            System.out.println(e + " getDenunciasByDate()");
        }
        return d;
    }

    public Tutor getTutorByDenuncianteId(int id) {
        Conexion con = new Conexion();
        Tutor tt = new Tutor();
        try {
            con.conectar();
            String str = "call consultarDatosTutorByDenuncianteId('" + id + "');";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {

                tt.setNombre_completo(rsguarda.getString("nombreTutor"));
                tt.setEdad(rsguarda.getInt("edadTutor"));
                tt.setGenero(rsguarda.getString("generoTutor"));
                tt.setDomicilio(rsguarda.getString("domicilioTutor"));
                tt.setCorreo(rsguarda.getString("correoTutor"));
                tt.setTelefono(rsguarda.getString("telefonoTutor"));
            }

            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " getTutorByDenunciaId()");
        }
        return tt;
    }
   public File getArchivoByHechosId(String id) throws SQLException  {
        Conexion con = new Conexion();
 
        try {
            con.conectar();

            String str = "call getArchivoByHechosId('" + id + "');";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                String fileName = rsguarda.getString("nombre_archivo");
                InputStream inputStream = rsguarda.getBinaryStream("archivo");

                        // Guardar el archivo PDF en el sistema de archivos
                       /* JFileChooser fileChooser = new JFileChooser();
                        fileChooser.setSelectedFile(new File(fileName));

                        int userSelection = fileChooser.showSaveDialog(null);

                        if (userSelection == JFileChooser.APPROVE_OPTION) {
                            File fileToSave = fileChooser.getSelectedFile();
                            Path filePath = (Path) Paths.get(fileToSave.getAbsolutePath());*/
                       
                            Path filePath = (Path) Paths.get("/");

                            FileOutputStream outputStream = null;
                    try {
                        outputStream = new FileOutputStream(filePath.toString());
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(DenunciaDto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                                byte[] buffer = new byte[1024];
                    try {
                        while (inputStream.read(buffer) > 0) {
                            outputStream.write(buffer);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(DenunciaDto.class.getName()).log(Level.SEVERE, null, ex);
                    }

                                System.out.println("Archivo PDF recuperado y guardado en: " + filePath);
                    //}
            }
        }catch (SQLException e) {
            System.out.println(e + " getAlumnoInfo()");
        }
            con.cierraConexion();
        
        return null;
    }
    public void setAlumnoInfo(Datos_denunciante dd) {
        Conexion con = new Conexion();
        String sm = "";
        String gp = "";
        String cr = "";
        try {
            con.conectar();
            String str = "select * from Alumno_denunciante where denunciante_id = " + dd.getId() + ";";
            ResultSet rsguarda = con.consulta(str);
            while (rsguarda.next()) {
                sm = rsguarda.getString("semestre");
                gp = rsguarda.getString("grupo");
                cr = rsguarda.getString("carrera");
            }
            dd.setAlumnoDenunciante(sm, gp, cr);
            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " getAlumnoInfo()");
        }
    }

    public boolean setTrabajadorInfo(Datos_denunciante dd) {
        boolean flg = false;
        Conexion con = new Conexion();
        String fn = "";
        String ct = "";
        try {
            con.conectar();
            String str = "select * from Trabajador_denunciante where denunciante_id = " + dd.getId() + ";";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                fn = rsguarda.getString("funcion_actual");
                ct = rsguarda.getString("tipo_contrato");
                flg = true;
            }
            dd.setTrabajadorDenunciante(fn, ct);
            con.cierraConexion();

        } catch (SQLException e) {
            System.out.println(e + " getTrabajadorInfo()");
        }
        return flg;
    }

    public Estadisticas getEstadisticaAll() {
        Estadisticas es = null;
        Conexion con = new Conexion();
        try {
            con.conectar();

            String str = "call datosTotales();";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                es = new Estadisticas(
                        rsguarda.getInt("total"),
                        rsguarda.getInt("menores"),
                        rsguarda.getInt("femenino"),
                        rsguarda.getInt("masculino"),
                        rsguarda.getInt("anonimos"),
                        rsguarda.getInt("alumno"),
                        rsguarda.getInt("trabajador"),
                        rsguarda.getInt("medios"),
                        rsguarda.getInt("testigos"),
                        rsguarda.getInt("unidades")
                );
            }

            con.cierraConexion();

        } catch (SQLException e) {
            System.out.println(e + " getEstadisticaAll()");
        }

        return es;
    }

    public Estadisticas getEstadisticaSemestral() {
        Estadisticas es = null;
        Conexion con = new Conexion();
        try {
            con.conectar();

            String str = "call datosSemestrales();";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                es = new Estadisticas(
                        rsguarda.getInt("total"),
                        rsguarda.getInt("menores"),
                        rsguarda.getInt("femenino"),
                        rsguarda.getInt("masculino"),
                        rsguarda.getInt("anonimos"),
                        rsguarda.getInt("alumno"),
                        rsguarda.getInt("trabajador"),
                        rsguarda.getInt("medios"),
                        rsguarda.getInt("testigos"),
                        rsguarda.getInt("unidades")
                );
            }

            con.cierraConexion();

        } catch (SQLException e) {
            System.out.println(e + " getEstadisticaSemestral()");
        }

        return es;
    }

    public Estadisticas getEstadisticaBimestral() {
        Estadisticas es = null;
        Conexion con = new Conexion();
        try {
            con.conectar();

            String str = "call datosBimestrales();";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                es = new Estadisticas(
                        rsguarda.getInt("total"),
                        rsguarda.getInt("menores"),
                        rsguarda.getInt("femenino"),
                        rsguarda.getInt("masculino"),
                        rsguarda.getInt("anonimos"),
                        rsguarda.getInt("alumno"),
                        rsguarda.getInt("trabajador"),
                        rsguarda.getInt("medios"),
                        rsguarda.getInt("testigos"),
                        rsguarda.getInt("unidades")
                );
            }

            con.cierraConexion();

        } catch (SQLException e) {
            System.out.println(e + " getEstadisticaBimestral()");
        }

        return es;
    }
}
