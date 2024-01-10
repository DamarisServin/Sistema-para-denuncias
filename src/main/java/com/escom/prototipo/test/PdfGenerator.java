/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.test;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PdfGenerator {

    // Método que genera un archivo PDF a partir de un texto
    public static void generarPdfDesdeTexto(String texto, String rutaPdf) {
        Document document = new Document();

        try {
            // Crear un objeto PdfWriter para escribir en el archivo PDF
            PdfWriter.getInstance(document, new FileOutputStream(rutaPdf));

            // Abrir el documento para agregar contenido
            document.open();

            // Agregar el texto al documento como un párrafo
            document.add(new Paragraph(texto));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar el documento después de haber terminado de agregar contenido
            if (document.isOpen()) {
                document.close();
            }
        }
    }

    public static void main(String[] args) {
        // Texto que se incluirá en el PDF
        String texto = "Este es un ejemplo de texto que será incluido en el PDF.";

        // Ruta del archivo PDF de salida
        String rutaPdf = "output.pdf";

        // Generar el PDF
        generarPdfDesdeTexto(texto, rutaPdf);

        System.out.println("PDF generado exitosamente en: " + rutaPdf);
    }
}
