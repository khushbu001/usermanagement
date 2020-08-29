package com.demo.registration.RegistrationForm;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

/**
 * @author khushii spring boot execution class
 *
 */
@SpringBootApplication
public class RegistrationFormApplication implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
    @Autowired
    Environment environment;
    public static void main(String[] args) {
        SpringApplication.run(RegistrationFormApplication.class, args);
    }
    Logger logger;
    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent embeddedServletContainerInitializedEvent) {
        System.out.println("Port " + embeddedServletContainerInitializedEvent.getApplicationContext().getEmbeddedServletContainer().getPort());
        try {
           logger.info("HOST Address " + InetAddress.getLocalHost().getHostAddress());
            logger.info("Host Name " + InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException e) {

        }
    }
}