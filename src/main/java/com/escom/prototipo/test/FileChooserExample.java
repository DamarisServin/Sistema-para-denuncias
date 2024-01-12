/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.test;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileChooserExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("File Chooser Example");
        JButton button = new JButton("Abrir File Chooser");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();

                // Muestra el file chooser y captura la respuesta del usuario
                int returnValue = fileChooser.showOpenDialog(null);

                // Si el usuario selecciona un archivo, imprime la ruta del archivo
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    System.out.println("Archivo seleccionado: " + fileChooser.getSelectedFile().getAbsolutePath());
                }
            }
        });

        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
