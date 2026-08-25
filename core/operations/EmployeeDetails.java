package core.operations;

public class EmployeeDetails {

	public static void main(String[] args) {
		int EmployeeID = 725;
		String EmployeeName = "Ritesh";
		float Basic = 75000.456f;
		float HRA = 15000f;
		float PF = 2000f;
		
		System.out.println("EmployeeID = " + EmployeeID);
		System.out.println("EmployeeName = " + EmployeeName);
		System.out.println("Basic = " + Basic);
		System.out.println("HRA = " + HRA);
		System.out.println("PF = " + PF);
		System.out.println("total salary of Ritesh is" + (Basic+HRA+PF));
		

	}

}
