package ProblemsALL;
import java.util.Scanner;

class PoNe{
	public void Ponee(int num) {
		if(num<0) {
			System.out.println("negative");
		}
		else if(num>0) {
			if (num%2==0) {
				System.out.println("number is positive and even");
			}else {
				System.out.println("number is positive but its odd");
			}
		}else {
			System.out.println("number is zero");
		}
	}
}



public class PNE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PoNe pn= new PoNe();
		System.out.println("enter a number");
		int number = sc.nextInt();
		pn.Ponee(number);
	}

}
