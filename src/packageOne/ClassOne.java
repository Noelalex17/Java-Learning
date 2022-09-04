package packageOne;

public class ClassOne {
	public int a1 = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne c1 = new ClassOne();
		c1.methodOne();
		System.out.println(c1.a1);
	}
	
	
	public static void methodOne() {
		System.out.println("this is method 1");
	}

}
