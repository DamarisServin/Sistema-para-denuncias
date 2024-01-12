package com.escom.prototipo.DAOs;

/**
 *
 * @author Damaris
 */
public class Denuncia {

    private int id;
    private String fecha;
    private Datos_denunciante dd;
    private Datos_involucrado di;
    private Descripcion_hechos dh;

    public Denuncia() {
    }

    public Denuncia(String fecha, Datos_denunciante oDenunciante, Datos_involucrado oInvolucrado, Descripcion_hechos oHechos) {
        this.fecha = fecha;
        this.dd = oDenunciante;
        this.di = oInvolucrado;
        this.dh = oHechos;
    }
    public Denuncia(int id, String fecha, Datos_denunciante oDenunciante, Datos_involucrado oInvolucrado, Descripcion_hechos oHechos) {
        this.id = id;
        this.fecha = fecha;
        this.dd = oDenunciante;
        this.di = oInvolucrado;
        this.dh = oHechos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Datos_denunciante getDd() {
        return dd;
    }

    public void setDd(Datos_denunciante dd) {
        this.dd = dd;
    }

    public Datos_involucrado getDi() {
        return di;
    }

    public void setDi(Datos_involucrado di) {
        this.di = di;
    }

    public Descripcion_hechos getDh() {
        return dh;
    }

    public void setDh(Descripcion_hechos dh) {
        this.dh = dh;
    }

}
