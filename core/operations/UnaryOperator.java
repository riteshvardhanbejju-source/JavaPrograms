package core.operations;

public class UnaryOperator {

	public static void main(String[] args) {
		
		int a,b,c,d;
		a=c=10;
		b=++a;
		d=c++;
		System.out.println(b+" "+a);
		System.out.println(d+" "+c);
	}

}
