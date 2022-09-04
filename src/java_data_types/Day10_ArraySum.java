package java_data_types;

public class Day10_ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {12,3,4,5,6,7,80};
		int sum=0;
		
		for(int i=0; i<numbers.length; i++) {
			sum = sum+numbers[i];
		}
		System.out.println(sum);
	}

}
 