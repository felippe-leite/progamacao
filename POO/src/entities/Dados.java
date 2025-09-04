package entities;

public class Dados {

	public String name;
	public double nota1 = 0;
	public double nota2 = 0;
	public double nota3 = 0;

	public double finalGrade() {

		return nota1 + nota2 + nota3;

	}
	

}
