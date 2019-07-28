package com.fatec.scel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.scel.model.Aluno;
import com.fatec.scel.model.Emprestimo;
import com.fatec.scel.model.Livro;

import com.fatec.scel.services.EmprestimoServices;

@RestController
@RequestMapping(value="/api")
public class EmprestimoController {
	//insert into aluno values ('1111', 'jose@hotmail.com', 'Jose da Silva');
	//insert into aluno values ('2222', 'xaviera@hotmail.com', 'Silva Xavier');
	//insert into aluno values ('3333', 'maria@hotmail.com', 'Maria Fonseca');
	//insert into livro values ('aaaa', 'Presman', ' Engenharia de Software');
	//insert into emprestimo values (1,'','20/07/2019','18/07/2019','1111','aaaa'); 
	//nr dtdevolucao dtprev dtemp ra isbn
	
	@Autowired
	private EmprestimoServices servico;
	
	@RequestMapping(value = "/emprestimo", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Object> getTodos() {
		return new ResponseEntity<>(servico.findAll(), HttpStatus.OK);
	}
	@RequestMapping(value = "/emprestimos", method = RequestMethod.POST)
	public ResponseEntity<Object> registraEmprestimo(@RequestBody Emprestimo emprestimo ) {
		return servico.save(emprestimo);
	}
}
