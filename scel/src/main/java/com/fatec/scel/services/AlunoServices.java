package com.fatec.scel.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fatec.scel.model.Aluno;
import com.fatec.scel.repository.AlunoRepository;
/**
 * Valida as regras de negócio da classe Aluno
 * @author edson
 *
 */
@Service
public class AlunoServices {
	@Autowired
	private AlunoRepository alunoRepo;

	public List<Aluno> findAll() {
		List<Aluno> alunos = alunoRepo.findAll();
		return alunos;
	}

	public ResponseEntity<Object> buscaPorRa(String ra) {
		Optional<Aluno> aluno = alunoRepo.findByRa(ra);
		if (aluno.isPresent())
			return new ResponseEntity<>(aluno, HttpStatus.OK);
		else
			return new ResponseEntity<>("Aluno não encontrado", HttpStatus.NOT_FOUND);
	}

	public Aluno buscaPorRa2(String ra) {
		return alunoRepo.findByRa(ra).get();
	}

	public ResponseEntity<Object> save(@Valid Aluno aluno) {
		try {
			Optional<Aluno> umAluno = alunoRepo.findByRa(aluno.getRa());
			//Optional<Aluno> umAluno = alunoRepo.findByRa(aluno.getEmail());
			if (umAluno.isPresent()) {
				return new ResponseEntity<>("Aluno já cadastrado", HttpStatus.BAD_REQUEST); // (400)
			} else {
				alunoRepo.save(aluno);
				return new ResponseEntity<>("Aluno incluido com sucesso", HttpStatus.CREATED);
			}
		} catch (Exception e) {
			return new ResponseEntity<>("Informações invalidas para aluno", HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<Object> update(Aluno aluno) {
		alunoRepo.save(aluno);
		return new ResponseEntity<>("Aluno atualizado com sucesso", HttpStatus.OK);
	}

	public ResponseEntity<Object> delete(String ra) {

		Optional<Aluno> aluno = alunoRepo.findByRa(ra);
		if (aluno.isPresent()) {
			alunoRepo.delete(aluno.get());
			return new ResponseEntity<>("Aluno excluido", HttpStatus.OK);
		} else
			return new ResponseEntity<>("Aluno não encontrado", HttpStatus.NOT_FOUND);
	}
}
