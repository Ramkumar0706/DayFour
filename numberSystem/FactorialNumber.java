package numberSystem;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int re=isFactorial(n);
		System.out.println("the factorial of "+n+"  is " +re);
	}

	private static int isFactorial(int n) {
		int sum=1;
		while(n>0) {
			sum=sum*n;
			n--;
		}
		return sum;
	}

}
