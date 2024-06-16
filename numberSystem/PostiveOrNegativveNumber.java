package numberSystem;

import java.util.Scanner;

public class PostiveOrNegativveNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>=0)
			System.out.println("the user enter number is Postive number");
		else
			System.out.println("the User enter number is Negative number");
	}

}
