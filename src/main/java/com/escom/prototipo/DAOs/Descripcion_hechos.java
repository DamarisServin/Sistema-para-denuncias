/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.DAOs;

/**
 *
 * @author damar
 */
public class Descripcion_hechos {
    private String fecha;
    private String lugar;
    private String descripcion;
    private String testigos;

    public Descripcion_hechos(String fecha, String lugar, String descripcion, String testigos) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.testigos = testigos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTestigos() {
        return testigos;
    }

    public void setTestigos(String testigos) {
        this.testigos = testigos;
    }
    
    
    
}
