package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Triangle X: ");
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();

		double pX = (xA + xB + xC) / 2;

		double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

		System.out.println("Triangle Y: ");
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();

		double pY = (yA + yB + yC) / 2;

		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

		sc.close();

		System.out.printf("X area: %.4f\n", areaX);
		System.out.printf("Y area: %.4f\n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}

		else {
			System.out.println("Larger area: Y");

		}

	}

}
