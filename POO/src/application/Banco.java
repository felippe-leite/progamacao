package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosBanco;


public class Banco {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		DadosBanco dados = new DadosBanco();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		dados.setAccountNumber(sc.nextInt());
		sc.nextLine(); 
		System.out.print("Enter account holder: ");
		dados.setName(sc.nextLine());
		System.out.print("Is there na initial deposit (y/n)? ");
		 char resp = sc.next().charAt(0);
		
		
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			dados.setInitialDeposit(sc.nextDouble());
		}
		
		System.out.println("Account data:"); 
		System.out.printf(" Account %d, Holder: %s, Balance: $ %.2f\n", dados.getAccountNumber(), dados.getName(), dados.getInitialDeposit());
		
		System.out.print("Enter a deposit value: ");
		dados.updateBalance(sc.nextDouble());
		
		System.out.println("Updated account data:");
		System.out.printf(" Account %d, Holder: %s, Balance: $ %.2f\n", dados.getAccountNumber(), dados.getName(), dados.getInitialDeposit());
		
		System.out.print("Enter a withdraw value: ");
		dados.withdraw(sc.nextDouble());
		System.out.printf(" Account %d, Holder: %s, Balance: $ %.2f", dados.getAccountNumber(), dados.getName(), dados.getInitialDeposit());
		
		sc.close();
		
	
	}

}
