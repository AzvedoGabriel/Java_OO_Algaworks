package com.algaworks.curso.javaeoo.interfaces.polimorfismo;

public class Barco implements Seguravel {

	private final double valorMercado;
	private final int anoFabricacao;

	Barco(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.010;
		if (anoFabricacao < 2010) {
			valorApolice = valorApolice * 2.50;
		}
		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Barco ano " + this.anoFabricacao + " com valor de mercado " + this.valorMercado;
	}

}
