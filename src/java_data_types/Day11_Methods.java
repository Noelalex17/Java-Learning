package java_data_types;

public class Day11_Methods {
	//main method
	public static void main(String[] args) {
	//caling the sample method
		sample();
		hello();
		sum();
		add(4,8);
	}
	//user defined method without parameters
	public static void sample() {
		System.out.println("Hello World");
	}
	public static void hello() {
		System.out.println("Hello Today we are learning methods");
	}
	public static void sum() {
		int a = 5;
		int b = 10;
		System.out.println(a+b);
	}
	// method with parameters
	public static void add(int a, int b) {
		System.out.println(a + b);
	}

}
