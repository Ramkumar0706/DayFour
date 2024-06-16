package strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String st=sc.next();
		String s="";
		for(int i=st.length()-1;i>=0;i--) {
			s=s+st.charAt(i);
		}
		System.out.println(s);
	}

}
