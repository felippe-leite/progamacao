package programacao_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		double x1, x2, x3, media;
		
		for (int i = 0; n > i; i ++) {
			
			x1 = sc.nextDouble();
			x2 = sc.nextDouble();
			x3 = sc.nextDouble();
			media = ((x1 * 2.0) + (x2 * 3.0) + (x3 * 5.0)) / 10;
			System.out.printf("%.1f\n", media);
				
		}
		
		sc.close();

	}

}
