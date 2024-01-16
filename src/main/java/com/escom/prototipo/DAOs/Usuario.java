package com.escom.prototipo.DAOs;

public class Usuario {

    private int id;
    private String contrasena;
    private String correo;
    private String escuela;
    private String no_poli;
    private String nombre;
    private String rol;
//    private String ap_paterno;
//    private String ap_materno;

    public Usuario() {
    }

    public Usuario(String contrasena, String correo) {
        this.contrasena = contrasena;
        this.correo = correo;
    }

    public Usuario(String nombre, String ap_paterno, String ap_materno, String contrasena, String correo, String escuela, String no_poli, String rol) {
        this.contrasena = contrasena;
        this.correo = correo;
        this.escuela = escuela;
        this.no_poli = no_poli;
        this.nombre = nombre + " " + ap_paterno + " " + ap_materno;
        this.rol = rol;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
