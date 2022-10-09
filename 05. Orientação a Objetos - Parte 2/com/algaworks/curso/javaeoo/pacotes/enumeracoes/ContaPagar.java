package com.algaworks.curso.javaeoo.pacotes.enumeracoes;

public class ContaPagar {
	private String descricao;
	private double valor;
	private String dataVencimento;
	private Fornecedor fornecedor;
	private SituacaoConta situacaoConta;

	ContaPagar() {
		this.situacaoConta = SituacaoConta.PENDENTE;
	}

	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {

		this();
		this.fornecedor = fornecedor;
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}

	public void pagar() {

		switch (situacaoConta) {

		case PAGA:

			System.out.println("A conta ja foi paga: " + this.getDescricao() + ".");
			break;

		case CANCELADA:

			System.out.println("A conta foi cancelada, não da para pagar ela: " + this.getDescricao() + ".");
			break;

		case PENDENTE:

			System.out.println("A conta: " + this.getDescricao());
			System.out.println("Valor para pagar a conta R$ " + this.getValor());
			System.out.println("Com o vencimento em " + this.getDataVencimento());
			System.out.println("Fornecedor: " + this.getFornecedor().getNome());
			System.out.println("-------------------------------------------------");

			this.situacaoConta = SituacaoConta.PAGA;

			break;
		}
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
