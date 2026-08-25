package PracticeDAY1;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of ractangle");
		float length = sc.nextFloat();
		System.out.println("enter the breadth of ractangle");
		float breadth = sc.nextFloat();
		System.out.println("area of rectangle : "+ (length*breadth));
		System.out.println("perimeter of rectangle : "+ (2*length+2*breadth));
	}

}
