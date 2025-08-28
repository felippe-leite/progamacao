package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int resultado; 
		
		
		for (int i = 1; i <= n; i++) {
			
			resultado = n * i;
			System.out.println(i + " x " + n + " = " + resultado);
			
		}
		
		sc.close();


	}

}
