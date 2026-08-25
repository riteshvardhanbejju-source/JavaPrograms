package TimePass;
 
class detailss{
	int empId;
	int empSal;
	String empName;
	
	static String cmpName="texas";
	static String HRname = "likitha";
	static String Location = "kerala";
	
	public void setdata(int empId,int empSal,String empName) {
		this.empId=empId;
		this.empSal=empSal;
		this.empName=empName;
	}
	public void disply() {
		System.out.println(empId);
		System.out.println(empSal);
		System.out.println(empName);
		System.out.println(cmpName);
		System.out.println(HRname);
		System.out.println(Location);
	}
}



public class EmployeeMgmt {

	public static void main(String[] args) {
		detailss dt=new detailss();
		dt.setdata(110, 20000, "ritesh");
		
		detailss dt1=new detailss();
		dt1.setdata(110, 20000, "ramesh");
		
		detailss dt2=new detailss();
		dt2.setdata(110, 20000, "rahul");
		
		dt.disply();
		dt1.disply();
		dt2.disply();
		
	}

}
