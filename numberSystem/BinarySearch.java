package numberSystem;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to serach in the array");
		int n=sc.nextInt();
		int[] arr= {78,24,98,12,2,67,3,5};
		int re=isBinarySearch(arr,n);
		if(re==-1)
			System.out.println("the user enter number is not present in the array");
		else
			System.out.println(re);
	}

	private static int isBinarySearch(int[] arr,int element) {
		int l=0;
		int h=arr.length-1;
		while(true) {
			if(l>h)
				return -1;
			 
			int m=l+(h-l)/2;
			
			if (arr[m] == element) {
                return m;
            }
            
            // If target greater, ignore left half
            if (arr[m] < element) {
                l = m + 1;
            }
            // If target smaller, ignore right half
            else {
                h = m - 1;
            }
			
		}
		
	}

}
