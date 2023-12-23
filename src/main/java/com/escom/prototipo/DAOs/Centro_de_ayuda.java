/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.DAOs;

import com.escom.prototipo.conexion.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author damar
 */
public class Centro_de_ayuda {
    private int id;
    private String nombre;
    private String direccion;
    private String contacto; 
    private ArrayList<String> especialidad;

    public Centro_de_ayuda() {
    }

    public Centro_de_ayuda(int id,String nombre, String direccion, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    
    public ArrayList getCentros(){
        ArrayList <Centro_de_ayuda> centers = new ArrayList <Centro_de_ayuda> ();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call getCentros();";
            ResultSet rsguarda = con.consulta(str);
            
            while (rsguarda.next()) {
                
                centers.add(new Centro_de_ayuda(rsguarda.getInt("id"),rsguarda.getString("nombre"), rsguarda.getString("direccion"), rsguarda.getString("contacto")));
            }
            
            con.cierraConexion();
        } 
        catch (Exception e) {
            System.out.println(e + " getCentros()");
        }
        
        for (Centro_de_ayuda c : centers){
            c.setEspecialidad(getEspecialidadById(c.getId()));
        }
        return centers;
    
    }
        private ArrayList getEspecialidadById(int id){
        ArrayList <String> esp = new ArrayList <String> ();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call getEspecialidadById( '" 
                    + id + "');";
            ResultSet rsguarda = con.consulta(str);
            
            while (rsguarda.next()) {
                esp.add(rsguarda.getString("nombre"));
            }
            con.cierraConexion();
        } 
        catch (Exception e) {
            System.out.println(e + " getEspecialidadById()");
        }
        return esp;
    
    }
            
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(ArrayList<String> especialidad) {
        this.especialidad = especialidad;
    }


    
    
}
