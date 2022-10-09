import java.util.Scanner;

public class DescobertaAnoBissexto {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int anoAtual;

		System.out.print("Informe o ano: ");
		anoAtual = scan.nextInt();

		if (anoAtual % 400 == 0) {
			System.out.println("O ano " + anoAtual + " é bissexto");
		} else if (anoAtual % 4 == 0) {
			if (anoAtual % 100 != 0) {
				System.out.println("O ano " + anoAtual + " é bissexto ");
			} else {
				System.out.println("O ano " + anoAtual + " não é um ano bissexto");
			}
		} else {
			System.out.println(anoAtual + " não é Ano bissexto");
		}

		scan.close();
	}

}
