package numberSystem;

public class FindSecondLargestNumberInArray {
	public static void main(String[] args) {
		int[] arr= {78,24,98,12,2,67,3,5};
		int re=isSecondLargest(arr);
		System.out.println("the second largest number in the array is "+re );
	}

	private static int isSecondLargest(int[] arr) {
	//	int count=0;
		int re=0;
		for (int i = 0; i < arr.length; i++) {
			int count=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j])
					count++;
			}
			if(count==arr.length-2)
				re= arr[i];
			
		}
		
		return re;
	}

}
