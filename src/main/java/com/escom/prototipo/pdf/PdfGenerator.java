/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.pdf;

import com.escom.prototipo.DAOs.Denuncia;
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
    Font blueFont = FontFactory.getFont(FontFactory.COURIER, 12, Font.BOLD, new CMYKColor(255, 0, 0, 0));
    Font redFont = FontFactory.getFont(FontFactory.COURIER, 14, Font.BOLD, new CMYKColor(0, 255, 0, 0));
    Font boldFont = FontFactory.getFont(FontFactory.COURIER_BOLD, 12, Font.BOLD, new CMYKColor(0, 0, 0, 255));

    public void createPDF(String rutaPdf, Denuncia d){
    
            Document document = new Document();
            
            try {
                // Crear un objeto PdfWriter para escribir en el archivo PDF
                PdfWriter.getInstance(document, new FileOutputStream(rutaPdf));

                // Abrir el documento para agregar contenido
                document.open();

                // Agregar el texto al documento como un párrafo
                document.add(new Paragraph(""));
                
                Paragraph chapterTitle = new Paragraph("FORMATO DE DENUNCIA", redFont);
                Chapter chapter1 = new Chapter(chapterTitle, 1);
                chapter1.setNumberDepth(0);
                Paragraph sectionTitle = new Paragraph("Datos de la persona que presenta la denuncia", blueFont);
                Section section1 = chapter1.addSection(sectionTitle);

                Paragraph sectionContent = new Paragraph("Fecha de la denuncia: "+d.getFecha());
                section1.add(sectionContent);
                
                sectionContent = new Paragraph("Nombre Completo: "+d.getDd().getNombre_completo());
                section1.add(sectionContent);
                sectionContent = new Paragraph("Edad: "+d.getDd().getEdad() +" años");
                section1.add(sectionContent);
                sectionContent = new Paragraph("Género: "+d.getDd().getGenero());
                section1.add(sectionContent);
                sectionContent = new Paragraph("Domicilio: "+d.getDd().getDomicilio());
                section1.add(sectionContent);
                sectionContent = new Paragraph("Correo Electrónico: "+d.getDd().getCorreo());
                section1.add(sectionContent);
                sectionContent = new Paragraph("Ocupación: "+d.getDd().getOcupacion());
                section1.add(sectionContent);
                sectionContent = new Paragraph("Unidad Académica de Procedencia: "+d.getDd().getUnidad_academica());
                section1.add(sectionContent);
                sectionContent = new Paragraph("Turno: "+d.getDd().getTurno());
                section1.add(sectionContent);
                
                //Campos alumno trabajador, tutor
                
                sectionTitle = new Paragraph("Datos de la persona involucrada", blueFont);
                section1 = chapter1.addSection(sectionTitle);
                sectionContent = new Paragraph("Nombre completo de quien se presenta la denuncia: "+d.getDi().getNombre_completo());
                section1.add(sectionContent);
                sectionContent = new Paragraph("Dependencia politecnica de procedencia: "+d.getDi().getNombre_completo());
                section1.add(sectionContent);
                sectionContent = new Paragraph("Turno: "+d.getDi().getNombre_completo());
                section1.add(sectionContent);

                sectionTitle = new Paragraph("Descripcion de los Hechos", blueFont);
                section1 = chapter1.addSection(sectionTitle);
                sectionContent = new Paragraph("Fecha en la que ocurrieron los hechos: "+d.getDh().getFecha());
                section1.add(sectionContent);
                sectionContent = new Paragraph("Lugar donde ocurrieron los hechos: "+d.getDh().getLugar());
                section1.add(sectionContent);
                sectionContent = new Paragraph("Describa cómo ocurrieron los hechos: "+d.getDh().getDescripcion());
                section1.add(sectionContent);

                sectionTitle = new Paragraph("Testigos", blueFont);
                section1 = chapter1.addSection(sectionTitle);
                sectionContent = new Paragraph("Indique el nombre completo de los principales testigos en caso de tenerlos y datos de localización: "
                        +d.getDh().getFecha());
                section1.add(sectionContent);
                
                sectionTitle = new Paragraph("Medios Probatorios", blueFont);
                section1 = chapter1.addSection(sectionTitle);
                sectionContent = new Paragraph("¿Cuenta con documentos que sustenten su denuncia o algún elemento probatorio adicional? "
                        +d.getDh().getMediosString());
                section1.add(sectionContent);  
                if(d.getDh().getMedios()){
                sectionContent = new Paragraph("Favor de describirlos y adjuntarlos al presente: "+d.getDh().getMediosDescripcion());
                section1.add(sectionContent);
                
                //VER SI SE PUEDE AÑADIR EL ARCHIVO
                }
                sectionContent = new Paragraph("En caso de no contar con ellos, pero que sepa de su existencia, indique dónde se localizan o a quíen le consta: "
                        +d.getDh().getOtros());
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
