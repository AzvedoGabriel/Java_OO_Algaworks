import java.util.Scanner;

public class CalculoVenda {

	private static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

		int informacaoEscolha;

		System.out.println("Informe qual maneira o codigo comportara [ 1 = for, 2 = exercício normal]");
		informacaoEscolha = scan.nextInt();

		if (informacaoEscolha == 2) {

			calculoBomBom();
		} else {
			calculoBomBomComFor(scan);
		}

		scan.close();
	}

	public static void calculoBomBom() {

		int precoBomBom1 = 5;
		int precoBomBom2 = 8;
		int precoBomBom3 = 12;

		int mediaPrecosBomBons = (precoBomBom1 + precoBomBom2 + precoBomBom3) / 3;

		System.out.println("\"Sistema de Calculo de Media\"");
		System.out.println("Preço 1: " + precoBomBom1);
		System.out.println("Preço 2: " + precoBomBom2);
		System.out.println("Preço 3: " + precoBomBom3);
		System.out.println("Media dos preços: " + mediaPrecosBomBons);

		return;
	}

	private static void calculoBomBomComFor(Scanner scan) {

		int valorConta = 0;
		int novoValor = 0;

		for (int i = 0; i < 3; i++) {

			System.out.print("Preço" + i + ": ");
			valorConta = scan.nextInt();

			novoValor += valorConta;
		}

		int contaTotal = novoValor / 3;

		System.out.println(contaTotal);
	}

}
