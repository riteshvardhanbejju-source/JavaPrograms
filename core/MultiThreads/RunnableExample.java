package core.MultiThreads;

public class RunnableExample implements Runnable{

	@Override
	public void run() {
		System.out.println("Example of runnable");
	}
	public static void main(String[] args) {
		RunnableExample re = new RunnableExample();
		Thread tr = new Thread(re,"names");
		tr.start();
		System.out.println(tr.getName());
	}


}
