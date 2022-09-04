package java_data_types;

import java.util.Scanner;

public class Noels_Calculator {

	public static void main(String[] args) {
		// Noel's calculator
		Scanner Noels_Calculator = new Scanner(System.in);
		System.out.println("Welcome and Thank you for choosing the #1 Calculator in the mutiverse."
				+ " Please enter the first value");
		double val1 = Noels_Calculator.nextDouble();
		System.out.println("Please enter the second value");
		double val2 = Noels_Calculator.nextDouble();
		System.out.println("Now whitch would you like to perform? +, -, /, *,");
		String answer = Noels_Calculator.next();
		
		switch(answer) {
			case "+":
				System.out.println("The sum is : " + (val1 + val2));
				break;
			case "-":
				System.out.println("The subtraction of value is : " + (val1-val2));
				break;
			case "/":
				System.out.println("The division of the 2 values is : " + (val1/val2));
				break;
			case "*":
				System.out.println("The multiplation of the 2 values is : " + (val1*val2));
				break;
			default:
				System.out.println("You entered an invalid operator please try again");
				
				
				
				
		}
		
		 
			
			
		
		

}

}
