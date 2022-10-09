package com.algaworks.curso.javaeoo.heranca.sobreposicao;

public class ContaPagar extends Conta {
	private Fornecedor fornecedor;

	ContaPagar() {

	}

	ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {

		this.fornecedor = fornecedor;
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
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

	public Fornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}