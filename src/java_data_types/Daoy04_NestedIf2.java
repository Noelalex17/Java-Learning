package java_data_types;

public class Daoy04_NestedIf2 {

	public static void main(String[] args) {
		// If the person age is less then 18 he can apply for learner
		// and if the age is greater then 18 he can apply for driver license
		// if the age is greater then 21 he can start working
		// if the age is is greater then 65 he is ready to retire

		int age = 25;
		String name = "john";

		if (age < 18) {
			System.out.println(name + "can aplly for lerners permit");
		} else {
			System.out.println(name + " is greater than age 18 he can apply for drivers license");
			if (age < 21) {
				System.out.println(name + " is less than 21. You are not ready to work");
			} else {
				System.out.println(name + " is greater then 21. You can start working");
				if (age < 65) {
					System.out.println(name + " can continue to work");
				} else {
					System.out.println(name + " is ready to retire");
				}
			}
		}

		// crystals rose_quartz, smokey_quartz, clear_quartz
		// shape sphere, tower

		String crystal = "smokey_quartz";
		String shape = "sphere";

		if (crystal == "rose_quartz") {
			System.out.println("crystal is rose quartz");
			if (shape == "shpere") {
				System.out.println("shape is sphere");
			} else if (shape == "tower") {
				System.out.println("shape is tower ");
			} else {
				System.out.println("crystal is a freeform");
			}
		} else if (crystal == "smokey_quartz") {
			System.out.println(" crystal is smokey quartz");
			if (shape == "sphere") {
				System.out.println("shape is sphere");
			} else if (shape == "tower") {
				System.out.println("shape is tower");
			} else {
				System.out.println("crystal is a freeform");
			}
		} else if (crystal == "clear_quartz") {
			System.out.println("crystal is clear quartz");
			if (shape == "sphere") {
				System.out.println("shape is sphere");
			} else if (shape == "tower") {
				System.out.println("shape is tower");
			} else {
				System.out.println("crystal is a freeform");
			}
		}
		String atm = "validcard";
		int pin = 1111;
		String name2 = "Noel";
		String wrong = "invalid";
				
		if(atm=="valid card") {
			System.out.println("Enter Pin");
			if(pin==1111) {
				System.out.println("Welcome" + " " + name2);
			} else if(wrong=="invalid") {
				System.out.println("You entered an invalid pin");
			} else {
				System.out.println("Return card");
			}
			
		}else if(atm=="invalid card") {
			System.out.println("You entered a invalid card");
		}

	}

}
