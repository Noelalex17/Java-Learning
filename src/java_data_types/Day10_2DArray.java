package java_data_types;

public class Day10_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method
//		String[][] countries = new String[2][2];
//		countries[0][0] = "USA";
//		countries[0][1] = "Canada";
//		countries[1][0] = "Switzerland";
//		countries[1][1] = "France";
//		System.out.println(countries[1][1]);

//		int[][] num = new int[2][2];
//		num[0][0] = 1;
//		num[0][1] = 2;
//		num[1][0] = 3;
//		num[1][1] = 4;
//		System.out.println(num[1][1]);

		String[][] _countries = { 
				{ "USA", "Canada" },
				{ "France", "Switzerland" }, 
				{ "Germany", "England" } };
		System.out.println(_countries[1][1]);
//		System.out.println(_countries.length);
//		System.out.println(_countries[0].length);
		
		for(int rows=0; rows < _countries.length; rows++) {
			for(int column = 0; column < _countries[rows].length; column++) {
				System.out.println(_countries[rows][column]);
			}
			
		}	
	}

}
