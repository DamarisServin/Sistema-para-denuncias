package com.escom.prototipo.DAOs;

/**
 *
 * @author damar
 */
public class Descripcion_hechos {

    private int id;
    private String fecha;
    private String lugar;
    private String descripcion;
    private String testigos;
    private boolean medios;
    private String mediosDescripcion;
    private String otros;
    private String archivo;

    public Descripcion_hechos() {
    }

    public Descripcion_hechos(String fecha, String lugar, String descripcion, String testigos, boolean medios, String mediosDescripcion, String otros) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.testigos = testigos;
        this.medios = medios;
        this.mediosDescripcion = mediosDescripcion;
        this.otros = otros;
    
    }
    
    public Descripcion_hechos(int id, String fecha, String lugar, String descripcion, String testigos, boolean medios, String mediosDescripcion, String otros) {
        this.id = id;
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.testigos = testigos;
        this.medios = medios;
        this.mediosDescripcion = mediosDescripcion;
        this.otros = otros;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMediosDescripcion() {
        return mediosDescripcion;
    }

    public void setMediosDescripcion(String mediosDescripcion) {
        this.mediosDescripcion = mediosDescripcion;
    }

    public boolean getMedios() {
        return medios;
    }

    public int getMediosIndex() {
        if (medios) {
            return 1;
        } else {
            return 0;
        }
    }

    public String getMediosString() {
        if (medios) {
            return "Si";
        } else {
            return "No";
        }
    }

    public void setMedios(boolean medios) {
        this.medios = medios;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
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

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

}
