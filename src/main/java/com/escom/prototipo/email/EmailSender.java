package com.escom.prototipo.email;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

    private String to;
    private String msg;

    public EmailSender() {
    }

    public EmailSender(String to, String msg) {
        this.to = to;
        this.msg = msg;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setNewPasMsg(String str) {
        msg = "Recibimos una solicitud de contraseña de este correo. Tu nueva contraseña es "+
                str+
                " Si tu no solicitaste este cambio, haz caso omiso de este mensaje.";
        
    }
    

    
    public boolean sendMail() {
        // Sender's email address
        String from = "sistemadenuncias56@gmail.com";

        // Sender's password (use an application-specific password for security)
        String password = "yzir klov mbez vfhd";

        // SMTP server details for Gmail
        String host = "smtp.gmail.com";
        int port = 587;

        // Set up JavaMail properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.ssl.trust", host);
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
            message.setSubject("Sistema de Denuncias Email");
            message.setText(msg);

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully.");

            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return false;
    }

}
