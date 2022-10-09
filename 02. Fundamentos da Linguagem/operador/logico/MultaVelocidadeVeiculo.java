package operador.logico;

import java.util.Scanner;

public class MultaVelocidadeVeiculo {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int veiculoTipoEscolha, velocidadeMaximaVia, velocidadeDoVeiculoVia;

		System.out.println("Informe o tipo de veículo (1 - Carro) e (2 - Caminhão)");
		veiculoTipoEscolha = scan.nextInt();

		velocidadeMaximaVia =

				velocidadeMaxima(scan);

		velocidadeDoVeiculoVia = velocidadeVeiculo(scan);

		if ((veiculoTipoEscolha == 1 && velocidadeDoVeiculoVia > velocidadeMaximaVia * 1.1)
				|| (veiculoTipoEscolha == 2 && velocidadeDoVeiculoVia > velocidadeMaximaVia * 1.05)) {

			System.out.println("Multa");
		}

		multaVelocidade(velocidadeDoVeiculoVia, velocidadeMaximaVia);

	}

	public static int velocidadeMaxima(Scanner scan) {

		int velocidadeMaximaDaVia;

		System.out.print("Velocidade maxima da via: ");
		velocidadeMaximaDaVia = scan.nextInt();

		return velocidadeMaximaDaVia;
	}

	public static int velocidadeVeiculo(Scanner scan) {
		int velocidadeDoVeiculo;

		System.out.print("Velocidade do veículo: ");
		velocidadeDoVeiculo = scan.nextInt();

		return velocidadeDoVeiculo;
	}

	public static void multaVelocidade(double velocidadeDoVeiculoVia, double velocidadeMaximaVia) {

		double velocidadeMaxima = velocidadeDoVeiculoVia;

		if (velocidadeMaxima < 100) {

			int veiculoTipo = 0;

			if (veiculoTipo == 1) {

				double calculoVelocidade = velocidadeDoVeiculoVia - 7;

				if (calculoVelocidade < velocidadeMaximaVia) {

					System.out.println("O veículo não leva multa");

				} else {

					double calculoMulta = (float) velocidadeDoVeiculoVia * 1.10;

					System.out.println("Total a pagar R$ " + calculoMulta);
				}
			}

			if (veiculoTipo == 2) {

				float calculoComPorcentagem = (float) (velocidadeDoVeiculoVia * 1.07);
				double calculoFinalVelocidade = velocidadeDoVeiculoVia - calculoComPorcentagem;

				if (calculoFinalVelocidade < velocidadeMaximaVia) {

					System.out.println("O veículo não leva multa");

				} else {

					System.out.println("Total a pagar R$ " + calculoComPorcentagem);

				}

			}
		}
		return;
	}

}