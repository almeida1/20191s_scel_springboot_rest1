package com.fatec.scel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fatec.scel.model.Aluno;
import com.fatec.scel.model.Emprestimo;
import com.fatec.scel.model.ItemEmprestado;
import com.fatec.scel.model.Livro;
import com.fatec.scel.repository.AlunoRepository;
import com.fatec.scel.repository.EmprestimoRepository;
import com.fatec.scel.repository.ItemRepository;
import com.fatec.scel.repository.LivroRepository;

// http satus code
@Service
public class EmprestimoServices {
	private ItemEmprestado itemEmprestado;
	@Autowired
	EmprestimoRepository emprestimoRepo;
	@Autowired
	ItemRepository itemRepo;
	@Autowired
	AlunoRepository alunoRepo;
	@Autowired
	LivroRepository livroRepo;
	
	public List<Emprestimo> findAll() {
		List<Emprestimo> emprestimos = emprestimoRepo.findAll();
		return emprestimos;
	}
	@Transactional
	public ResponseEntity<Object> save(Emprestimo emprestimo, String ra, String isbn) {
		Optional<Aluno> aluno = alunoRepo.findByRa(ra);
		Optional<Livro> livro = livroRepo.findByISBN(isbn);
		if (livro.isPresent() && aluno.isPresent()) {
			emprestimo.setDtEmprestimo("17/07/2019");
			emprestimoRepo.save(emprestimo);
			itemEmprestado = new ItemEmprestado();
			itemEmprestado.setNumeroEmprestimo(emprestimo.getNumeroEmprestimo());
			itemEmprestado.setRa(ra);
			itemEmprestado.setIsbn(isbn);
			itemRepo.save(itemEmprestado);
			return new ResponseEntity<>("Emprestimo incluido com sucesso", HttpStatus.CREATED);
			
		}else {
			 return new ResponseEntity<>("Emprestimo recusado", HttpStatus.NOT_FOUND);
		}
	}
}
