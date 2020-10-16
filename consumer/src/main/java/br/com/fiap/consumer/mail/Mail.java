package br.com.fiap.consumer.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.fiap.consumer.dto.DroneDTO;


public class Mail {
  
  public void EnviaMailTLS(DroneDTO drone) {

		final String username = "drone36scj@gmail.com";
		final String password = "@123@456";

		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587"); //Para SSL usar 465
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true"); // TLS

		Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("drone36scj@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("drone36scj@outlook.com"));//trocar este e-mail para um de sua configuração
			message.setSubject("Alerta - Seu Drone precisa de sua atenção!");
			message.setText("Dados coletados:" + "\n\n ID Drone: " + drone.getId()
					+ "\n Latitude: " + drone.getLatitude() + "\n Longitude" + drone.getLongitude() + "\n Temperatura: "
					+ drone.getTemperaturaAr() + "°C" + "\n Umidade do Ar: " + drone.getUmidadeAr() + "%") ;

			Transport.send(message);

			System.out.println("E-mail enviado com sucesso!");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
