package core.Abstraction;
interface animal{
	public void eat();
	public void sound();
}
class dog implements animal{
	@Override
	public void eat() {
		System.out.println("dog eats everything");
	}
	@Override
	public void sound() {
		System.out.println("bow-boww");
	}

}
class cat implements animal{
	@Override
	public void eat() {
		System.out.println("cat drinks milk");
	}
	@Override
	public void sound() {
		System.out.println("meow-meoww");
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		dog dg = new dog();
		cat cyt = new cat();
		dg.eat();
		dg.sound();
		cyt.eat();
		cyt.sound();
	}

}
