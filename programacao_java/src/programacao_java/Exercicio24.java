package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double idade = sc.nextDouble();
		int cont = 0;
		double media = 0;

		while (idade >= 0) {

			media += idade;
			cont += 1;
			idade = sc.nextDouble();
 
		}

		media /= cont;
		if (media >= 0)
			System.out.printf("%.2f", media);

		else
			System.out.println("Impossivel calcular");

		sc.close();

	}

}
