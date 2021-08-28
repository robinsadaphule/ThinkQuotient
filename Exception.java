package Morning;

public class Exception {

	public static void main(String[] args) {
		System.out.println("Starting of code ");
		method1();
		System.out.println("Main method end");
	}

	private static void method1() {
		// TODO Auto-generated method stub
		System.out.println("the method 1 is called");
		method2();
		System.out.println("The end of method 1");
	}

	private static void method2() {
		// TODO Auto-generated method stub
	System.out.println("the method 2 is called");
	String str= null;
	int a= str.length();
	System.out.println("the end of method 2");
	}
}
