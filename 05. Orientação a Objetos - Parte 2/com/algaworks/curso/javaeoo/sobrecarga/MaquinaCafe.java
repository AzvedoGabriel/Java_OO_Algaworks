package com.algaworks.curso.javaeoo.sobrecarga;

public class MaquinaCafe {
	int acucarDisponivel;

	private int QUANTIDADE_PADRAO = 10;
	void fazerCafe() {
	   fazerCafe(QUANTIDADE_PADRAO);
	}

	void fazerCafe(int quantidadeAcucar) {
		if (acucarDisponivel < quantidadeAcucar) {
			System.out.println("Não há açucar suficiente para fazer seu café.");
		} else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
		}
	}
}