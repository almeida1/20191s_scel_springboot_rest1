package com.fatec.scel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emprestimo {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer numeroEmprestimo;
	private String dtEmprestimo;
	private String dtDevolucaoPrevista;
	private String dtDevolucao;
	private String ra;
	private String isbn;
		
	public Emprestimo () {
	}

	public Emprestimo(Integer numeroEmprestimo, String dtEmprestimo, String dtDevolucaoPrevista, String ra,String isbn) {
		this.numeroEmprestimo = numeroEmprestimo;
		this.dtEmprestimo = dtEmprestimo;
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
		this.setRa(ra);
		this.setIsbn(isbn);
	}

	public Integer getNumeroEmprestimo() {
		return numeroEmprestimo;
	}

	
	public String getDtEmprestimo() {
		return dtEmprestimo;
	}

	public void setDtEmprestimo(String dtEmprestimo) {
		this.dtEmprestimo = dtEmprestimo;
	}

	public String getDtDevolucaoPrevista() {
		return dtDevolucaoPrevista;
	}

	public void setDtDevolucaoPrevista(String dtDevolucaoPrevista) {
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
	}

	public String getDtDevolucao() {
		return dtDevolucao;
	}


	public void setDtDevolucao(String dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
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
