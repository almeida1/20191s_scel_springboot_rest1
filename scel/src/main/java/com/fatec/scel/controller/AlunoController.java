package com.fatec.scel.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.scel.model.Aluno;
import com.fatec.scel.services.AlunoServices;

@RestController
@RequestMapping(value="/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoServices servico;
	
	@RequestMapping(value="/consultaId/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> pesquisarPorId(@PathVariable Integer id) {
		
		Optional<Aluno> aluno = servico.buscaPorId(id);
		return ResponseEntity.ok().body(aluno);
	}
	@RequestMapping(value="/consultaRa/{ra}", method=RequestMethod.GET)
	public ResponseEntity<?> pesquisarPorRa(@PathVariable String ra) {
		
		Optional<Aluno> aluno = servico.buscaPorRa(ra);
		return ResponseEntity.ok().body(aluno);
	}
}
