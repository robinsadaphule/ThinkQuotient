package Morning;

public class StaticStudent {

	
	static void stf()
	{
		System.out.println("Static function");
	}
	
	static int var= 10;
	
	public static void main(String[] args) {
		stf();
		System.out.println("The Variable value is"+var);
	}
}
