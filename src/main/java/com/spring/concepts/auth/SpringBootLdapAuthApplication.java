package com.spring.concepts.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLdapAuthApplication {

	// reference : https://spring.io/guides/gs/authenticating-ldap/

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLdapAuthApplication.class, args);
	}

}
