package com.escom.prototipo.DAOs;

public class Datos_denunciante{

    private int id;

    private String nombre_completo;
    private int edad;
    private String genero;
    private String domicilio;
    private String telefono;
    private String correo;
    private String ocupacion;
    private String unidad_academica;
    private String turno;
    private boolean anonimo;
    private String semestre;
    private String grupo;
    private String carrera;
    private String funcion;
    private String contrato;

    public Datos_denunciante() {
    }

    
    public Datos_denunciante( String nombre_completo, int edad, String genero, String domicilio, String telefono, String correo, String ocupacion, String unidad_academica, String turno, boolean anonimo) {

        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.genero = genero;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correo = correo;
        this.ocupacion = ocupacion;
        this.unidad_academica = unidad_academica;
        this.turno = turno;
        this.anonimo = anonimo;

    }
    public void setAlumnoDenunciante(String sm, String gp, String cr){
        this.semestre = sm;
        this.grupo= gp;
        this.carrera = cr;
    }
    public void setTrabajadorDenunciante(String fn, String ct){
        this.contrato = ct;
        this.funcion= fn;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getSemestre() {
        return semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getFuncion() {
        return funcion;
    }

    public String getContrato() {
        return contrato;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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