package entities;

public class Retangulo {

	public double a;
	public double b;

	public double area() {

		return a * b;

	}

	public double perimetro() {

		double result = 2 * (a + b);
		return result;
	}

	public double diagonal() {
		double result = Math.sqrt((a * a) + (b * b));
		return result;
	}
}
