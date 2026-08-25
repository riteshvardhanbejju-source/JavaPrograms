package core.MultiThreads;

public class ThreadExample extends Thread {
	public void run() {
		System.out.println("Thread is in run state");
	}
	public static void main(String[] args) {
		ThreadExample th = new ThreadExample();
		System.out.println(th);
		th.setName("hello");
		th.setPriority(7);
		System.out.println(th);
		th.start();
	}
}
