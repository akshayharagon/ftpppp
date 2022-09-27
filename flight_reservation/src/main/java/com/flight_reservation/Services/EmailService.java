package com.flight_reservation.Services;

import java.io.File;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
	public static void main(String[] args) {
		
	
	String messge="Hello this is your OTP";
	String from = "akshayh355@gmail.com";
	String to ="akshayharagon60@gmail.com";
	String subject="245655";
	
	sendEmail(messge, from, to, subject);
	sendMailWithAttach(messge, from, to, subject);
	}
	public static void sendEmail(String subject, String message, String to, String from) {

		String host="smtp.gmail.com";
		
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		

		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication("akshayh355@gmail.com", "Akshay@125");
			}
		});
		
		
		session.setDebug(true);
		
		MimeMessage mimeMessage = new MimeMessage(session);
		try {
			mimeMessage.setFrom(from);
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			mimeMessage.setSubject(subject);
			mimeMessage.setText(message);
			
			Transport.send(mimeMessage);
			System.out.println("sent successfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}
	@SuppressWarnings("deprecation")
	public static void sendMailWithAttach(String subject, String message, String to, String from) {

		String host="smtp.gmail.com";
		
		Properties properties = System.getProperties();
		System.out.println(properties);
		
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "465");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		

		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication("akshayh355@gmail.com", "Akshay@125");
			}
		});
		
		
		session.setDebug(true);
		
		MimeMessage mimeMessage = new MimeMessage(session);
		try {
			mimeMessage.setFrom(from);
			mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			mimeMessage.setSubject(subject);
			
			String path="E:\\AKSHAY PSA\\AKshay resume\\DSC_3355.jpg";
			
			MimeMultipart mimeMultipart = new MimeMultipart();
			MimeBodyPart textMime = new MimeBodyPart();
			MimeBodyPart fileMime = new MimeBodyPart();
			
			try {
			textMime.setText(message);
			File file = new File(path);
		
				fileMime.attachFile(file);
				
				mimeMultipart.addBodyPart(textMime);
				mimeMultipart.addBodyPart(fileMime);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			mimeMessage.setContent(mimeMultipart);
			
			Transport.send(mimeMessage);
			System.out.println("sent successfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		
	}

}
