package com.fatec.scel.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemEmprestado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private int numeroEmprestimo;
	private String ra;
	
	public ItemEmprestado() {
	}
	
	public ItemEmprestado(Integer id, int numeroEmprestimo, String ra) {
		
		this.id = id;
		this.numeroEmprestimo = numeroEmprestimo;
		this.ra = ra;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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

}
