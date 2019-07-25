package com.fatec.scel.model;



import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class ItemEmprestado{
	
	
	@Id
	private int numeroEmprestimo;
	private String ra;
	private String isbn;
	
	public ItemEmprestado() {
	}

	public ItemEmprestado(int numeroEmprestimo, String ra, String isbn){
		
		this.numeroEmprestimo = numeroEmprestimo;
		this.ra = ra;
		this.isbn = isbn;
	}

	public int getNumeroEmprestimo() {
		return numeroEmprestimo;
	}

	public void setNumeroEmprestimo(int numeroEmprestimo) {
		this.numeroEmprestimo = numeroEmprestimo;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	
}
