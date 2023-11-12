
public class Profesor{
 
    String nombre_completo;
    String contrasena;
    String correo;
    String escuela;
    String no_poli;

    
    public void setNombreCompleto(String nombre, String ap_paterno, String ap_materno){
        this.nombre_completo =nombre+ap_paterno+ap_materno;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }

    public void setEscuela(String escuela){
        this.escuela = escuela;
    }
    
    public void setNoPoli(String no_poli){
        this.no_poli = no_poli;
    }

    public String getNombre(){
        return this.nombre_completo;
    }

    public String getContrasena(){
        return this.contrasena;
    }

    public String getCorreo(){
        return this.correo;
    }
    
    public String getNoPoli(){
        return this.no_poli;
    }


}