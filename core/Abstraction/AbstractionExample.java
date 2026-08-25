package core.Abstraction;
abstract class Calculate{
	
	abstract void add(int a , int b);
	
	public void display() {
		System.out.println("example of abstract class");
	}
}
class arithematic extends Calculate{

	@Override
	void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
}
public class AbstractionExample {

	public static void main(String[] args) {
		arithematic ar = new arithematic();
		ar.display();
		ar.add(9, 70);
	}

}
