/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.DAOs;

import com.escom.prototipo.conexion.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Damaris
 */
public class Denuncia {
    private int id;
    private String fecha;
    private Datos_denunciante dd;
    private Datos_involucrado di;
    private Descripcion_hechos dh;
    private Tutor tt;
    
    public Denuncia(){
        dd = new Datos_denunciante();
        di = new Datos_involucrado();
        dh  = new Descripcion_hechos();
        tt = new Tutor();
    }

    public Denuncia(String fecha, Datos_denunciante oDenunciante, Datos_involucrado oInvolucrado, Descripcion_hechos oHechos, Tutor oTutor) {
        this.fecha = fecha;
        this.dd = oDenunciante;
        this.di = oInvolucrado;
        this.dh = oHechos;
        this.tt = oTutor;
    }
    public boolean saveDenuncia(){
        if (tt != null)
                saveDatosTutor();
        
        saveDatosDenunciante();
        saveDatosInvolucrado();
        saveDescripcionHechos();
        
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaDenuncia(0, '" 
                    + fecha + "', '" 
                    + dd.getId() + "', '" 
                    + di.getId() + "', '" 
                    + dh.getId() + "', '" 
                    + tt.getId()+ "');";
            System.out.println("str");
            ResultSet rsguarda = con.consulta(str);
            
            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Datos del denunciante guardados con exito")) {
                    System.out.println("Datos del denunciante guardados con exito");
                    this.id= Integer.parseInt(rsguarda.getString("id"));
                    return true;
                }else{
                    System.out.println("Ocurrio un error: saveDatosDenunciante() ");
                }
            }
            con.cierraConexion();
        } 
        catch (Exception e) {
            System.out.println(e + " saveDatosDenunciante()");
        }
        return false;

    }    
        
        
    private boolean saveDatosDenunciante(){
        
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaDatosDenunciante(0, '" 
                    + dd.getNombre_completo() + "', '" 
                    + dd.getEdad() + "', '" 
                    + dd.getGenero()+ "', '" 
                    + dd.getDomicilio()+ "', '" 
                    + dd.getTelefono()+ "', '" 
                    + dd.getCorreo()+ "', '" 
                    + dd.getUnidad_academica()+ "', '" 
                    + dd.getTurno()+ "', '" 
                    + dd.isAnonimo()+ "', '" 
                    + tt.getId()+ "');";
            System.out.println("str");
            ResultSet rsguarda = con.consulta(str);
            
            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Datos del denunciante guardados con exito")) {
                    System.out.println("Datos del denunciante guardados con exito");
                    dd.setId(Integer.parseInt(rsguarda.getString("id")));
                    
                    return true;
                }else{
                    System.out.println("Ocurrio un error: saveDatosDenunciante() ");
                }
            }
            con.cierraConexion();
        } 
        catch (Exception e) {
            System.out.println(e + " saveDatosDenunciante()");
        }
        return false;

    }    
    private boolean saveDatosTutor(){
        
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaDatosTutor(0, '" 
                    + tt.getNombre_completo() + "', '" 
                    + tt.getEdad() + "', '" 
                    + tt.getGenero()+ "', '" 
                    + tt.getDomicilio()+ "', '" 
                    + tt.getTelefono()+ "', '" 
                    + tt.getCorreo()+ "');";
            System.out.println("str");
            ResultSet rsguarda = con.consulta(str);
            
            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Datos del tutor guardados con exito")) {
                    System.out.println("Datos del tutor guardados con exito");
                    tt.setId(Integer.parseInt(rsguarda.getString("id")));
                    
                    return true;
                }else{
                    System.out.println("Ocurrio un error: saveDatosTutor() ");
                }
            }
            con.cierraConexion();
        } 
        catch (Exception e) {
            System.out.println(e + " saveDatosTutor()");
        }
        return false;

    }     
     
    private boolean saveDatosInvolucrado(){
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaDatosInvolucrado(0, '" 
                    + di.getNombre_completo() + "', '" 
                    + di.getDependencia_politecnico()+ "', '" 
                    + di.getTurno()+ "');";
            System.out.println("str");
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Datos del involucrado guardados con exito")) {
                    System.out.println("Datos del involucrado guardados con exito");
                    di.setId(Integer.parseInt(rsguarda.getString("id")));
                    return true; 
                }else{
                    System.out.println("Ocurrio un error: saveDatosInvolucrado() ");
                }
            }
            con.cierraConexion();
        } 
        catch (Exception e) {
            System.out.println(e + " saveDatosInvolucrado()");
        }
        return false;

    }        
    
    private boolean saveDescripcionHechos(){
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaHechos(0, '" 
                    + dh.getFecha() + "', '" 
                    + dh.getLugar()+ "', '" 
                    + dh.getDescripcion()+ "', '" 
                    + dh.getTestigos()+ "', '" 
                    + dh.getMedios()+ "', '" 
                    + dh.getMediosDescripcion()+ "', '" 
                    + dh.getOtros()+ "');";
            

            System.out.println("str");
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Hechos guardados con exito")) {
                    System.out.println("Hechos guardados con exito");
                    dh.setId( Integer.parseInt(rsguarda.getString("id")));
                    return true;
                }else{
                    System.out.println("Ocurrio un error: saveDescripcionHechos() ");
                }
            }
            con.cierraConexion();
        } 
        catch (Exception e) {
            System.out.println(e + " saveDescripcionHechos()");
        }
        return false;

    }        

    public ArrayList getDates(){
        ArrayList <Date> dates = new ArrayList <Date> ();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "select fecha from Denuncia;";
            ResultSet rsguarda = con.consulta(str);
            
            while (rsguarda.next()) {
                long db = rsguarda.getDate("fecha").getTime()-64800000;
                dates.add(new Date(db));

            }
//            System.out.println(dates.toString());
            con.cierraConexion();
        } 
        catch (Exception e) {
            System.out.println(e + " getDates()");
        }
        return dates;
    }

    public ArrayList getDenunciasByDate(String date){
        ArrayList <Integer> ids = new ArrayList <Integer> ();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call consultarDenunciasByDate('" + date+ "');";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {     
                ids.add(rsguarda.getInt("id"));
            }
            con.cierraConexion();
        } 
        catch (Exception e) {
            System.out.println(e + " getDenunciasByDate()");
        }
        return ids;
    }
    
    public boolean getDenunciaById(String id){
        Conexion con = new Conexion();
        boolean flg = false;
        try {
            con.conectar();
            String str = "call consultarDenunciaById('" + id+ "');";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {     
                    dd.setNombre_completo(rsguarda.getString("nombreDenunciante"));
                    dd.setEdad(rsguarda.getInt("edadDenunciante"));
                    dd.setGenero(rsguarda.getString("generoDenunciante"));
                    dd.setDomicilio(rsguarda.getString("domicilioDenunciante"));
                    dd.setTelefono(rsguarda.getString("telefonoDenunciante"));
                    dd.setCorreo(rsguarda.getString("correoDenunciante"));
                    dd.setUnidad_academica(rsguarda.getString("unidadDenunciante"));
                    dd.setTurno(rsguarda.getString("turnoDenunciante"));
                    dd.setAnonimo(rsguarda.getBoolean("anonimoDenunciante"));
                    
                    di.setNombre_completo(rsguarda.getString("nombreInvolucrado"));
                    di.setDependencia_politecnico(rsguarda.getString("dependenciaInvolucrado"));
                    di.setTurno(rsguarda.getString("turnoInvolucrado"));
                                       
                    dh.setFecha(rsguarda.getString("fechaHechos"));
                    dh.setLugar(rsguarda.getString("lugarHechos"));
                    dh.setDescripcion(rsguarda.getString("descripcionHechos"));
                    dh.setTestigos(rsguarda.getString("testigosHechos"));
                    dh.setMedios(rsguarda.getBoolean("mediosHechos"));
                    dh.setMediosDescripcion(rsguarda.getString("mediosDescripcionHechos"));
                    dh.setOtros(rsguarda.getString("otrosHechos"));
            }
            
            
            con.cierraConexion();
            
            if(dd.getEdad()<18)
                flg = getTutorByDenunciaId(id);

        } 
        catch (Exception e) {
            System.out.println(e + " getDenunciasByDate()");
        }
        return flg;
    }
    
    private boolean getTutorByDenunciaId(String id){
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call getTutorByDenunciaId('" + id+ "');";
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
            return true;
        } 
        catch (Exception e) {
            System.out.println(e + " getTutorByDenunciaId()");
        }
        return false;
    }
}
