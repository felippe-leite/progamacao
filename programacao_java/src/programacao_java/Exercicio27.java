package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (codigo != 4) {

			switch (codigo) {

			case 1:
				alcool += alcool;
				break;
			case 2:
				gasolina += gasolina;
				break;
			case 3:
				diesel += diesel;
				break;
			default:
				System.out.println("Digite outro codigo:");
				codigo = sc.nextInt();
				break;

			}
			codigo = sc.nextInt();

		}

		sc.close();

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool + "Gasolina: " + gasolina + "Diesel: " + diesel);

	}

}
