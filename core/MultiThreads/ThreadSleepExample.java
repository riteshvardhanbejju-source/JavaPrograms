package core.MultiThreads;

public class ThreadSleepExample extends Thread {

	public static void main(String[] args) {
		
		
		System.out.println("Thread Started");
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Thread ended");
	}

}
