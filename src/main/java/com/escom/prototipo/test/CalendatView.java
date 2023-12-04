/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendatView extends JFrame {

    private DefaultTableModel tableModel;
    private JTable calendarTable;
    private JLabel monthLabel;

    public CalendatView() {
        setTitle("Calendar View");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a table model
        tableModel = new DefaultTableModel();
        calendarTable = new JTable(tableModel);

        // Set up the calendar table
        calendarTable.setCellSelectionEnabled(true);
        calendarTable.setRowHeight(40);
        JScrollPane scrollPane = new JScrollPane(calendarTable);
        add(scrollPane, BorderLayout.CENTER);

        // Create a label for the month
        monthLabel = new JLabel("", JLabel.CENTER);
        monthLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        add(monthLabel, BorderLayout.NORTH);

        // Set the current month and year
        Calendar calendar = new GregorianCalendar();
        updateCalendar(calendar);

        // Add a selection listener to the table
        ListSelectionModel selectionModel = calendarTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(e -> {
            int selectedRow = calendarTable.getSelectedRow();
            int selectedColumn = calendarTable.getSelectedColumn();
            if (selectedRow >= 0 && selectedColumn >= 0) {
                int day = (int) calendarTable.getValueAt(selectedRow, selectedColumn);
                System.out.println("Selected Date: " + day);
            }
        });
    }

    private void updateCalendar(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);

        // Set the month label
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        monthLabel.setText(monthNames[month] + " " + year);

        // Clear the table
        tableModel.setColumnCount(0);
        tableModel.setRowCount(0);

        // Set up the table columns
        String[] daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : daysOfWeek) {
            tableModel.addColumn(day);
        }

        // Set up the table rows
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int maxDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        int row = 0;
        int col = 0;

        for (int i = 0; i < startDay; i++) {
            tableModel.addRow(new Object[]{""});
            col++;
        }

        for (int i = 1; i <= maxDays-1; i++) {
            tableModel.setValueAt(i, row, col);
            col++;
            if (col == 7) {
                col = 0;
                row++;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalendatView calendarView = new CalendatView();
            calendarView.setVisible(true);
        });
    }
}
