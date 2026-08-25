package ProblemsALL.LOOPS;

class prime{
	public prime(int num) {
		int count =0;
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
			count=count+1;
			}
		}if (count==2) {
			System.out.println("prime");
		}else
			System.out.println("not a prime");
	}
}
public class PrimeNumber {

	public static void main(String[] args) {
		prime pr = new prime(13);
	}

}
