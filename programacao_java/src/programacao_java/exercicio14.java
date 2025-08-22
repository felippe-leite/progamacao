package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numeroA = sc.nextInt();
		int numeroB = sc.nextInt();

		sc.close();

		if (numeroA > numeroB && numeroA % numeroB == 0) {
			System.out.println("Sao Multiplos");

		}

		else if (numeroB > numeroA && numeroB % numeroA == 0) {
			System.out.println("Sao multiplos");

		}
		
		else {
			System.out.println("Nao sao multiplos");
			
		}
		

	}

}
