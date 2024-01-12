package com.escom.prototipo.DAOs;


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

    public Centro_de_ayuda(int id, String nombre, String direccion, String contacto) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
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
