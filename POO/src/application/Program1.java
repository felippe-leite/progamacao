package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee dados = new Employee();
		
		System.out.print("Name: ");
		dados.name = sc.nextLine();
		System.out.print("Gross salary: ");
		dados.salary = sc.nextDouble();
		System.out.print("Tax: ");
		dados.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f\n", dados.name, dados.salary);
		
		System.out.print("Which percentage to increase salary? ");
		double porcentage = sc.nextDouble();
		dados.increaseSalary(porcentage);
		
		System.out.println(dados);
		
		sc.close();
		
	}

}
