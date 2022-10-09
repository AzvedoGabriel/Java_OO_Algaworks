package operador.ternario.decremento.estrutura.repeticao;

import java.util.Scanner;

public class LojaFerramenta {
	
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String corredor = "";
		int codigoProduto = 0;

		do {
			System.out.print("Informe o codigo do Produto: ");
			codigoProduto = scan.nextInt();

			if (codigoProduto != 0) {

				corredor = (codigoProduto % 2 == 0) ? "\" direita\"" : "\"esquerda\"";

				for (int i = 8; i >= 1; i--) {

					if (codigoProduto % i == 0) {

						System.out.println("O produto de codigo: " + codigoProduto + " Ficara no corredor da "
								+ corredor + " e na gaveta " + i);

						break;
					}
				}

			}
		} while (codigoProduto != 0);

	}

}