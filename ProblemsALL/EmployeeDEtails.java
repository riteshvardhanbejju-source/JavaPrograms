package ProblemsALL;
import java.util.Scanner;

class detailss{
	int id;
	String name;
	double salary;
	String status;
	public void setdata(	int id,	String name,double salary,String status) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.status=status;
	}
	public void disply() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(status);
	}
}





public class EmployeeDEtails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		detailss  ds = new detailss(); 
		
		System.out.println("enter the id");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the name");
		String name = sc.nextLine();
		
		System.out.println("enter the salary");
		int sal = sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter the status");
		String stat = sc.nextLine();
		
		ds.setdata(id, name, sal, stat);
		ds.disply();
		
	}

}
