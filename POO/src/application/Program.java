package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Retangulo x = new Retangulo();

		System.out.println("Enter rectangle width and height:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		sc.close();

		System.out.printf("AREA = %.2f\n", x.area());
		System.out.printf("PERIMETER = %.2f\n", x.perimetro());
		System.out.printf("DIAGONAL = %.2f\n", x.diagonal());

	}

}
