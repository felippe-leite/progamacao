package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double tetoSalarioImposto = 2000.00;
		double imposto = 0;

		sc.close();

		if (salario <= tetoSalarioImposto) {
			System.out.println("Isento");

		}

		else if (salario > tetoSalarioImposto) {
			imposto = (salario - tetoSalarioImposto) * 0.08;
		}

	}
}