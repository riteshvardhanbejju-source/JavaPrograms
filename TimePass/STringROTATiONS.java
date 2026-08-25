package TimePass;

public class STringROTATiONS {

	public static void main(String[] args) {
		String str="abcd";
		String str2="cdab";
		
		if(str.length()==str2.length() && (str + str).contains(str2)) {
			System.out.println("string is rotational");
		}else {
			System.out.println("not rotational");
		}
	}

}
