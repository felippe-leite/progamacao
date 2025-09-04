package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Dados info = new Dados();

		System.out.print("Nome: ");
		info.name = sc.nextLine();
		System.out.print("Nota 1: ");
		info.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		info.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		info.nota3 = sc.nextDouble();
		
		System.out.println(info.finalGrade());

		sc.close();

	}

}
