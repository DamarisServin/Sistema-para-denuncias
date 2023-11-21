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
     private String nombre_completo;
     private String dependencia_politecnico;
     private String turno;

    public String getNombre_completo() {
        return nombre_completo;
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
