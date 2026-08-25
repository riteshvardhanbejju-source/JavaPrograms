package ProblemsALL.LOOPS;

class hot{
	public void hottey(int num){
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
}
public class FactorsOfNumber {

	public static void main(String[] args) {
		hot ht = new hot();
		ht.hottey(100);
	}

}
