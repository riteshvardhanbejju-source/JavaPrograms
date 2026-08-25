package core.String;
import java.util.Scanner;


class recordd{
	String str;
	public void recordd(String input) {
		this.str=input;
		System.out.println(str);
		
	}
}
public class StudentRecordTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entr the string");
		String sss=sc.nextLine();
		recordd rd = new recordd(sss);
	}

}
