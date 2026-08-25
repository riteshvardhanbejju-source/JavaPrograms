package core.OPPS.Inheritance;
class student{
	int id;
	String name;
	int mbno;
	public void setData(int id,String name,int mbno) {
		this.id=id;
		this.mbno=mbno;
		this.name=name;
		
	}
}
class marks extends student{
	int m1,m2,m3;
	public void addmarks() {
		m1=59;
		m2=78;
		m3=99;
	}
	public void getdata() {
		System.out.println(id+" "+name+" "+mbno);
	}
}
class sports extends marks{
	int spcore=56;
	void calc() {
		int totalscore = m1+m2+m3+spcore;
		System.out.println("total = "+totalscore);
	}
}
public class Multilevel_inheritance {

	public static void main(String[] args) {
		sports sp = new sports();
		sp.setData(21, "ritesh", 134112414);
		sp.getdata();
		sp.addmarks();
		sp.calc();
	}

}
