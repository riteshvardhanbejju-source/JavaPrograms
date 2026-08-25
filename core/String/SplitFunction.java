package core.String;

public class SplitFunction {

	public static void main(String[] args) {
		String str="Welcome#to#java#class";
		for(String s:str.split("#")){
			System.out.print(s+" ");
		}
	}

}
