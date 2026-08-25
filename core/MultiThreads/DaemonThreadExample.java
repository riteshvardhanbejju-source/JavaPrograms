package core.MultiThreads;

public class DaemonThreadExample extends Thread{

		public void run() {
			if(currentThread().isDaemon()) {
				System.out.println("Daemon thread works");
			}
			else {
				System.out.println("User thread ");
			}
		}
		public static void main(String[] args) {
			DaemonThreadExample dm1 = new DaemonThreadExample();
			DaemonThreadExample dm2 = new DaemonThreadExample();
			DaemonThreadExample dm3 = new DaemonThreadExample();
			dm1.setDaemon(true);
			
			dm1.start();
			dm2.start();
			dm3.start();
		}
	}


