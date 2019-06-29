package com.fatec.scel.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.fatec.scel.model.Emprestimo;
import com.fatec.scel.model.ItemEmprestado;
import com.fatec.scel.model.Livro;
import com.fatec.scel.repository.EmprestimoRepository;
import com.fatec.scel.repository.ItemRepository;

public class EmprestimoServices {
	private Emprestimo emprestimo;
	@Autowired
	EmprestimoRepository emprestimoRepository;
	@Autowired
	ItemRepository itemRepository;

	public void registraEmprestimo(Livro livro) {

		emprestimoRepository.save(emprestimo);
	}

	public void registraItem(ItemEmprestado item) {
		itemRepository.save(item);
	}
}
