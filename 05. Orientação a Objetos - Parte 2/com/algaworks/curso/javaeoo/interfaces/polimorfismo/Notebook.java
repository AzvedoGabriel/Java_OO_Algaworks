package com.algaworks.curso.javaeoo.interfaces.polimorfismo;

public class Notebook implements Seguravel {

	private double valorMercado;
	private int anoFabricacao;

	public Notebook(double valorMercado, int anoFabricacao) {
		this.valorMercado = valorMercado;
		this.anoFabricacao = anoFabricacao;
	}

	@Override
	public double calcularValorApolice() {
		double valorApolice = this.valorMercado * 0.12;

		return valorApolice;
	}

	@Override
	public String obterDescricao() {
		return "Notebook Fabricado em: " + this.anoFabricacao + " com valor da loja de R$ " + this.valorMercado;
	}

}
