package com.fatec.scel.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.fatec.scel.services.DBService;

@Configuration
@Profile("test")

public class DevConfig {
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String estrategiaDeInstanciacaoDoDB; //none nao recria o db

	@Bean
	public boolean instanticiaTestDataBase() throws ParseException {
		if (!"create".equals(estrategiaDeInstanciacaoDoDB)) {
			return false;
		}
		dbService.instanciaDB();
     	return true;
	}
}