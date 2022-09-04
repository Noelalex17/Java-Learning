package java_data_types;

public class Day02_Assignedvalues {
	static int b;
	static char c;
	static double e;
	static float g;
	static boolean i;
	static String k;

	public static void main(String[] args) {
		// initalizing a variable 
		// the variable name is a and the value is 5
		int a = 5; 
		//declared a variable b
		System.out.println(a);
		System.out.println(b);
		// initialize a char variable d
		char d = 'h';
		System.out.println(c);
		System.out.println(d);
		double f = 10.123156478464654354;
		System.out.println(e);
		System.out.println(f);
		float h = 10.15361456431231423432432f;
		System.out.println(g);
		System.out.println(h);
		boolean j = true;
		System.out.println(i);
		System.out.println(j);
		String l = "Hello";
		System.out.println(k);
		System.out.println(l);
		String first_name = "Noel";
		String last_name = "Gil";
		System.out.println(first_name+last_name);
		System.out.println(first_name + ' ' + last_name);
		System.out.println("Noel" + ' ' + "Gil");
		System.out.println(f+h);
		System.out.println("*************************************");
		System.out.println("Arithmetic Example");
		System.out.println("*************************");
		
		int value1 = 50;
		int value2 = 10;
		
		//Addition
		System.out.println(value1 + value2);
		int sum = value1 + value2;
		
		//Subtraction
		System.out.println(value1 - value2);
		System.out.println(sum);
		
		//Division
		System.out.println(value1 / value2);
		int div = value1/value2;
		System.out.println(div);
		
		//multiplication
		System.out.println(value1 * value2);
		int mul = value1 * value2;
		System.out.println(mul);
		
		//mod
		System.out.println(value1 % value2);
		int mod = value1%value2;
		System.out.println(mod);
	
		//Write a Java program to print an int, double and char.
		//Write a program to add an integer variable having value 5 and a double variable having value 6.2.
		//Write a program to find the square of the number 3.9.
		//Write a program to print the area of a rectangle of sides 2 and 3.

		//Area = Length x Width
		
		char n = 'G';
		System.out.println(n);
		int value3 = 28;
		System.out.println(value3);
		double o = 10.153145643241234;
		System.out.println(o);
		
		int value4 = 5;
		double value5 = 6.2;
		System.out.println(value4 + value5);
		
		float q = 3.9f; 
		System.out.println(q*q);
		
		int length = 2;
		int width = 3;
		int area = length * width;
		System.out.println(area);
		
		System.out.println("*************************************");
		System.out.println("Operators");
		System.out.println("*************************");
		int aa = 500;
		int bb = 600;
		System.out.println(aa == bb);
		boolean cc = aa==bb;
		System.out.println(cc);
		
		boolean dd = aa!=bb;
		System.out.println(dd);
		
		System.out.println(aa > bb);
		boolean ee = aa>bb;
		System.out.println(ee);
		
		System.out.println(200 >= 200);
		boolean ff = 200>=200;
		System.out.println(ff);
		
		System.out.println(100 < 200); //t
		boolean gg = 100<200;
		System.out.println(gg);
		
		System.out.println(2000 <= 300); //f 
		boolean hh = 2000<=300;
		System.out.println(hh);
		
		
		
		
		
		
		
		
		
		

	}

}
