package java_data_types;

public class Day09_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] rollNumber;// declare an array variable
		//rollNumber = new int[5];
		
		int[] _rollNumber = new int[5];
		_rollNumber[0] = 500;
		_rollNumber[1] = 300;
		_rollNumber[2] = 100;
		_rollNumber[3] = 400;
		_rollNumber[4] = 200;
		
		System.out.println(_rollNumber[4]);
		
		int[] rollNum = {100,200,300,400,500 };
		System.out.println(rollNum[3]);
		
		System.out.println(rollNum.length);
		
		for(int i = 0; i < rollNum.length; i++) {
			System.out.println(rollNum[i]);
		}
		
						
		

	}

}
