package com.algaworks.curso.javaeoo.interfaces.polimorfismo;

public class Principal {

	public static void main(String[] args) {
		CorretoraSeguros corretora = new CorretoraSeguros();

		Notebook meuNotebook = new Notebook(3500d, 2022);
		Barco meuBarco = new Barco(1500000d, 2017);

		corretora.fazerPropostaSeguro(meuNotebook);
		corretora.fazerPropostaSeguro(meuBarco);

	}
}
