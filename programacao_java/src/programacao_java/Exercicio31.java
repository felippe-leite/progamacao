package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; x >= i; i++) {
			
			if (i % 2 != 0) {
				System.out.println(i);
			}
			
			
			
		}
		
		
		
		sc.close();

	}

}
