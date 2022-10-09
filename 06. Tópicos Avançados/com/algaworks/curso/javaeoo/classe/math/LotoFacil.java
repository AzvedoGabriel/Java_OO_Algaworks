package com.algaworks.curso.javaeoo.classe.math;

public class LotoFacil {
	public static final int NUMERO_LIMITE = 25;
	public static final int QUANTIDADE_TOTAL = 15;

	private int[] numeroDaSorte;

	public void sortear() {
		this.numeroDaSorte = new int[QUANTIDADE_TOTAL];

		for (int i = 1; i <= QUANTIDADE_TOTAL; i++) {

			int numeroSorteado = (int) Math.round(Math.random() * NUMERO_LIMITE);

			if (!this.jaFoiSorteado(numeroSorteado) && numeroSorteado != 0) {

				this.numeroDaSorte[i - 1] = numeroSorteado;
			} else {

				i--;
			}
		}
	}

	public void exibirNumeros() {
		for (int numeroSorteado : numeroDaSorte) {
			System.out.print(numeroSorteado + " ");
		}

		System.out.println();
	}

	private boolean jaFoiSorteado(int numero) {
		boolean resultado = false;
		for (int i = 0; i < this.numeroDaSorte.length; i++) {
			if (this.numeroDaSorte[i] == numero) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}
}