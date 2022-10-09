package com.algaworks.curso.javaeoo.heranca.sobreposicao;

public class Conta {
	private String descricao;
	private double valor;
	private String dataVencimento;
	protected SituacaoConta situacaoConta;

	Conta() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	public void cancelar() {
		switch (situacaoConta) {

		case PAGA:

			System.out.println("Não pode cancelar uma conta ja foi paga: " + this.getDescricao() + ".");
			break;

		case CANCELADA:

			System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao() + ".");
			break;

		case PENDENTE:

			System.out.println("A conta está sendo cancelada " + this.getDescricao() + ".");

			this.situacaoConta = SituacaoConta.CANCELADA;

			break;
		}
	}

	public SituacaoConta getSituacaoConta() {
		return situacaoConta;

	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVencimento() {
		return this.dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

}