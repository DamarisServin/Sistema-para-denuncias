package com.escom.prototipo.DTOs;

import com.escom.prototipo.DAOs.Profesor;
import com.escom.prototipo.conexion.Conexion;
import com.escom.validaciones.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author damar
 */
public class ProfesorDto {

    public Profesor getProfesorById(int id) {
        Conexion con = new Conexion();
        Profesor p = new Profesor();
        try {
            con.conectar();
            ResultSet rsVal = con.consulta("call spDatosUsuario(" + id + ");");

            while (rsVal.next()) {
                if (Integer.parseInt(rsVal.getString("id")) > 0) {
                    p.setId(id);
                    p.setNombre(rsVal.getString("nombre"));
                    p.setContrasena(rsVal.getString("contrasena"));
                    p.setCorreo(rsVal.getString("correo"));
                    p.setEscuela(rsVal.getString("escuela"));
                    p.setNo_poli(rsVal.getString("no_poli"));
                }
            }
            con.cierraConexion();

        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " getProfesorById()");
        }
        return p;
    }

    public boolean saveProfesor(Profesor p) {
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaProfesor(0, '"
                    + p.getCorreo() + "', '"
                    + p.getNombre() + "', '"
                    + p.getEscuela() + "', '"
                    + p.getNo_poli() + "', '"
                    + p.getContrasena() + "');";

            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                if (rsguarda.getString("Resultado").equals("Usuario guardado con exito")) {
                    p.setId(Integer.parseInt(rsguarda.getString("id")));

                }
                if (rsguarda.getString("Resultado").equals("Ya existe un usuario con ese correo")) {
                    System.out.println("Ya existe un usuario con ese correo");
                }
            }
            con.cierraConexion();
            return true;
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " saveProfesor()");
        }
        return false;
    }

    public boolean updateProfesor(Profesor p) {
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaProfesor("
                    + p.getId() + ", '"
                    + p.getCorreo() + "', '"
                    + p.getNombre() + "', '"
                    + p.getEscuela() + "', '"
                    + p.getNo_poli() + "', '"
                    + p.getContrasena() + "');";
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                System.out.println("Usuario Actualizado");
                con.cierraConexion();
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e + " updateProfesor()");
        }
        return false;
    }

    public boolean cambiarContrasena(String correo, String contrasena) {
        Conexion con = new Conexion();
        boolean flg = false;
        // contrasena = v.generateRandomString();

        try {
            con.conectar();
            String str = "call cambiarContrasena('" + correo + "', '" + contrasena + "');";
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                System.out.println("Usuario Actualizado");
                flg = true;
            }
            con.cierraConexion();
        } catch (SQLException e) {
            System.out.println(e + " cambiarContrasena()");
        }
        return flg;
    }

    public boolean logIn(String correo, String contrasena) {
        Conexion con = new Conexion();
        boolean flg = false;
        try {
            con.conectar();
            String str = "call sesionProfesor('" + correo + "', '" + contrasena + "');";

            ResultSet rsVal = con.consulta(str);
            if (rsVal.next()) {
                
                flg = true;

            }
            con.cierraConexion();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " logIn()");
        }
        return flg;
    }
}
