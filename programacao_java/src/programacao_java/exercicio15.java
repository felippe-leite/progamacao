package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		int duracao = 0;

		sc.close();

		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		}

		else if (horaFinal < horaInicial) {
			duracao = (horaFinal + 24) - horaInicial;
		}

		else if (horaFinal == horaInicial) {
			duracao = 24;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

	}

}
