package com.fatec.scel.model;

import javax.persistence.ManyToOne;

public class Livro {
	@ManyToOne
    private Livro livro;
}
