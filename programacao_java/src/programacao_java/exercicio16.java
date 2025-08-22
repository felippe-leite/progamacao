package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refri = 1.50;
		double precoTotal = 0;
		int quantidade = 0;

		System.out.println("O que você vai querer? \n" + "1 - Cachorro Quente R$ 4.00 \n" + "2 - X-Salada R$ 4.50 \n"
				+ "3 - X-Bacon R$ 5.00\n" + "4 - Torrada Simples R$ 2.00 \n" + "5 - Refrigerante R$ 1.50 ");
		int codigo = sc.nextInt();

		if (codigo <= 5) {
			System.out.println("Digite a quantidade: ");
			quantidade = sc.nextInt();
		}

		else {
			System.out.println("Codigo Invalido");
		}

		sc.close();

		if (codigo == 1) {
			precoTotal = cachorroQuente * quantidade;

		}

		else if (codigo == 2) {
			precoTotal = xSalada * quantidade;

		}

		else if (codigo == 3) {
			precoTotal = xBacon * quantidade;
		}

		else if (codigo == 4) {
			precoTotal = torradaSimples * quantidade;

		}

		else if (codigo == 5) {
			precoTotal = refri * quantidade;

		}

		System.out.printf("Total: R$ %.2f", precoTotal);

	}

}
