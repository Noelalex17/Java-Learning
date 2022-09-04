package java_data_types;

public class Day03_IfConditioons {

	public static void main(String[] args) {
		// if statement
		if(2==2) {
		System.out.println("the value is 2");	
		}
		System.out.println("After the if statement");
		
		//false statement
		if(2==3) {
			System.out.println("Value is not 2");
		}
		
		//if statement and else statement
		int a = 30;
		if (a==30) {
			System.out.println("The value of a is 30");
		} else {
			System.out.println("the value of a is not 30");
		}
		// Compare 2 double values using if else statement
		double b = 25.546343;
		double c = 30.53468483132;
		if(b>=c) {
			System.out.println("b value is greater then c");
		} else {
			System.out.println("b value is not greater then c");
		}
		//Check if the number is positive or negative using if else statement
		int d = 0;
		if(d > 0) {
			System.out.println("the value is positive");
		} else {
			System.out.println("the value is negative");
		}
		
		char value = 'a';
		if(value == 'a') {
			System.out.println("the value is a");
		} else if(value == 'b') {
			System.out.println("the value is b");
		} else if(value == 'c') {
			System.out.println("the value is c");
		} else if(value == 'd') {
			System.out.println("the value is d");
		} else {
			System.out.println("the value is something else");
		}
		
		String name1 = "Noel";
		String name2 = "Maricruz";
		if(name1 == name2) {
			System.out.println("Name is the same");
		} else {
			System.out.println("Name is not the same");
		}
		
		
		String happy = "sunday";
		if(happy== "monday") {
			System.out.println("value is Monday");
		}else if(happy=="tuesday") {
			System.out.println("value is Tuesday");
		}else if(happy=="wednesday") {
			System.out.println("value is Wednesday");
		}else if(happy=="thursday") {
			System.out.println("value is Thursday");
		}else if(happy=="friday") {
			System.out.println("value is Friday");
		}else if(happy=="saturday") {
			System.out.println("value is Saturday");
		}else if(happy=="sunday") {
			System.out.println("value is Sunday");
		} else {
			System.out.println("not happy any day of the week");
		}
		
		int day2 = 2;
		if(day2== 1) {
			System.out.println("value is Monday");
		}else if(day2==2) {
			System.out.println("value is Tuesday");
		}else if(day2==3) {
			System.out.println("value is Wednesday");
		}else if(day2==4) {
			System.out.println("value is Thursday");
		}else if(day2==5) {
			System.out.println("value is Friday");
		}else if(day2==6) {
			System.out.println("value is Saturday");
		}else if(day2==7) {
			System.out.println("value is Sunday");
		} else {
			System.out.println("not happy any day of the week");
		}
		
		boolean isRaining = false;
		
		if(isRaining == true) {
			System.out.println("It is Raining");
		} else {
			System.out.println("It is not raining");
		}
			
		

	}

}
