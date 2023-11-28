/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.escom.prototipo.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author Damaris
 */
public class Prototipo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(df.format(date));
        System.out.println(date);

        System.out.println(date.getDate());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
    }
}
