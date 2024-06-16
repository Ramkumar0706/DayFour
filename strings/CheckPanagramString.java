package strings;

import java.util.Scanner;

public class CheckPanagramString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String st=sc.nextLine();
		boolean br=isPanagram(st);
		if(br)
			System.out.println("the String is Panagram");
		else
			System.out.println("the String is not Panagram");
	}

	private static boolean isPanagram(String st) {
		int[] c=new int[26];
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch<='Z'&&ch>='A')
				c[ch-65]++;
			else if(ch<='z'&&ch>='a')
				c[ch-97]++;
		}
		int n=0;
		while(n<c.length) {
			if(c[n]==0) {
				return false;
			}
			n++;
		}
		
		return true;
	}

}
