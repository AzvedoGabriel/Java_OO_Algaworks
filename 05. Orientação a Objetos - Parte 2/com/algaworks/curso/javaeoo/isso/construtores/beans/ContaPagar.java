package com.algaworks.curso.javaeoo.isso.construtores.beans;

public class ContaPagar {

	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;

	ContaPagar() {

	}

	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {

		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public void pagar() {
		System.out.println("Fornecedor: " + this.fornecedor.getNome());
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor a ser pago R$ " + this.valor);
		System.out.println("Data que vence o pagamento: " + this.dataVencimento);

		System.out.println("----------------------------------------------------");
	}

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
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