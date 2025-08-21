package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();

		sc.close();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("MENOR = " + numero1);
		}
		
		else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("MENOR = " + numero2);
		}
		
		else {
			System.out.println("MENOR = " + numero3);
		}
			
		

	}

}
