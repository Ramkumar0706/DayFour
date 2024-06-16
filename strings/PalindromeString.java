package strings;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.next();
		sc.close();
		boolean br=isPalindrome(st);
		if(br)
			System.out.println("the "+st+" string is plaindrome");
		else
			System.out.println("the String is not Palindrome");
	}

	private static boolean isPalindrome(String st) {
		int l=0;
		int h=st.length()-1;
		while(l<h) {
			if(st.charAt(l)!=st.charAt(h))
				return false;
			l++;
			h--;
		}
		
		
		return true;
	}

}
