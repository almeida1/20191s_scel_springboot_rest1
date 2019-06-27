package com.fatec.scel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/alunos")
public class AlunoController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "O rest esta funcionando";
	}

}
