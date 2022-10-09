package com.algaworks.curso.javaeoo.heranca.sobreposicao;

public class ContaReceber extends Conta {
	private Cliente cliente;

	ContaReceber() {

	}

	ContaReceber(Cliente cliente, String descricao, double valor, String dataVencimento) {

		this.setCliente(cliente);
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setDataVencimento(dataVencimento);
	}

	public void receber() {
		switch (situacaoConta) {

		case PAGA:
			System.out.println("Não pode receber uma conta que já está paga: " + this.getDescricao() + ".");
			break;

		case PENDENTE:
			System.out.println("Não pode receber uma conta que está cancelada: " + this.getDescricao() + ".");
			break;

		case CANCELADA:
			System.out.println(
					"Recebendo conta " + this.getDescricao() + " no valor de " + this.getValor() + " e vencimento em "
							+ this.getDataVencimento() + " do cliente " + this.getCliente().getNome() + ".");

			// altera situação da conta para PAGA
			this.situacaoConta = SituacaoConta.PAGA;
		}
	}

	public void cancelar() {
		if (this.getValor() > 50000d) {

			System.out.println("Essa conta não poderá ser cancelada");
			System.out.println("é muito dinheiro para não receber, a conta em questão: " + this.getDescricao());

		} else {
			super.cancelar();
		}
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}