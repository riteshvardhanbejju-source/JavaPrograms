package ProblemsALL.LOOPS;

class king{
	public king(int num) {
		int count = 0;
		for (int i=1;i<=num;i++) {
			if (num%i==0) {
				count=count+1;
			}
		}System.out.println(count);
	}
}
public class CountFactors {

	public static void main(String[] args) {
		king kg = new king(2);
	}

}
