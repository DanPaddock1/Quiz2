package Quiz2;

import java.util.Scanner;
public class Main {

	public static Scanner input = new Scanner(System.in);
	private static double tuition, increase, total = 0;
	
	public static void main(String[] args) {
		
		System.out.println("What is the base tuition per year?");
		tuition = input.nextDouble();
		System.out.println("What is the percentage increase per year?");
		increase = input.nextDouble() / 100;
		
		for(int i = 0; i < 4; i++){
			total += tuition + Math.pow(tuition, increase);
		}
		
		System.out.printf("Total tuition after four years:  $%3.2f.", total);
		
		
	}
}
