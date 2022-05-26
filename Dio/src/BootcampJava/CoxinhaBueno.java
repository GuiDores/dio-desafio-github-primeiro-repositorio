package BootcampJava;

import java.util.Scanner;

public class CoxinhaBueno {
		
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	String input = scan.nextLine();
	
	String[] inputSlipt = input.split("Total de coxinhas");
	
	double media = Double.parseDouble(input)/
			Double.parseDouble(input);
	
	System.out.printf("%.2.f"+ media);
}
}
