package com.algaworks.curso.javaeoo.instanciando.acessando.atributos.projeto;

import java.util.Scanner;

public class PetShop {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		petsDoguinhos();

	}

	private static void petsDoguinhos() {
		Cachorro doguinho = new Cachorro();

		System.out.print("Informe o nome do (Cachorro / Cadela): ");
		doguinho.nome = scan.nextLine();

		System.out.print("Informe a Raça do (Cachorro ou Cadela): ");
		doguinho.raca = scan.nextLine();

		System.out.print("Digite por gentiliza o sexo do cachorro (Masculino M / Feminimo F): ");
		doguinho.sexo = scan.nextLine().charAt(0);

		System.out.println("Informe a idade: ");
		doguinho.idade = scan.nextInt();

		doguinho.exibirInformacoes();
	}

}