package com.fatec.scel.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.fatec.scel.services.DBService;

@Configuration
@Profile("test")

public class TestConfig {
	@Autowired
	private DBService dbService;
	@Bean
	public boolean instanticiaTestDataBase() throws ParseException {
		dbService.instanciaDB();
     	return true;

	}


}