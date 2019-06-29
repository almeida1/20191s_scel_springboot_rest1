package com.fatec.scel.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emprestimo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer numeroEmprestimo;
	private String dtEmprestimo;
	private String dtDevolucaoPrevista;
	private String dtDevolucao;
	private Aluno aluno;
	private ItemEmprestado item;
	
	
	public Emprestimo () {
	}


	public Emprestimo(int numeroEmprestimo, String dtEmprestimo, String dtDevolucaoPrevista,
			String dtDevolucao, Aluno aluno, ItemEmprestado item) {
		
		this.numeroEmprestimo = numeroEmprestimo;
		this.dtEmprestimo = dtEmprestimo;
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
		this.dtDevolucao = dtDevolucao;
		this.aluno = aluno;
		this.item = item;
	}


	public int getNumeroEmprestimo() {
		return numeroEmprestimo;
	}


	public void setNumeroEmprestimo(int numeroEmprestimo) {
		this.numeroEmprestimo = numeroEmprestimo;
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


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public ItemEmprestado getItem() {
		return item;
	}


	public void setItem(ItemEmprestado item) {
		this.item = item;
	}
		
	
	
}
