package com.fatec.scel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.scel.model.Emprestimo;
@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {
}
