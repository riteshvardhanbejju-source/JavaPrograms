package ProblemsALL;
import java.util.Scanner;

class Leap{
	public String LeapYear(int year) {
		if((year%4==0 && year%100!=0) || year%400==0) {
			return "Leap year";
		}else {
			return "not a leapyear";
		}
	}
	
}


public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Leap ly = new Leap();
		System.out.println("enter the year");
		int year = sc.nextInt();
		String result = ly.LeapYear(year);
		System.out.println(result);
	}

}
