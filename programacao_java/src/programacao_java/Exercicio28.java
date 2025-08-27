package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros: ");
		int n = sc.nextInt();
		int soma = 0;
		int numeros = 0;

		for (int i = 0; i < n; i++) {
			numeros = sc.nextInt();
			soma += numeros;
		}
		sc.close();

		System.out.println(soma);

	}

}
