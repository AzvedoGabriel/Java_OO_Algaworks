package com.algaworks.curso.javaeoo.statics.finals;

public class TesteMatematica {
	public static void main(String[] args) {
		
		int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
		System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);

		double areaCirculo = MatematicaUtil.calculandoAreaCirculo(15);
		System.out.printf("Área do círculo: " + "%.3f", areaCirculo);

		double volumeCilindro = MatematicaUtil.calculandoVolumeCilindro(0.15d, 1d);
		System.out.printf("Volume do clindro: " + "%.3f", volumeCilindro);
	}
}