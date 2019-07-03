package com.fatec.scel.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Aluno implements Serializable {
	@Id
	private String ra;
	private String nome;
	private String email;

	public Aluno() {
	}

	public Aluno(String ra, String nome, String email) {
		
		this.ra = ra;
		this.nome = nome;
		this.email = email;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	
}
