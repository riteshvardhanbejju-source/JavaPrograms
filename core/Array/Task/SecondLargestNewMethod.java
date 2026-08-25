package core.Array.Task;

public class SecondLargestNewMethod {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,7,8,8,9};
		
		int largest=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				largest=arr[i];
			}
			
		}
		int seclar = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=largest && arr[i]>seclar) {
				seclar=arr[i];
			}
		}
		System.out.println("second largest = "+seclar);
	}

}
