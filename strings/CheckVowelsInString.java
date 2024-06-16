package strings;

import java.util.Scanner;

public class CheckVowelsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.next();
		int c=0;
		for (int i = 0; i < st.length(); i++) {
			char ch=st.charAt(i);
			if(ch==97||ch=='e'||ch=='i'||ch=='o'||ch=='u'
					||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				c++;
			}
			
		}
		System.out.println(c +" vowels present in the String");
	}

}
