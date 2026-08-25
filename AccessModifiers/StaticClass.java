package AccessModifiers;
class book{
	static int cost=52234;
	static void display(int qunt) {
		int total = qunt*cost;
		System.out.println("total = " + total);
	}
}

public class StaticClass {
	static void wish(){
		System.out.println("hello");
	}

	public static void main(String[] args) {
//		because above display method is static so we doesn't need to create an object to call it
//		we can directly call using (classname).method().
		book.display(6);
//		since this wish method is in same class where main is present so we can call the method directly by (methodname())
		wish();
	}

}
