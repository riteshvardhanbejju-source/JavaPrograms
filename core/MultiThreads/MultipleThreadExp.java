package core.MultiThreads;

public class MultipleThreadExp extends Thread{
public void run() {
	for(int i=1;i<=5;i++) {
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) {
		MultipleThreadExp mt1= new MultipleThreadExp();
		MultipleThreadExp mt2= new MultipleThreadExp();
		MultipleThreadExp mt3= new MultipleThreadExp();
		MultipleThreadExp mt4= new MultipleThreadExp();
		MultipleThreadExp mt5= new MultipleThreadExp();
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		mt5.start();
	}

}
