package com.fatec.scel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.scel.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository <Aluno, Integer> {

}
