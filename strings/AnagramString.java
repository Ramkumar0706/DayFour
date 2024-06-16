package strings;

import java.util.Scanner;

public class AnagramString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String st1=sc.next();
		String st2=sc.next();
		sc.close();
		boolean br=isAnagram(st1,st2);
		if(br)
			System.out.println("the String is Anagram");
		else
			System.out.println("the String is not Anagram");
	}

	private static boolean isAnagram(String st1, String st2) {
 
    if(st1.length()!=st2.length())
    	return false;
    int i=0;
    while(i<st1.length()) {
    	if(!st2.contains(st1.charAt(i)+""))
    		return false;
    		i++;
    }
		return true;
	}

}
