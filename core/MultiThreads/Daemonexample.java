package core.MultiThreads;

public class Daemonexample extends Thread{
	public void run() {
		if(currentThread().isDaemon()) {
			for(int i=1;i<=10;i++) {
			System.out.println("daemon Thread "+i);
			}
			System.out.println("Deamon thread completed");
			} else {
				for(int i=1;i<=3;i++) {
					System.out.println("user thread"+i);
				}
				System.out.println("user thread completed");
			}
		}
	
	public static void main(String[] args) {
		Daemonexample de1 = new Daemonexample();
		Daemonexample de2 = new Daemonexample();
		Daemonexample de3 = new Daemonexample();
		Daemonexample de4 = new Daemonexample();
		
		de1.setDaemon(true);
		de2.setDaemon(true);
		de4.setDaemon(true);
//		de3.setDaemon(true);

		de1.start();
		de2.start();
		de3.start();
		de4.start();
	}

}
