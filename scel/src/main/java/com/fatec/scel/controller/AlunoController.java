package com.fatec.scel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.scel.model.Aluno;

@RestController
@RequestMapping(value="/alunos")
public class AlunoController {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Aluno> listar() {
		
		Aluno aluno1 = new Aluno (1,"1111","jose da silva", "jose@gmail.com");
		Aluno aluno2 = new Aluno (2,"1111","jose da silva", "jose@gmail.com");
		List<Aluno> lista = new ArrayList<>();
		lista.add(aluno1);
		lista.add(aluno2);
		return lista;
	}

}
