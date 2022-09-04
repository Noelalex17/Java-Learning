package java_data_types;

public class Day05_SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "tuesday";
		
		switch(day) {
		
		case "monday":
			System.out.println("1st day of the week");
			break;
		case "tuesday":
			System.out.println("2nd day of the week");
			break;
		case "wednesday":
			System.out.println("3rd day of the week");
			break;
		case "thurday":
			System.out.println("4th day of the week");
			break;
		case "friday":
			System.out.println("5th day of the week");
			break;
		case "saturday":
			System.out.println("6th day of the week");
			break;
		case "sunday":
			System.out.println("7th day of the week");
			break;
		default:
			System.out.println("You have entered an invalid day");
		
		} // ends here
		
		int age = 20;
		switch(age) {
		case 1:
			System.out.println("the value is 1");
			break;
		case 2:
			System.out.println("the value is 2");
			break;
		case 3:
			System.out.println("the value is 3");
			break;
		case 4:
			System.out.println("the value is 4");
			break;
		case 5:
			System.out.println("the value is 5");
			break;
		case 6:
			System.out.println("the value is 6");
			break;
		case 7:
			System.out.println("the value is 7");
			break;
		case 8:
			System.out.println("the value is 8");
			break;
		case 9:
			System.out.println("the value is 9");
			break;
		case 10:
			System.out.println("the value is 10");
			break;
		case 11:
			System.out.println("the value is 11");
			break;
		default:
			System.out.println("the value is something else");
		}
		//ends here
		char grade = 'A';
		switch(grade) {
		case 'a':
			System.out.println("You got a A");
			break;
		case 'B':
			System.out.println("You got a B");
			break;
		case 'c':
			System.out.println("You got a C");
			break;
		case 'D':
			System.out.println("You got a D");
			break;
		case 'F':
			System.out.println("You got a F");
			break;
		}

	}

}
