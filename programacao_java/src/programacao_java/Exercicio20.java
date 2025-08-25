package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int quantidadeMinutos = sc.nextInt();
		int limite = 100;
		double valorAPagar = 50.0;

		sc.close();

		if (quantidadeMinutos > limite) {
			valorAPagar += (quantidadeMinutos - limite) * 2.00;
		}

		System.out.println("Valor a pagar: " + valorAPagar);
	}

}
