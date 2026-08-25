package core.operations;

public class logical4practice {

	public static void main(String[] args) {
		int a,b,c,d,great;
		a=2433;
		b=200;
		c=100;
		d=56;
		great=(a>b) && (a>c) && (a>d)?a:(b>c) && (b>d)?b:(c>d)?c:d;
		System.out.println(great);
	}

}

