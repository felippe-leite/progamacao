package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		sc.close();

		int diferenca = A * B - C * D;

		System.out.println("DIFERENÇA = " + diferenca);

	}

}
