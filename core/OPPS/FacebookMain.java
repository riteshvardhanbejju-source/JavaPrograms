package core.OPPS;

public class FacebookMain {

	public static void main(String[] args) {
		Facebook fb = new Facebook();
		fb.id=101;
		fb.name = "ritesh";
//		fb.age = 49;
		
		int sum = fb.addnum(20,12);
		System.out.println(sum);
		
		System.out.println(fb.addnum(10, 50));
		
	}

}
