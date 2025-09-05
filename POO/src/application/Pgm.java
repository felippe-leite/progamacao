package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Currency;

public class Pgm {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Whats is the dollar price? ");
		Currency.price = sc.nextDouble();
		
	
		
		System.out.print("How many dollars will be bought? ");
		Currency.bought = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", Currency.Converter());
		sc.close();
		

	}

}
