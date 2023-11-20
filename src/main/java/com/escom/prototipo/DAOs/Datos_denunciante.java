package com.escom.prototipo.DAOs;

public class Datos_denunciante{

    private String fecha;
    private String nombre_completo;
    private int edad;
    private String genero;
    private String domicilio;
    private String telefono;
    private String correo;
    private String unidad_academica;
    private String turno;
    private boolean anonimo;

    public Datos_denunciante(String fecha, String nombre_completo, int edad, String genero, String domicilio, String telefono, String correo, String unidad_academica, String turno, boolean anonimo) {
        this.fecha = fecha;
        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.genero = genero;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correo = correo;
        this.unidad_academica = unidad_academica;
        this.turno = turno;
        this.anonimo = anonimo;
    }

    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUnidad_academica() {
        return unidad_academica;
    }

    public void setUnidad_academica(String unidad_academica) {
        this.unidad_academica = unidad_academica;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public boolean isAnonimo() {
        return anonimo;
    }

    public void setAnonimo(boolean anonimo) {
        this.anonimo = anonimo;
    }




    
}