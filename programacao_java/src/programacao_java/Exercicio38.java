package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		char resposta;
		double temperatura, fahrenheit;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			temperatura = sc.nextDouble();

			fahrenheit = (temperatura * 9) / 5 + 32;

			System.out.printf("Equivalente em Fahrenheit: %.1f\n ", fahrenheit);

			System.out.print("Deseja repetir (s/n)? ");
			resposta = sc.next().charAt(0);

		} while (resposta != 'n');

		sc.close();

	}

}
