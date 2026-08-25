package core.Array.Task;

public class CountNumbers {

	public static void main(String[] args) {
		int[] arr= {1,2,3,45,6,7,8,9,67,22};
		int Evencount=0;
		int Oddcount=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				Evencount=Evencount+1;
			}else {
				Oddcount=Oddcount+1;
			}
		}
		System.out.println("------------Elements in an array-----------");
		for(int nw:arr)
			System.out.println(nw);
		System.out.println("------------counts-----------");
		System.out.println("even count in array = "+Evencount);
		System.out.println("Odd count in array = "+Oddcount);
	}

}
