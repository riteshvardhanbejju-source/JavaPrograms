package AccessModifiers;

class Static{
//	global variable
	static int count=0;//memory is allocated onlt once and shared by all the objects
	
	public void calc() {
		count++;
		System.out.println(count);
	}
}



public class StaticExample {

	public static void main(String[] args) {
		Static sc = new Static();
		sc.calc();
		Static sc1 = new Static();
		sc1.calc();
		Static sc2 = new Static();
		sc2.calc();
	}

}
