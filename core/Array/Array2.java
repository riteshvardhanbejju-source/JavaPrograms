package core.Array;

public class Array2 {

	public static void main(String[] args) {
		
		String tech[]= {"java","python","database","mern"};
		System.out.println("tech names ");
		for(int i=0;i<tech.length;i++) {
			System.out.println(tech[i]);
		}
		System.out.println("using for each loop");
		for(String ab:tech) {
			System.out.println(ab);
		}
		
	}

}
