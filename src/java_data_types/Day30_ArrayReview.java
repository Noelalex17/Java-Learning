package java_data_types;

public class Day30_ArrayReview {

	public static void main(String[] args) {
		String country_name = "USA";
		System.out.println(country_name);
		
		char charachter = 'c';
		System.out.println(charachter);
		
		int age = 25;
		System.out.println(age);
		
		String[] countries = {"USA", "Canada","China", "UAE"};
		for(String a : countries) {
			System.out.println(a);
		}
		
		char[] alphabets = {'a','b','c','d'};
		for(char a : alphabets) {
			System.out.println(a);
		}
		
		int[] _age = {25,35,45,55};
		for(int a : _age) {
			System.out.println(a);
		}
		

	}

}
