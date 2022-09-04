package java_data_types;

public class Day12_Methods {

	public static void main(String[] args) {
		
		String a = day();// return it is going to give me String value.
		System.out.println(a);
		
		String b = month();//August
		System.out.println(b);
		
		String value = topic(" Void and non void methods");
		System.out.println(value);
	}
	
	public static String topic( String a) {
		return "today we are learning"+a;		
		
	
	}
	
	// non void method without parameters
	public static String day() {
		String todaysday = "Tuesday";
		return todaysday;
		
	}
	 public static String month() {
		return "August";
	}

}
