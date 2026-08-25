package TimePass;

import java.util.Scanner;

class adam{
	public void Number(int num) {
		
		
		int square1 = num*num;
		int reversenumber = 0;
		int reversenumbersquare = 0;
		int revnumsqurev = 0;
		
		//reverse of original number
		while (num>0) {
			int digit = num % 10;
			 reversenumber = reversenumber * 10 + digit;
			 num = num/10;
		}
		//square of reversed number
		 reversenumbersquare = reversenumber*reversenumber;
		
		 //reverse of the square
		while(reversenumbersquare>0){
			int digit = reversenumbersquare % 10;
			revnumsqurev = revnumsqurev * 10 +digit;
			reversenumbersquare=reversenumbersquare/10;
			
		}
		if(square1==revnumsqurev) {
			System.out.println("adam number");
		}else {
			System.out.println("not an adam number");
		}
		
	}
}
public class AdamNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		adam ad = new adam();
		System.out.println("enter the number");
		ad.Number(sc.nextInt());
	}

}
