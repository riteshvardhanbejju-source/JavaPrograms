package AccessModifiers;

import java.util.Scanner;

class Marks{
	int total;
	public int calculationtotal(int m1, int m2, int m3) {
		 total = m1+m2+m3;
		return total;
	}
	public void calculateavg() {
		int avrg = total/3;
		System.out.println("average is  "+avrg);
	}
}
public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int maths = sc.nextInt();
		int science = sc.nextInt();
		int social = sc.nextInt();
		Marks mk = new Marks();
		int tot = mk.calculationtotal(maths, science, social);
		System.out.println("ttotal= "+tot);
		mk.calculateavg();
	}

}
