package com.mx.CrudContacto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmailService {

	@Autowired
	JavaMailSender emailSender;
	
	@Value("${spring.mail.username}")
	private String email;
	
	public void sendEmail(String emailTo, String fecha, String text) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(email);
		message.setTo(emailTo);
		message.setSubject("Contacto el :" + fecha);
		message.setText(text);
		emailSender.send(message);
		
	}
	
}
