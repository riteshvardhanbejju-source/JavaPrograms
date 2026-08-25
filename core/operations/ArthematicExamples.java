package core.operations;

public class ArthematicExamples {

	public static void main(String[] args) {
		int a,b,c;
		a=b=c=12;//multiple assignment
		System.out.println("sum=" +(a+b));
		System.out.println("sub=" +(a-b));
		System.out.println("mul=" +(a*b));
		System.out.println("div=" +(a/b));
		System.out.println("modulus=" +(a%b));
		
		//compund assignment
		a+=10;
		b-=7;
		c%=3;
		System.out.println(a+" "+b+" "+c);
	}

}
