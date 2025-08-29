package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int resultado = 1;

		for (int i = 1; i <= n; i++) {

			resultado *= i;

		}

		System.out.println(n + "! = " + resultado);

		sc.close();

	}

}
