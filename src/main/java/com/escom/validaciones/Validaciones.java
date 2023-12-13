/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.validaciones;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author damar
 */
public class Validaciones {
    int number;
    
    public int getNumber(){
        return number;
    }
    
    public boolean isHour(String str){
        String patron = "^\\d{2}:\\d{2}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return true;
        }
        System.out.println("Hora incorrecta");
        return false;
    }
    public String getDate(String dd, String mm, String aa, String hh){
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date newDate=null;
        try {
            newDate = df.parse(aa +"/"+ mm +"/"+dd+" "+hh+":00");
        } catch (ParseException ex) {
            System.out.println("Error" +ex);
        }
//        System.out.println("Fecha convertida: " + newDate);
        return newDate.toString();
    }
    public boolean isNumber(String str){
        try {
            number = Integer.parseInt(str);
            return true;            
        } catch (NumberFormatException e) {
            System.out.println("Numero Inválido");
         }
        number = 0;
        return false;
    }
    public boolean isEmail(String str){
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if(!matcher.matches()){
            System.out.println("El correo no cumple con el formato correcto");
            JOptionPane.showMessageDialog(null, "El correo proporcionado no cumple con el formato correcto", "Campo vacío", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
        
    }
    
            
}
