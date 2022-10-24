package com.api.doacaopontos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DoacaoPontosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoacaoPontosApplication.class, args);
	}

}
