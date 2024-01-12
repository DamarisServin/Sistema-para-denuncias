package com.escom.prototipo.DAOs;

/**
 *
 * @author damar
 */
public class Tutor {

    private int id;

    private String nombre_completo;
    private int edad;
    private String genero;
    private String domicilio;
    private String telefono;
    private String correo;

    public Tutor() {
    }

    public Tutor(String nombre_completo, int edad, String genero, String domicilio, String telefono, String correo) {

        this.nombre_completo = nombre_completo;
        this.edad = edad;
        this.genero = genero;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correo = correo;
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

    public int getGeneroIndex() {
        if (genero.contentEquals("Masculino")) {
            return 1;
        } else {
            return 2;
        }
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

}
