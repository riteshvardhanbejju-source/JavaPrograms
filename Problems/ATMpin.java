package Problems;
import java.util.Scanner;
public class ATMpin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int original = 234567;
		int pin;
		int attempts = 3;
		do {
			System.out.println("enter your six digit pin");
			 pin =sc.nextInt();
			
			
			if(pin!=original) {
				attempts--;
			System.out.println(" attempts remaining "+attempts);
			
			}else {
				System.out.println("Accsess granted");
			break;}
			
		}while(attempts>0);
		
		if (attempts==0) {
			System.out.println("account blocked");
		}
	}

}
