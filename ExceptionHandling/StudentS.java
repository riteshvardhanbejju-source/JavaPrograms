package ExceptionHandling;

public class StudentS {
	int id;
	public StudentS(int id) {
		this.id=id;
		System.out.println("objected created "+id);
	}
	public void Finalize() {
		System.out.println("objected destroyed "+id);
	}
	public static void main(String[] args) {
		StudentS s1=new StudentS(101);
		StudentS s2=new StudentS(102);
		s1=null;
		s2=null;
		System.gc();
		System.out.println("end of main");
	}

}
