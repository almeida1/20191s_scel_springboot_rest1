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
/**
 * Valida as regras de negócio da classe Emprestimo
 * @author edson
 *
 */
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
	// uma insercao de mais de um objeto pode-se criar um dto e salvar as partes do dto composto para cada objeto
	// simples por exemplo dto cliente e endereco e salva cliente depois endereco
	@Transactional
	public ResponseEntity<Object> save(Emprestimo emprestimo) {
		Optional<Aluno> aluno = alunoRepo.findByRa(emprestimo.getRa());
		Optional<Livro> livro = livroRepo.findByISBN(emprestimo.getIsbn());
		if (livro.isPresent() && aluno.isPresent()) {
			emprestimoRepo.save(emprestimo);
			return new ResponseEntity<>("Emprestimo incluido com sucesso", HttpStatus.CREATED);
		}else {
			 return new ResponseEntity<>("Emprestimo recusado - dados invalidos", HttpStatus.NOT_FOUND);
		}
	}
}
