package strings;

import java.util.Scanner;

public class PrintAsciiValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Char to print the ascii value");
		String string = sc.next();
		char ch=string.charAt(0);
		System.out.println((int)ch);
		
	}

}
