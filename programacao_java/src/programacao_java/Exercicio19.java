package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto = 0;

		sc.close();

		if (salario <= 2000.00) {
			System.out.println("Isento");
		}
		
		else if (salario > 2000.00 && salario <= 3000.00) {
			imposto =  (salario - 2000.00) * 0.08;
			System.out.printf("R$ %.2f", imposto);
		}
		
		else if (salario > 3000.00 && salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18;
			imposto = imposto + (1000.00 * 0.08);
			System.out.printf("R$ %.2f", imposto);
	
		}
		
		else {
			imposto = 1000.00 * 0.08;
			imposto = imposto + (1500.00 * 0.18);
			imposto = imposto + ((salario - 4500.00) * 0.28);
			System.out.printf("R$ %.2f", imposto);
		}
		
		
	}
}