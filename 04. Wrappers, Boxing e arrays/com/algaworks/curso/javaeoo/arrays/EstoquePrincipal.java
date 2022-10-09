package com.algaworks.curso.javaeoo.arrays;

import java.util.Scanner;

public class EstoquePrincipal {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Quantos produtos?");
		int quantidadeProdutos = scan.nextInt();

		scan.nextLine();

		Estoque estoque = new Estoque();

		int quantidadeTotal = 0;

		estoque.produtos = new Produto[quantidadeProdutos];

		for (int i = 0; i < estoque.produtos.length; i++) {
			estoque.produtos[i] = new Produto();

			System.out.println("\nProduto " + i);
			System.out.println("------------------------");

			System.out.print("Descrição: ");
			estoque.produtos[i].descricao = scan.nextLine();

			System.out.print("Quantidade de itens: ");
			estoque.produtos[i].quantidade = scan.nextInt();
			scan.nextLine();

			quantidadeTotal += estoque.produtos[i].quantidade;
		}

		estoque.listarProdutos();
		System.out.println("Quantidade Total de produtos foi: " + quantidadeTotal);
	}
}