package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] arg8s) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIGITE A NOTA 1: ");
		double nota1 = sc.nextDouble();
		System.out.println("DIGITE A NOTA 2: ");
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;
		
		sc.close();
		
		if (notaFinal >= 60.00) {
			System.out.printf("NOTA FINAL = %.1f\n", notaFinal);
			System.out.println("APROVADO");
		}
		
		else {
			System.out.printf("NOTA FINAL = %.1f\n", notaFinal);
			System.out.println("REPROVADO");
		}
		

	}

}
