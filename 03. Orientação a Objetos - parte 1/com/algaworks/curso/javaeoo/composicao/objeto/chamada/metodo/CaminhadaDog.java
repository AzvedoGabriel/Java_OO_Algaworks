package com.algaworks.curso.javaeoo.composicao.objeto.chamada.metodo;

public class CaminhadaDog {
	void andar(Pessoa pessoa) {

		System.out
				.println("Eu \"" + pessoa.nome + "\"" + " estou passeando com o \"" + pessoa.cachorrodois.nome + "\"");
	}
}