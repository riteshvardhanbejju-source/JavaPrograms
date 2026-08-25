package ProblemsALL.LOOPS;
import java.util.Scanner;

class even{
	public void numbers(int num) {
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
public class EvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		even ec =new even();
		System.out.println("enter the limit");
		int lit = sc.nextInt();
		ec.numbers(lit);
	}

}
