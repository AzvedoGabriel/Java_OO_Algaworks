package com.algaworks.curso.javaeoo.polimorfismo.classe.abstrata;

public class RelatorioContas {
	public void exibirListagem(Conta[] contas) {
		System.out.println("------------------------------------");
		System.out.println("Relátorio de Contas a Pagar e Receber");
		System.out.println("------------------------------------");

		for (int i = 0; i < contas.length; i++) {
			contas[i].exibirDetalhes();
		}
	}
}
