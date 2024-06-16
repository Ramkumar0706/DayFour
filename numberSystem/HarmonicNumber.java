package numberSystem;

import java.util.Scanner;

public class HarmonicNumber {  
    public static double recursiveHarmonicNumber(int n) {  
        if (n == 1) {  
            return 1.0;  
        } else {  
            return 1.0 / n + recursiveHarmonicNumber(n - 1);  
        }  
    }  
    public static void main(String[] args) {  
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
        double result = recursiveHarmonicNumber(n);  
        System.out.println("The " + n + "th harmonic number is: " + result);  
    }  
}  