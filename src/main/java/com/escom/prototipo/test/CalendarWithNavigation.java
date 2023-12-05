/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.escom.prototipo.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarWithNavigation extends JFrame {

    private JPanel calendarPanel;
    private Calendar currentMonth;

    public CalendarWithNavigation() {
        setTitle("Calendar with Navigation");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        currentMonth = Calendar.getInstance();
        calendarPanel = createMonthPanel(currentMonth);
        add(calendarPanel, BorderLayout.CENTER);

        JButton prevButton = new JButton("Previous Month");
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMonth.add(Calendar.MONTH, -1);
                updateCalendarPanel();
            }
        });

        JButton nextButton = new JButton("Next Month");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentMonth.add(Calendar.MONTH, 1);
                updateCalendarPanel();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        add(buttonPanel, BorderLayout.SOUTH);

        updateCalendarPanel();

        setVisible(true);
    }

    private void updateCalendarPanel() {
        remove(calendarPanel);
        calendarPanel = createMonthPanel(currentMonth);
        add(calendarPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private JPanel createMonthPanel(Calendar month) {
        JPanel monthPanel = new JPanel(new GridLayout(7, 7, 5, 5));

        // Set the month and year for the calendar
        month.set(Calendar.DAY_OF_MONTH, 1);

        // Add labels for day names (Sun, Mon, ..., Sat)
        String[] dayNames = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : dayNames) {
            JLabel label = new JLabel(day, JLabel.CENTER);
            monthPanel.add(label);
        }

        // Add empty labels for the days before the 1st day of the month
        int firstDayOfWeek = month.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < firstDayOfWeek; i++) {
            monthPanel.add(new JLabel(""));
        }

//        // Add labels for each day of the month
//        while (month.get(Calendar.MONTH) == currentMonth.get(Calendar.MONTH)) {
            JLabel label = new JLabel(String.valueOf(month.get(Calendar.DAY_OF_MONTH)), JLabel.CENTER);
            monthPanel.add(label);
            month.add(Calendar.DAY_OF_MONTH, 1);
//        }

        return monthPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalendarWithNavigation());
    }
}
