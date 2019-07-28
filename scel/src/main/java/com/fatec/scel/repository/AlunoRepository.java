package com.fatec.scel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fatec.scel.model.Aluno;
//https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
//https://domineospring.wordpress.com/2015/05/11/facilite-seus-daos-com-o-spring-data-jpa/
@Repository
public interface AlunoRepository extends JpaRepository <Aluno, Integer> {
	//@Query("select a from Aluno a where a.ra = ?1")
	Optional<Aluno> findByRa(String ra);
	@Transactional (readOnly=true) //fica mais rapida e diminui o locking no gerenciamento do db
	Optional<Aluno> findByEmail(String ra);
}
