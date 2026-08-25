package core.Array.Task;

public class SecondLargest {

	public static void main(String[] args) {
		int[] arr= {12,43,454,22,54,232,43};
		
		int largest = arr[0];
		int sec_largest=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				sec_largest=largest;
				largest=arr[i];
				
			}
			else if (arr[i]>sec_largest && arr[i]!=largest) {
				sec_largest=arr[i];
			}
			
		}
		System.out.println("Second largest = "+sec_largest);
	}

}
