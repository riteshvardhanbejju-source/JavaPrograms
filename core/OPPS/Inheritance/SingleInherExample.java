package core.OPPS.Inheritance;
class car{
	int cid;
	String crname;
	double crcost;
	public void disply() {
		System.out.println("parent class");
	}
}
class maruthi extends car{
	public void setdata() {
		cid = 12233;
		crname = "BMW";
		crcost = 750000;
		System.out.println(cid+" "+crname+" "+crcost);
		
	}
}
public class SingleInherExample {
	
	public static void main(String[] args) {
		maruthi mi = new maruthi();
		mi.disply();
		mi.setdata();
	}
}
