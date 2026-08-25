package TimePass;

import java.util.Scanner;

class details{
	 int rollno;
	 String name;
	 int marks;
	static String college = "Talent sprintz";
	static String course = "Fullstack";
	static String trainername = "Likitha";
	public void setData(int rollno,String name,int marks) {
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	public void disply() {
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(course);
		System.out.println(college);
		System.out.println(trainername);
	}
}
public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		details dc = new details();
		System.out.println("enter the marks");
		int marks = sc.nextInt();
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println("enter the rollno");
		int rollno = sc.nextInt();
		
		dc.setData(rollno, name, marks);
		dc.disply();
		
		}

}
