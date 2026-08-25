package core.MultiThreads;

public class Thread2Example {
	public void run() {
		System.out.println("runnning..........");
	}
	public static void main(String[] args) {
		Thread th2 = new Thread("product");
		th2.setPriority(4);
		System.out.println(th2.getName());
		System.out.println(th2.getPriority());
		Thread2Example te = new Thread2Example();
	}

}
