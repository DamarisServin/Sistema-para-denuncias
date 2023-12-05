package com.escom.prototipo.DAOs;

import com.escom.prototipo.conexion.Conexion;
import java.sql.ResultSet;


public class Profesor{
 
    private int id;
    private String contrasena;
    private String correo;
    private String escuela;
    private String no_poli;
    private String nombre;
    private String ap_paterno;
    private String ap_materno;

    
    public Profesor(String nombre, String ap_paterno, String ap_materno, String contrasena, String correo, String escuela, String no_poli) {
        this.contrasena = contrasena;
        this.correo = correo;
        this.escuela = escuela;
        this.no_poli = no_poli;
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
    }
    
    public boolean getProfesorById(int id) {
        Conexion con = new Conexion();
        try {
            con.conectar();
            ResultSet rsVal = con.consulta("call spDatosUsuario(" + id + ");");            

            while (rsVal.next()) {
                if (Integer.parseInt(rsVal.getString("id")) > 0) {  
                    this.id = id;
                    this.nombre = rsVal.getString("nombre");
                    this.ap_paterno = rsVal.getString("ap_paterno");
                    this.ap_materno= rsVal.getString("ap_materno");
                    this.contrasena = rsVal.getString("contrasena");
                    this.correo = rsVal.getString("correo");
                    this.escuela = rsVal.getString("escuela");
                    this.no_poli = rsVal.getString("no_poli");
                }
            }
            con.cierraConexion();
            return true;

        } catch (Exception e) {
            this.id = 0;
            System.out.println("El usuario buscado no existe");
            System.out.println(e);
        }
        return false;
    }
    public boolean saveProfesor(){
        Conexion con = new Conexion();
        try {
            con.conectar();
            ResultSet rsguarda = con.consulta("call guardaProfesor(0, '" + correo + "', '" + nombre + "', '" + ap_paterno + "', '" + ap_materno + "', '" + escuela + "', '" + no_poli +"', "+contrasena+ ");");
            
            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Usuario guardado con exito")) {
                    this.id = Integer.parseInt(rsguarda.getString("id"));
                    
                }
                 if (rsguarda.getString("Resultado").equals("Ya existe un usuario con ese correo")) {
                     System.out.println("Ya existe un usuario con ese correo");
                }
            }
            con.cierraConexion();
            return true;
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    public boolean updateProfesor(int id){
        Conexion con = new Conexion();
        try {
            con.conectar();
            ResultSet rsguarda = con.consulta("call guardaProfesor(" + id + ", '" + correo + "', '" + nombre + "', '" + ap_paterno + "', '" + ap_materno + "', '" + escuela + "', '" + no_poli +"', "+contrasena+ ");");
            
            if (rsguarda.next()) {
                System.out.println("Usuario Actualizado");
                con.cierraConexion();
                return true;
            }
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getNo_poli() {
        return no_poli;
    }

    public void setNo_poli(String no_poli) {
        this.no_poli = no_poli;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

}