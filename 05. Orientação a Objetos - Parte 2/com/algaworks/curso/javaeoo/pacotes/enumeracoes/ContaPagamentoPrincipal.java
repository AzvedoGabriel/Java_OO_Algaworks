package com.algaworks.curso.javaeoo.pacotes.enumeracoes;

import java.util.Scanner;

public class ContaPagamentoPrincipal {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Fornecedor imobiliaria = new Fornecedor();

		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");

		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");

		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);

		ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");

		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");

		switch (contaEmAberto()) {

		case 1:
			System.out.println("Opção selecionada '1' - Todas as contas ");
			conta1.pagar();
			conta2.pagar();
			conta3.pagar();
			break;

		case 2:
			System.out.println("Opção selecionada '2' - Apenas (Aluguel da Matriz)");
			conta1.pagar();
			break;

		case 3:
			System.out.println("Opção selecionada '3' - Apenas (Compras do mês)");
			conta2.pagar();
			break;

		case 4:
			System.out.println("Opção selecionada '4' - Apenas (Aluguel da Filial)");
			conta3.pagar();
			break;

		case 5:
			System.out.println("Opção selecionada '5' - Apenas (Aluguel Matriz e Filial)");
			conta1.pagar();
			conta3.pagar();
			break;

		case 6:
			System.out.println("Opção selecionada '6' - Apenas (Aluguel Matriz ou Filial + Compras do Mês)");
			System.out.println("Informe qual Alugel Deseja pagar [1 - Matriz / 2 - Filial]");
			int aluguelMatrizFilial = scan.nextInt();

			if (aluguelMatrizFilial == 1) {
				conta1.pagar();
				conta2.pagar();
			} else {
				conta2.pagar();
				conta3.pagar();
			}
			break;

		case 7:
			System.out.println("Opção de cancelamento '7' - Matriz");
			conta1.cancelar();
			break;

		case 8:
			System.out.println("Opção de cancelamento '8' - Filial");
			conta3.cancelar();
			break;

		case 9:
			System.out.println("Opção de cancelamento '9' - Compras do mês");
			conta2.cancelar();
			break;

		case 10:
			System.out.println("Opção de cancelamento '10' - Todas");
			conta1.cancelar();
			conta2.cancelar();
			conta3.cancelar();
			break;

		}

	}
	
	public static int contaEmAberto() {

		int formaPagamentoEscolha = 0;
		int cancelandoConta = 0;

		System.out.println("As contas estam em aberto digite [1 - Pagar / 2 - Cancelar]: ");
		int pagamentoCancelar = scan.nextInt();

		if (pagamentoCancelar == 1) {

			System.out.println(
					"Deseja pagar quais contas, Digite a seguir [1 - Todas / 2 - Apenas (Alugel da Matriz) / 3 -  Apenas (Compras do mês) / "
							+ "\n 4 - Apenas (Aluguel da filial) / 5 - Apenas (Aluguel Matriz e Filial) / 6 - Apenas (Aluguel Matriz ou Filial + Compras do Mês) ");
			formaPagamentoEscolha = scan.nextInt();

			return formaPagamentoEscolha;
		} else {
			System.out.println(
					"Deseja não pagar qual conta ? [7 - Matriz / 8 - Filial / 9 - Compras do mês / 10 - Todas]");
			cancelandoConta = scan.nextInt();

			return cancelandoConta;
		}

	}
}

