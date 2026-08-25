package core.operations;

public class LogicalGreatest3 {

	public static void main(String[] args) {
		int a,b,c,great;
		a=12;
		b=56;
		c=45;
		great=(a>b) && (a>c)?a:(b>c)?b:c;
		System.out.println(great);
	}

}
