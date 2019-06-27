package com.fatec.scel.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.scel.model.Aluno;
import com.fatec.scel.repository.AlunoRepository;

@Service
public class AlunoServices {
	@Autowired
	private AlunoRepository repositorio;
	public Optional<Aluno> busca(Integer id) {
		Optional<Aluno> umAluno = repositorio.findById(id);
		return umAluno;
	}

}
