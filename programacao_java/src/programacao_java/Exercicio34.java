package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double x = 0, y = 0;
		double resultado = 0;

		for (int i = 0; n > i; i++) {

			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if (y == 0) {
				System.out.println("Divisão impossivel");
			}
			
			else {
				
				resultado = x / y;
				System.out.printf("%.1f\n", resultado);
			}

		}

		sc.close();
	}

}
