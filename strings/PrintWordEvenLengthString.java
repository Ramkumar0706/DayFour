package strings;

import java.util.Scanner;

public class PrintWordEvenLengthString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word of String");
		String st=sc.nextLine();
		String [] s=st.split("\\s+");
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()%2==0)
				System.out.println(s[i]);
		}
	}

}
