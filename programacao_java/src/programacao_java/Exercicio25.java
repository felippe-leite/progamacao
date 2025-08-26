package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a senha:");
		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida! Digite novamente:");
			senha = sc.nextInt();
		}
		sc.close();

		System.out.println("Acesso Permitido");

	}

}
