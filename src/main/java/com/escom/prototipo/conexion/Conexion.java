package com.escom.prototipo.conexion;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    private String usrBD;
    private String passBD;
    private String urlBD;
    private String driverClassName;
    private Connection conn = null;
    private Statement estancia;
 
    public Conexion(String usuarioBD, String passwordBD, String url, String driverClassName) {
        this.usrBD = usuarioBD;
        this.passBD = passwordBD;
        this.urlBD = url;
        this.driverClassName = driverClassName;
    }
    public Conexion () {
        this.usrBD = "root";
        this.passBD = "root";
        this.urlBD = "jdbc:mysql://127.0.0.1:3306/DB1?serverTimezone=UTC";
        this.driverClassName = "com.mysql.cj.jdbc.Driver";
    }
    
    //metodos para establecer los valores de conexion a la BD
    public void setUsuarioBD(String usuario) throws SQLException {
        this.usrBD = usuario;
    }
    public void setPassBD(String pass) {
        this.passBD = pass;
    } 
    public void setUrlBD(String url) {
        this.urlBD = url;
    }
    public void setConn(Connection conn) {
        this.conn = conn;
    }
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    
    //Conexion a la BD
    public void conectar() throws SQLException {
        try { 
            this.conn = DriverManager.getConnection(urlBD, usrBD, passBD); 
            
        } catch (SQLException err) {
            System.out.println("Error " + err.getMessage());
        }
    }
    
    //Cerrar la conexion de BD
    public void cierraConexion() throws SQLException {
        this.conn.close();
    }
    
    //Metodos para ejecutar sentencias SQL
     public boolean archivo(String ruta, int id) {

        FileInputStream fis;
        File file = new File(ruta);

        try {
            fis = new FileInputStream(file);
        
            PreparedStatement preparedStatement = this.conn.prepareStatement("INSERT INTO Archivos (nombre_archivo, archivo, id_hechos) VALUES (?, ?, ?)");
            preparedStatement.setString(1, file.getName());
            preparedStatement.setBinaryStream(2, fis, (int) file.length());
            preparedStatement.setInt(3, id);

            preparedStatement.executeUpdate();
            System.out.println("Archivo guardado en la base de datos.");
            return true;
        } catch (FileNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
    
    public ResultSet consulta(String consulta) throws SQLException {
        this.estancia = (Statement) conn.createStatement();
        return this.estancia.executeQuery(consulta);
    } 

}

