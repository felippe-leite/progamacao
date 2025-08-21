package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double delta = B * B -4.0 * A * C;
		double raizQuadrada = Math.sqrt(delta);
		
		double r1 = (-B + raizQuadrada) / (2 * A);
		double r2 = (-B - raizQuadrada) / (2 * A);
		
		
		sc.close();
		
		if (A == 0 || delta < 0.0)
		
		System.out.println("Impossivel calcular");
		
		else {
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
		
	}

}
