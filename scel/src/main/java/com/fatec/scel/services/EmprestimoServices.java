package com.fatec.scel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fatec.scel.model.Aluno;
import com.fatec.scel.model.Emprestimo;
import com.fatec.scel.model.ItemEmprestado;
import com.fatec.scel.model.Livro;
import com.fatec.scel.repository.EmprestimoRepository;
import com.fatec.scel.repository.ItemRepository;

// http satus code
@Service
public class EmprestimoServices {
	private ItemEmprestado itemEmprestado;
	@Autowired
	EmprestimoRepository emprestimoRepo;
	@Autowired
	ItemRepository itemRepo;
	
	public List<Emprestimo> findAll() {
		List<Emprestimo> emprestimos = emprestimoRepo.findAll();
		return emprestimos;
	}
	public ResponseEntity<Object> save(Emprestimo emprestimo, Aluno aluno, Livro livro) {

		emprestimoRepo.save(emprestimo);
		itemEmprestado = new ItemEmprestado();
		itemEmprestado.setNumeroEmprestimo(emprestimo.getNumeroEmprestimo());
		itemEmprestado.setRa(aluno.getRa());
		itemEmprestado.setIsbn(livro.getIsbn());
		itemRepo.save(itemEmprestado);
		return new ResponseEntity<>("Emprestimo incluido com sucesso", HttpStatus.CREATED);
	}
}
