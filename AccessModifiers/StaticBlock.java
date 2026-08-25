package AccessModifiers;

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("i am from main method");
	}
	
	static {
		System.out.println("i am from static block");
	}

}
