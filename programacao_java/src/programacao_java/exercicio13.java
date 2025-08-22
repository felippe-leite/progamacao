package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		sc.close();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		}

		else {
			System.out.println("IMPAR");
		}

	}

}
