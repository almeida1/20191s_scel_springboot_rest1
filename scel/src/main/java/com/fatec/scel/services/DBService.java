package com.fatec.scel.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.scel.model.Aluno;
import com.fatec.scel.model.Emprestimo;
import com.fatec.scel.model.Livro;
import com.fatec.scel.repository.AlunoRepository;
import com.fatec.scel.repository.EmprestimoRepository;
import com.fatec.scel.repository.LivroRepository;

@Service
public class DBService {
	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private EmprestimoRepository emprestimoRepository;

	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaDB() {
		Aluno a1 = new Aluno("1111", "Jose da Silva", "jose@gmail.com");
		alunoRepository.save(a1);
		Livro l1 = new Livro("aaaa", "Engenharia de Software", "Pressman");
		Livro l2 = new Livro("bbbb", "Fundos de Investimentos", "Roni Antonio");
		
		livroRepository.saveAll(Arrays.asList(l1, l2));
		Emprestimo e1 = new Emprestimo (null, "27/07/2019","30/07/2019","1111","aaaa");
		Emprestimo e2 = new Emprestimo (null, "27/07/2019","30/07/2019","1111","bbbb");
		emprestimoRepository.saveAll(Arrays.asList(e1,e2));
	}

}
