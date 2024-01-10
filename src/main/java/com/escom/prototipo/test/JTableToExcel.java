/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.test;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.table.TableModel;

public class JTableToExcel {

    // Método que convierte una JTable a un archivo Excel
    
    public static void convertirJTableAExcel(JTable table, String rutaExcel) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Datos");

        // Obtener el modelo de la tabla
        TableModel model = table.getModel();

        // Crear la fila de encabezado
        Row headerRow = sheet.createRow(0);
        for (int col = 0; col < model.getColumnCount(); col++) {
            Cell cell = headerRow.createCell(col);
            cell.setCellValue(model.getColumnName(col));
        }

        // Llenar el contenido de la tabla
        for (int row = 0; row < model.getRowCount(); row++) {
            Row excelRow = sheet.createRow(row + 1);
            for (int col = 0; col < model.getColumnCount(); col++) {
                Cell cell = excelRow.createCell(col);
                cell.setCellValue(model.getValueAt(row, col).toString());
            }
        }

        // Escribir el libro de trabajo a un archivo Excel
        try (FileOutputStream outputStream = new FileOutputStream(rutaExcel)) {
            workbook.write(outputStream);
            System.out.println("Archivo Excel creado exitosamente en: " + rutaExcel);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Crear una tabla de ejemplo
        String[] columnNames = {"Nombre", "Edad", "Ciudad"};
        Object[][] data = {
                {"Juan", 25, "Ciudad A"},
                {"María", 30, "Ciudad B"},
                {"Carlos", 22, "Ciudad C"}
        };
        JTable table = new JTable(data, columnNames);

        // Ruta del archivo Excel de salida
        String rutaExcel = "output.xlsx";

        // Convertir la tabla a un archivo Excel
        convertirJTableAExcel(table, rutaExcel);
    }
}
