/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.validaciones;

import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author damar
 */
public class Validaciones {

    
    public boolean isLettersNumbers(String str){
        String regex = "^[a-zA-Z0-9\\s]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
        public boolean isPhone(String str){
        String regex = "^[()+0-9]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
    public boolean isLetters(String str){
        String regex = "^[a-zA-Z\\s]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }

    public boolean isEdad(String str){
        boolean flag = false;
        int edad;
        if (!str.isEmpty())
            try {
                edad= Integer.parseInt(str);
                if(edad >= 5 && edad <= 150){
                    flag = true;
                }

            } catch (NumberFormatException e) {
                System.out.println("Numero Inválido");
             }
        else
            flag = true;
        return flag;
    }
    
    public boolean isHour(String str){
        String patron = "^\\d{2}:\\d{2}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
    public String getDate(String dd, String mm, String aa, String hh){
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date newDate = null;
        try {
            newDate = df.parse(aa +"/"+ mm +"/"+dd+" "+hh+":00");
        } catch (ParseException ex) {
            System.out.println("Error" +ex);
        }
        System.out.println("Fecha convertida: " + newDate);

        return df.format(newDate);
    }
    public boolean isNumber(String str){
        boolean flag = false;
        if (!str.isEmpty())
            try {
                Integer.parseInt(str);
                return true;            
            } catch (NumberFormatException e) {
                System.out.println("Numero Inválido");
            }
        else
            flag = true;
        return flag;
    }
    public boolean isEmail(String str){
        boolean flag = false;
        if (!str.isEmpty()){
            String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            flag = matcher.matches();
        }
        else
            flag = true;
        return flag;
    }
    
    public String generateRandomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder(16);
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < 16; i++) {
            int randomIndex = random.nextInt(characters.length());
            randomString.append(characters.charAt(randomIndex));
        }

        return randomString.toString();
    }

        
}
