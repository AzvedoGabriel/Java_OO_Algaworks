package com.algaworks.curso.javaeoo.composicao.objeto.chamada.metodo;

import java.util.Scanner;

public class Passeio {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.nome = lerPessoaNome();
		pessoa.cachorrodois.nome = lerPetNome();

		CaminhadaDog c = new CaminhadaDog();
		c.andar(pessoa);
	}

	public static String lerPessoaNome() {
		System.out.print("Informe seu nome: ");
		return scan.nextLine();
	}

	public static String lerPetNome() {
		System.out.print("Informe o nome do pet: ");
		return scan.nextLine();
	}
}