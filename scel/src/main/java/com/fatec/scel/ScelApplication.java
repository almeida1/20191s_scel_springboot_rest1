package com.fatec.scel;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fatec.scel.model.Aluno;
import com.fatec.scel.repository.AlunoRepository;

@SpringBootApplication
public class ScelApplication implements CommandLineRunner {
    @Autowired
	AlunoRepository alunoRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(ScelApplication.class, args);
	}
    //executa alguns comandos quando a aplicacao iniciar
	//neste caso carrega a base para simulacao
	@Override
	public void run(String... args) throws Exception {
		
		Aluno aluno1 = new Aluno("1111", "Jose da Silva", "jose@gmail.com");
		Aluno aluno2 = new Aluno("2222", "Carlos Souza", "carlos@gmail.com");
		alunoRepository.saveAll(Arrays.asList(aluno1,aluno2));
		//alunoRepository.save(aluno1);
		//alunoRepository.save(aluno2);
	}

}
