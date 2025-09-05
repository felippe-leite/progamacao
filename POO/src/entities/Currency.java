package entities;

public class Currency {
	
	public static double price;
	public static double bought;
	
	public static double Converter() {
		
		return (bought * price) * 1.06;
		
	}
	
}
