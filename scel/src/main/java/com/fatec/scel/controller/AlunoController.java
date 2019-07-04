package com.fatec.scel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.scel.model.Aluno;
import com.fatec.scel.services.AlunoServices;

@RestController
@RequestMapping(value="/api")
public class AlunoController {
	//insert into aluno values ('1111', 'jose@hotmail.com', 'Jose da Silva')
	//insert into aluno values ('2222', 'xaviera@hotmail.com', 'Silva Xavier')
	//insert into aluno values ('3333', 'maria@hotmail.com', 'Maria Fonseca')
	@Autowired
	private AlunoServices servico;
	
	@RequestMapping(value = "/alunos", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> getTodos() {
		return new ResponseEntity<>(servico.findAll(), HttpStatus.OK);
	}
	@RequestMapping(value = "/alunos", method = RequestMethod.POST)
	public ResponseEntity<Object> cadastraAluno(@RequestBody Aluno aluno) {
		return servico.save(aluno);
	}
	
	@RequestMapping(value = "/alunos", method = RequestMethod.PUT)
	public ResponseEntity<Object> atualizaAluno(@RequestBody Aluno aluno) {
		return servico.update(aluno);
	}
	@RequestMapping(value="/alunos/{ra}", method=RequestMethod.GET)
	public ResponseEntity<?> pesquisarPorRa(@PathVariable String ra) {
		return servico.buscaPorRa(ra);
	}
	@RequestMapping(value = "/alunos/{ra}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> excluirLivro(@PathVariable("ra") String ra) {
		return servico.delete(ra);
	}
}
