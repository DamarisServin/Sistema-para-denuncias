package com.escom.prototipo.DTOs;

import com.escom.prototipo.DAOs.Usuario;
import com.escom.prototipo.conexion.Conexion;
import com.escom.validaciones.Validaciones;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author damar
 */
public class UsuarioDto {

    public Usuario getUsuarioById(int id) {
        Conexion con = new Conexion();
        Usuario p = new Usuario();
        try {
            con.conectar();
            ResultSet rsVal = con.consulta("call consultarUsuarioById(" + id + ");");

            while (rsVal.next()) {
                if (Integer.parseInt(rsVal.getString("id")) > 0) {
                    p.setId(id);
                    p.setNombre(rsVal.getString("nombre"));
                    p.setContrasena(rsVal.getString("contrasena"));
                    p.setCorreo(rsVal.getString("correo"));
                    p.setEscuela(rsVal.getString("escuela"));
                    p.setNo_poli(rsVal.getString("no_poli"));
                    p.setRol(rsVal.getString("rol"));
                }
            }
            con.cierraConexion();

        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " getUsuarioById()");
        }
        return p;
    }

    public boolean saveUsuario(Usuario p) {
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaUsuario(0, '"
                    + p.getCorreo() + "', '"
                    + p.getNombre() + "', '"
                    + p.getEscuela() + "', '"
                    + p.getNo_poli() + "', '"
                    + p.getContrasena() + "', '"
                    + p.getRol() + "');";

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
            System.out.println(e + " saveUsuario()");
        }
        return false;
    }

    public boolean updateUsuario(Usuario p) {
        Conexion con = new Conexion();
        try {
            con.conectar();
            String str = "call guardaUsuario("
                    + p.getId() + ", '"
                    + p.getCorreo() + "', '"
                    + p.getNombre() + "', '"
                    + p.getEscuela() + "', '"
                    + p.getNo_poli() + "', '"
                    + p.getContrasena() + "', '"
                    + p.getRol() + "');";
            ResultSet rsguarda = con.consulta(str);

            if (rsguarda.next()) {
                System.out.println("Usuario Actualizado");
                con.cierraConexion();
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e + " updateUsuario()");
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

    public int logIn(String correo, String contrasena) {
        Conexion con = new Conexion();
        int aux = 0;

        try {
            con.conectar();
            String str = "call sesionUsuario('" + correo + "', '" + contrasena + "');";

            ResultSet rsVal = con.consulta(str);
            if (rsVal.next()) {
                
                aux = rsVal.getInt("idUsur");

            }
            con.cierraConexion();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + " logIn()");
        }
        return aux;
    }
}
