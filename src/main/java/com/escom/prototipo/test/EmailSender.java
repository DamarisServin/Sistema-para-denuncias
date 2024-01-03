package com.escom.prototipo.test;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

    public static void main(String[] args) {
        // Sender's email address
        String from = "your.email@gmail.com";

        // Sender's password (use an application-specific password for security)
        String password = "your_password";

        // Recipient's email address
        String to = "recipient.email@example.com";

        // SMTP server details for Gmail
        String host = "smtp.gmail.com";
        int port = 587;

        // Set up JavaMail properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);

        // Create a session with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Create a MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // Set sender and recipient addresses
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set email subject and body
            message.setSubject("Test Email");
            message.setText("This is a test email sent from Java.");

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully.");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
