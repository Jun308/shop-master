package utils;

import config.IEmailConfig;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 *
 * @author Shado
 */
public class AutoSendMail {

    /**
     * Auto Send Mail only gmail
     * 
     * @param userEmail
     * @param subject
     * @param text
     */
    public static void sentEmail(String userEmail, String subject, String text) {
        // TODO
        // Change to configuration file

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        Session session = Session.getInstance(props,
                new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(IEmailConfig.EMAIL, IEmailConfig.PASSWORD);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(IEmailConfig.EMAIL));
            message.setReplyTo(InternetAddress.parse(IEmailConfig.PASSWORD));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(userEmail));
            message.setSubject(subject);
            message.setText(text);

            Transport.send(message);

            System.out.println("Sent email done!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void main(String[] args) {
        AutoSendMail.sentEmail("tanpvse05645@fpt.edu.vn", IEmailConfig.SUBJECT, "xxxxxxxxxx");
    }

}
