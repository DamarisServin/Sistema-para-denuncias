package com.escom.prototipo.DAOs;

public class Datos_involucrado {

    private int id;
    private String nombre_completo;
    private String dependencia_politecnico;
    private String turno;
    private String semestre;
    private String grupo;
    private String puesto;
    private String nombre_jefe;

    public Datos_involucrado() {
    }

    public Datos_involucrado(String nombre_completo, String dependencia_politecnico, String turno) {
        this.nombre_completo = nombre_completo;
        this.dependencia_politecnico = dependencia_politecnico;
        this.turno = turno;
    }
    
    public Datos_involucrado(int id, String nombre_completo, String dependencia_politecnico, String turno) {
        this.id =id;
        this.nombre_completo = nombre_completo;
        this.dependencia_politecnico = dependencia_politecnico;
        this.turno = turno;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre) {
        this.nombre_completo = nombre;
    }

    public void setNombre_completo(String nombre, String ap_paterno, String ap_materno) {
        this.nombre_completo = nombre + ap_paterno + ap_materno;
    }

    public String getDependencia_politecnico() {
        return dependencia_politecnico;
    }

    public void setDependencia_politecnico(String dependencia_politecnico) {
        this.dependencia_politecnico = dependencia_politecnico;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre_jefe() {
        return nombre_jefe;
    }

    public void setNombre_jefe(String nombre_jefe) {
        this.nombre_jefe = nombre_jefe;
    }

}
