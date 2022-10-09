import java.util.Scanner;

public class CalculandoArea {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		float pi = 3.14f;

		float raio = 0.0f;

		System.out.println("Sabendo que PI = 3,14");

		System.out.print("Informe o valor do raio: ");
		raio = scan.nextFloat();

		System.out.println("A seguir informe a formula usada: ");
		System.out.println(
				"[1 - Multiplicando raio²*pi]  \n[2 - Mulplicação com resultado inteiro]  \n[3 - Multiplicação com os dois resultados]");
		int escolhaResultado = scan.nextInt();

		if (escolhaResultado == 1) {

			float area = (raio * raio) * pi;

			System.out.println("Resultado: " + area);
		}

		if (escolhaResultado == 2) {

			float area = (raio * raio) * pi;
			int valorAreaSemDecimal = (int) area;

			System.out.println("Resultado sem Casa Decimal: " + valorAreaSemDecimal);
		}

		if (escolhaResultado == 3) {

			float area = (raio * raio) * pi;
			int valorAreaSemDecimal = (int) area;

			System.out.println("Resultado: " + area);
			System.out.println("Resultado sem Casa Decimal: " + valorAreaSemDecimal);
		}

		scan.close();
	}

}