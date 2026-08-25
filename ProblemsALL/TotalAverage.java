package ProblemsALL;
import java.util.Scanner;

public class TotalAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Total tl = new Total();
		System.out.println("enter marks of english");
		tl.setEng(sc.nextInt());
			System.out.println("enter marks of maths");
		tl.setMaths(sc.nextInt());
			System.out.println("enter marks of hindi");
		tl.setHindi(sc.nextInt());
		
		
		System.out.println("eng = " + tl.getEng());
		System.out.println("maths = " + tl.getMaths());
		System.out.println("hindi = " + tl.getHindi());
		System.out.println("total = "+ tl.getTotal());
		System.out.println("total = "+ tl.getAvg());
		
		
	}

}
