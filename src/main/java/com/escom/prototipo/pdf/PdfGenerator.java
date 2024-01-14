/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.pdf;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.CMYKColor;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author damar
 */
public class PdfGenerator {
    Font blueFont = FontFactory.getFont(FontFactory.HELVETICA, 8, Font.NORMAL, new CMYKColor(255, 0, 0, 0));
    Font redFont = FontFactory.getFont(FontFactory.COURIER, 12, Font.BOLD, new CMYKColor(0, 255, 0, 0));
    Font yellowFont = FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 0, 255, 0));

    public void createPDF(String rutaPdf){
    
            Document document = new Document();
            
            try {
                // Crear un objeto PdfWriter para escribir en el archivo PDF
                PdfWriter.getInstance(document, new FileOutputStream(rutaPdf));

                // Abrir el documento para agregar contenido
                document.open();

                // Agregar el texto al documento como un párrafo
                document.add(new Paragraph(""));
                
                Paragraph chapterTitle = new Paragraph("Chapter Title", yellowFont);
                Chapter chapter1 = new Chapter(chapterTitle, 1);
                chapter1.setNumberDepth(0);
                Paragraph sectionTitle = new Paragraph("Section Title", redFont);
                Section section1 = chapter1.addSection(sectionTitle);

                Paragraph sectionContent = new Paragraph("Section Text content", blueFont);
                section1.add(sectionContent);

                document.add(chapter1);
            } catch (DocumentException | FileNotFoundException e) {
                System.out.println(e+ "PDF Generator");
            } finally {
                // Cerrar el documento después de haber terminado de agregar contenido
                if (document.isOpen()) {
                    document.close();
                }
            }
    }
}
