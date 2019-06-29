package com.fatec.scel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.fatec.scel.model.ItemEmprestado;
@Repository
public interface ItemRepository extends JpaRepository<ItemEmprestado, Integer> {
}