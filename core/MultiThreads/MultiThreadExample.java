package core.MultiThreads;

public class MultiThreadExample extends Thread {
	public MultiThreadExample (String name, int priority) {
		super(name);
		setPriority(priority);

	}
	public void run() {
		System.out.println(getName()+"is running with priority "+getPriority());
	}
	public static void main(String[] args) {
		MultiThreadExample mt1 = new MultiThreadExample("Thread 1",7);
		MultiThreadExample mt2 = new MultiThreadExample("Thread 2",8);
		MultiThreadExample mt3 = new MultiThreadExample("Thread 3",5);
		MultiThreadExample mt4 = new MultiThreadExample("Thread 4",2);
		MultiThreadExample mt5 = new MultiThreadExample("Thread 5",1);
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		mt5.start();
	}

}
