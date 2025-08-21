package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double valorA = sc.nextDouble();
		double valorB = sc.nextDouble();
		double valorC = sc.nextDouble();
		
		double triangulo = valorA * valorC / 2;
		double circulo = Math.PI * Math.pow(valorC, 2);
		double trapezio = (valorA + valorB) * valorC / 2;
		double quadrado = valorB * valorB;
		double retangulo = valorA * valorB;
		
		sc.close();
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);

	}

}
