package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();

		while (numero1 != numero2) {

			if (numero1 > numero2) {
				System.out.println("Decrescente");
			}

			else {
				System.out.println("Crescente");

			}
			numero1 = sc.nextInt();
			numero2 = sc.nextInt();
		}
		sc.close();
	}

}
