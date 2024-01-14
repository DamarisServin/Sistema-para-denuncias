/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.DAOs;

/**
 *
 * @author damar
 */
public class Estadisticas {
    private final int total;
    private final int menores;
    private final int femeninos;
    private final int masculinos;
    private final int anonimos;
    private final int alumnos;
    private final int trabajadores;
    private final int medios;
    private final int testigos;
    private final int unidades;

    public Estadisticas(int total, int menores, int femeninos, int masculinos, int anonimos, int alumnos, int trabajadores, int medios, int testigos, int unidades) {
        this.total = total;
        this.menores = menores;
        this.femeninos = femeninos;
        this.masculinos = masculinos;
        this.anonimos = anonimos;
        this.alumnos = alumnos;
        this.trabajadores = trabajadores;
        this.medios = medios;
        this.testigos = testigos;
        this.unidades = unidades;
    }
    
    

    public int getTotal() {
        return total;
    }

    public int getMenores() {
        return menores;
    }

    public int getFemeninos() {
        return femeninos;
    }

    public int getMasculinos() {
        return masculinos;
    }

    public int getAnonimos() {
        return anonimos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public int getTrabajadores() {
        return trabajadores;
    }

    public int getMedios() {
        return medios;
    }

    public int getTestigos() {
        return testigos;
    }

    public int getUnidades() {
        return unidades;
    }
    
    
}
