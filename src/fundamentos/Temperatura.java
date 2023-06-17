package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) * 5/9 = °C
		
		double fare = 300;
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;
		
		double c = (fare - AJUSTE) * FATOR;
		System.out.println("O resultado e " + c + " °C");
		
		fare = 180;
		c = (fare - AJUSTE) * FATOR;
		System.out.println("O resultado e " + c + " °C");
		
	}
}
