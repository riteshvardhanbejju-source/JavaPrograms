package core.String;

public class StringExample {

	public static void main(String[] args) {
		String str = "ritesh";
		String str2 = new String("Welcome to java");
		System.out.println("Original string = "+str2);
		System.out.println(str2.concat("Programing"));
		System.out.println("Original String ="+str2);
		System.out.println(str2.charAt(5));
		System.out.println(str2.indexOf('e'));
		System.out.println(str2.lastIndexOf('e'));
		System.out.println(str2.length());
		System.out.println(str2.substring(5));
		System.out.println(str2.substring(5,10));
		System.out.println(str2.toUpperCase());
		System.out.println(str2);

		System.out.println(str2.toLowerCase());
	}

}
