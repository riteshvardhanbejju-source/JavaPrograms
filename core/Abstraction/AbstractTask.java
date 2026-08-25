package core.Abstraction;
abstract class Employee{
	int id;
	String name;
	double salary;
	public void display() {	
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("Id : "+id+"\nName : "+name+"\nSalary : "+salary);
	}
	abstract void calculateSalary();
	
}
class Developer extends Employee{
	@Override
	void calculateSalary() {
		
	}
}
class tester extends Employee{
	@Override
	void calculateSalary() {
		
	}
}
public class AbstractTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
