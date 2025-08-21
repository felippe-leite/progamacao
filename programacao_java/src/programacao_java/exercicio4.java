package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double valorRaio = sc.nextDouble();

		double valorArea = 3.14159 * Math.pow(valorRaio, 2);

		sc.close();

		System.out.printf("A = %.4f", valorArea);

	}

}
