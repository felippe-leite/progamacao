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
				alcool += 1;
				
				break;
			case 2:
				gasolina += 1;
				
				break;
			case 3:
				diesel += 1;
				
				break;
			default:
				
	
				break;

			}
			codigo = sc.nextInt();
			
		}

		sc.close();

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool + "\n Gasolina: " + gasolina + "\n Diesel:" + diesel);

	}

}
