package com.sha2.springbootbootseller2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringBootBootSeller2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBootSeller2Application.class, args);
	}

}
