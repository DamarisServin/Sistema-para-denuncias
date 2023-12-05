/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.DAOs;

/**
 *
 * @author Damaris
 */
public class Denuncia {

    private String fecha;
    private Datos_denunciante oDenunciante;
    private Datos_involucrado oInvolucrado;
    private Descripcion_hechos oHechos;

    public Denuncia(String fecha, Datos_denunciante oDenunciante, Datos_involucrado oInvolucrado, Descripcion_hechos oHechos) {
        this.fecha = fecha;
        this.oDenunciante = oDenunciante;
        this.oInvolucrado = oInvolucrado;
        this.oHechos = oHechos;
    }



    
}
