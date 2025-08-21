package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int codigoPeca1 = sc.nextInt();
		int numeroPecas1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();

		int codigoPeca2 = sc.nextInt();
		int numeroPecas2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();

		double valorASerPago = valorPeca1 * numeroPecas1 + valorPeca2 * numeroPecas2;

		sc.close();

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorASerPago);
		System.out.println("CÓDIGO PEÇA 1: " + codigoPeca1);
		System.out.println("CÓDIGO PEÇA 2: " + codigoPeca2);

	}

}
