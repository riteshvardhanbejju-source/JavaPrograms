package AccessModifiers;
class Salary
{
	public double calculateSalary(double basic,double hra,double da) {
		double total=basic+hra+da;
		return total;
	}
}
public class EmployeeSalary {

	public static void main(String[] args) {
		Salary cs = new Salary();
		double emptot=cs.calculateSalary(1233, 34242.334, 24234.3);
				System.out.println("total sal = "+emptot);
	}

}
