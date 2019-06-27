package com.fatec.scel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fatec.scel.model.Aluno;
//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
@Repository
public interface AlunoRepository extends JpaRepository <Aluno, Integer> {
	@Query("select a from Aluno a where a.ra = ?1")
	Optional<Aluno> findByRa(String ra);
}
