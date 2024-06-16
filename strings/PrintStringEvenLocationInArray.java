package strings;

import java.util.Scanner;

public class PrintStringEvenLocationInArray {
	public static void main(String[] args) {
		String[] s= {"ram","dinesh","shankar","gokul"};
		for (int i = 0; i < s.length; i++) {
			if(i%2==0)
				System.out.println(s[i]);
		}
	}

}
