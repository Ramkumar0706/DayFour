package numberSystem;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year to check the Leap year or not");
		int n=sc.nextInt();
		if((n%4==0&&n%100!=0) || (n%400==0) ){
			System.out.println("the user enter year is leap year");
		}
		else
			System.out.println("user enter year is not leap year");
	}

}
