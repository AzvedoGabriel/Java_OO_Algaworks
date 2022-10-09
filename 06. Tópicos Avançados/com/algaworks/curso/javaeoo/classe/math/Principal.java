package com.algaworks.curso.javaeoo.classe.math;

import java.util.Scanner;

public class Principal {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Por Gentileza Informe a quantidade de jogos: ");
		int quantidadeDeJogosInformada = scan.nextInt();

		System.out.println("[1 - Mega sena] ou [2 - LotoFacil]?");
		int jogoEscolhido = scan.nextInt();

		System.out.println("=============================");

		if (jogoEscolhido == 1) {

			System.out.println("Mega Sena");
			System.out.println("---------------------------------");

			for (int i = 1; i <= quantidadeDeJogosInformada; i++) {
				MegaSena mega = new MegaSena();

				mega.sortear();
				mega.exibirNumeros();
				System.out.println("---------------------------------");
			}

		} else {

			System.out.println("Loto Facil");
			System.out.println("---------------------------------");

			for (int i = 1; i <= quantidadeDeJogosInformada; i++) {
				LotoFacil loto = new LotoFacil();

				loto.sortear();
				loto.exibirNumeros();
				System.out.println("---------------------------------");
			}
		}
	}
}
