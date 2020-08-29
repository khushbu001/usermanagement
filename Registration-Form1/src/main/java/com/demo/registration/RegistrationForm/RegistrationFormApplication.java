package com.demo.registration.RegistrationForm;

import java.net.InetAddress;

import java.net.UnknownHostException;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.context.ServletWebServerInitializedEvent;

/**
 * @author khushii spring boot execution class
 *
 */
@SpringBootApplication
public class RegistrationFormApplication /* implements ApplicationListener<ServletWebServerInitializedEvent> */ {
	static ServletWebServerInitializedEvent embeddedServletContainerInitializedEvent;
	private static final Logger logger = (Logger) LogManager.getLogger(RegistrationFormApplication.class);
	public static void main(String[] args) { 
		int port =embeddedServletContainerInitializedEvent.getApplicationContext().getWebServer().getPort();
//		logger.info(port);
		System.out.println(
				"Port " + embeddedServletContainerInitializedEvent.getApplicationContext().getWebServer().getPort());
		
		try {
			String s = InetAddress.getLocalHost().getHostAddress();
			System.out.println("HOST Address " + InetAddress.getLocalHost().getHostAddress());
			String s1 = InetAddress.getLocalHost().getHostName();
			System.out.println("Host Name " + InetAddress.getLocalHost().getHostName());
		} catch (UnknownHostException e) {

		}

		SpringApplication.run(RegistrationFormApplication.class, args);
	}
}