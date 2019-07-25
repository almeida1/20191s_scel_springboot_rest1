package com.fatec.scel.model;

//https://docs.oracle.com/javaee/7/tutorial/bean-validation001.htm


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;
@Entity
public class Aluno  {
	@Id
	private String ra;
	@NotEmpty(message = "Preencimento obrigatório")
	@Length (min=1, max=80, message="O tamanho deve ser entre 1 e 80 caracteres.")
	private String nome;
	@NotEmpty(message = "Preencimento obrigatório")
	@Email
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
