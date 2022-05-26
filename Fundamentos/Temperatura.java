package Fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final double  Fator = 5.0 / 9.0;
		final double Ajuste = 32;
		
		double Fahrenheit = 86;
		double Celsius = (Fahrenheit - Ajuste) * Fator;
		System.out.println("O resultado é" + Celsius + "°C.");
		
		Fahrenheit = 0;
		Celsius = (Fahrenheit - Ajuste) * Fator;
		System.out.println("O resultado é" + Celsius + "°C.");
		
	}

}
