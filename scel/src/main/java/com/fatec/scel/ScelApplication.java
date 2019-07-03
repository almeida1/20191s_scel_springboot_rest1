package com.fatec.scel;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatec.scel.model.Aluno;
import com.fatec.scel.repository.AlunoRepository;

@SpringBootApplication
public class ScelApplication  {
  
    
	public static void main(String[] args) {
		SpringApplication.run(ScelApplication.class, args);
	}
  

}
