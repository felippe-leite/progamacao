package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		
		sc.close();

		if (numero >= 0) {
			System.out.println("NÃO NEGATIVO");
		}

		else {
			System.out.println("NEGATIVO");

		}

	}

}
