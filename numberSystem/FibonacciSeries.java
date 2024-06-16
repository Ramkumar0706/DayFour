package numberSystem;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		isFibonacciNumber(n);
	}

	private static void isFibonacciNumber(int i) {
		int n=0;
		int m=1;
		int a=1;
		while(a<=i) {
			if(a==1) {
				System.out.println(0);
			}
			if(a==2)
				System.out.println(1);
			
			
			int sum=n+m;
			System.out.println(sum);
			n=m;
			m=sum;
			a++;
		}
		
	}

}
