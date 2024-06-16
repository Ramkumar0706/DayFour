package strings;

import java.util.Scanner;

public class IncrementTheCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String ");
		String st=sc.next();
	String string = caesarCipher(st);
	System.out.println(string);
		
	}
	
	

    public static String caesarCipher(String s) {
    // Write your code here
    	int k=1;
    char[] st=s.toCharArray();
    String re="";
    for (int i=0;i<st.length;i++){
        if(st[i]>='A'&&st[i]<='Z'){
            
            st[i]=(char)(st[i]+k);
            if(st[i]>'Z'){
                while(st[i]>'Z'){
                st[i]=(char)(st[i]-26);
                        }            }
        }
        else if(st[i]>='a'&&st[i]<='z'){
            st[i]=(char)(st[i]+k);
            if(st[i]>'z'){
                while(st[i]>'z'){
                st[i]=(char)(st[i]-26);
                }
            }
        }
        re=re+st[i];
        
    }
return re;
    }

}
