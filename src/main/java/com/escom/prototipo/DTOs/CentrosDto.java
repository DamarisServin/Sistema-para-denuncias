
package com.escom.prototipo.DTOs;

import com.escom.prototipo.conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author damar
 */
public class CentrosDto {

    public ArrayList getCentros() {
        ArrayList<com.escom.prototipo.DAOs.Centro_de_ayuda> centers = new ArrayList<>();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call getCentros();";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {

                centers.add(new com.escom.prototipo.DAOs.Centro_de_ayuda(rsguarda.getInt("id"), rsguarda.getString("nombre"), rsguarda.getString("direccion"), rsguarda.getString("contacto")));
            }

            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " getCentros()");
        }

        for (com.escom.prototipo.DAOs.Centro_de_ayuda c : centers) {
            c.setEspecialidad(getEspecialidadById(c.getId()));
        }
        return centers;

    }

    private ArrayList getEspecialidadById(int id) {
        ArrayList<String> esp = new ArrayList<>();
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call getEspecialidadById( '"
                    + id + "');";
            ResultSet rsguarda = con.consulta(str);

            while (rsguarda.next()) {
                esp.add(rsguarda.getString("nombre"));
            }
            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " getEspecialidadById()");
        }
        return esp;

    }
}
