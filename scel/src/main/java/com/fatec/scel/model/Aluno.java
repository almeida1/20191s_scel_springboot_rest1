package com.fatec.scel.model;

import java.io.Serializable;

public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String ra;
	private String nome;
	private String email;

	public Aluno() {
	}

	public Aluno(Integer id, String ra, String nome, String email) {
		this.id = id;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (ra == null) {
			if (other.ra != null)
				return false;
		} else if (!ra.equals(other.ra))
			return false;
		return true;
	}
}
