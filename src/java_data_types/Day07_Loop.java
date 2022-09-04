package java_data_types;

import java.util.Scanner;

public class Day07_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before you loop");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("After the loop");
		System.out.println("before you loop");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("Task 1");
		// 1.Print numbers from 1 to 100
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		System.out.println("Task 2");
		// 2.Print numbers from 100 to 1
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("Task 3");
		for (int i = 20; i <= 50; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Task 4");
		for (int i = 21; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

		}
		System.out.println("Task 5");
		Scanner monthInput = new Scanner(System.in);
		for (int h = 0; h < 3; h++) {

			System.out.println("enter the month you were born in");
			String monthName = monthInput.next();
			if (monthName.equalsIgnoreCase("Jan") || monthName.equalsIgnoreCase("Feb") || monthName.equalsIgnoreCase("Mar")) {
				System.out.println("winter");
			} else if (monthName.equalsIgnoreCase("Apr") || monthName.equalsIgnoreCase("May") || monthName.equalsIgnoreCase("Jun")) {
				System.out.println("Spring");
			} else if (monthName.equalsIgnoreCase("Jul") || monthName.equalsIgnoreCase("Aug") || monthName.equalsIgnoreCase("Sep")) {
				System.out.println("Summer");
			} else if (monthName.equalsIgnoreCase("Oct") || monthName.equalsIgnoreCase("Nov") || monthName.equalsIgnoreCase("Dec")) {
				System.out.println("Fall");
			} else {
				System.out.println("please enter a valid month");
			}
		}
	}

}
