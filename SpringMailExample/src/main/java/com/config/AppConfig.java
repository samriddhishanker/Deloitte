package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Body;
import com.From;
import com.Mail;
import com.Subject;
import com.To;


@Configuration
public class AppConfig {

	@Bean
	public Mail getMail() {
		return new Mail();
	}
	
	@Bean
	public To getTo() {
		return new To();
	}
	
	@Bean
	public From getFrom() {
		return new From();
	}
	
	@Bean
	public Subject getSubject() {
		return new Subject();
	}
	
	@Bean
	public Body getBody() {
		return new Body();
	}
}
