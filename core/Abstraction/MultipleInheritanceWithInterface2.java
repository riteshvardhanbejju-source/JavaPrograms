package core.Abstraction;
class Employeeee{
	double basicSalary = 40000;
	public void displayEmployee() {
		System.out.println("Basic Salary = "+basicSalary);
	}
}


interface Bonus{
	public void calculateBonus();
}


//multiple Inheritance
class Salary extends Employeeee implements Bonus{
	double bonus;
	@Override
	public void calculateBonus() {
		if (basicSalary>40000) {
			 bonus = basicSalary*0.20;
		}else {
			bonus = basicSalary*0.10;
		}
	}
	public void display() {
		System.out.println("bonus = "+bonus);
		double total = basicSalary+bonus;
		System.out.println("Total Salary = "+total);
	}
}
public class MultipleInheritanceWithInterface2 {

	public static void main(String[] args) {
		Salary sc= new Salary();
		sc.displayEmployee();
		sc.calculateBonus();
		sc.display();
	}

}
