package core.operations;
import java.util.Scanner;
public class ScannerExp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		byte b;
		float c;
		double d;
		char ch;
		System.out.println("enter a values");
		 a=sc.nextInt();
		 b=sc.nextByte();
		 c=sc.nextFloat();
		 d=sc.nextDouble();
		 ch=sc.next().charAt(0);
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
		 System.out.println(ch);
		 
		
	}

}
