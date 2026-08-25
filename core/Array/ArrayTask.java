package core.Array;

public class ArrayTask {

	public static void main(String[] args) {
		int num[]= {1,2,34,5,6,3,4,78,8,};
		int larger=num[0];
		for (int i=0;i<num.length;i++) {
			if(num[i]>larger) {
				larger=num[i];
			}
		}
		System.out.println("largest number = "+larger);
	}

}
