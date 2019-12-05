package com.afersys.ng8boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication
public class Ng8bootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ng8bootApplication.class, args);
	}
}
