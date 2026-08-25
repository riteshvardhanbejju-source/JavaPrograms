package core.OPPS.polymorphism;

class student{
	int stid;
	String stname;
	double score;
	public student(){
		this(21,"ritesh",34);
	}
	public student(int stid,String stname,double score){
		this(29,"rajesh");
		this.stid=stid;
		this.score=score;
		this.stname=stname;
	}
	public student(int stid,String stname){
		this.stid=stid;
		this.stname=stname;
		System.out.println(stid+" "+stname);
	}
	public void show() {
		System.out.println(stid+" "+stname+" "+score);
	}
}
public class ThisConstructor {

	public static void main(String[] args) {
		student st = new student();
		st.show();
	}

}
