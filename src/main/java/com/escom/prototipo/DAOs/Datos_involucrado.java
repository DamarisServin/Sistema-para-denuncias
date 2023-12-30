package com.escom.prototipo.DAOs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author damar
 */
public class Datos_involucrado {
    private int id;
     private String nombre_completo;
     private String dependencia_politecnico;
     private String turno;

    public Datos_involucrado(String nombre_completo, String dependencia_politecnico, String turno) {
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
        this.nombre_completo= nombre;
    }
    public void setNombre_completo(String nombre, String ap_paterno, String ap_materno) {
        this.nombre_completo = nombre+ap_paterno+ap_materno;
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
     
}
