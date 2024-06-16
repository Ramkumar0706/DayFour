package numberSystem;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {78,24,98,12,2,67,3,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to search");
		int n=sc.nextInt();
		int re=isLinearSerach(arr,n);
		if(re==-1)
			System.out.println("user enter to search number is not present in the array");
		else
		System.out.println("the element present in the index is "+re);
	}
	

	private static int isLinearSerach(int[] arr,int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element)
				return i;
		}
		return -1;
	}

}
