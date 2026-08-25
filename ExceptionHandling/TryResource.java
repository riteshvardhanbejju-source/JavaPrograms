package ExceptionHandling;

import java.util.Scanner;

public class TryResource {

	public static void main(String[] args) {
		int count;
		try(Scanner sc = new Scanner(System.in)){
			count=sc.nextInt();
			System.out.println(count);
		}
	}

}
