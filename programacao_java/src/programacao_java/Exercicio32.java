package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; n > i; i++) {
			int x = sc.nextInt();

			if (x >= 10 && x <= 20) {
				in += 1;

			}

			else {
				out += 1;
			}

		}

		sc.close();

		System.out.println(in + " in");
		System.out.println(out + " out");

	}

}
