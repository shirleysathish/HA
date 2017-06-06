package xx.yy.zz.util;

import java.util.Scanner;

public class ReverseStringRecursive {
	
	public static String reverse(String s) {
		   if(s.length() == 0) return "";
		   System.out.println(s);
		   return s.charAt(s.length() - 1) + reverse(s.substring(0,s.length()-1));
	}
	
	public static void main(String[] args) {
		
		System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String inputString=in.nextLine();
        int len = inputString.length();
        if (len < 1) {
        	System.out.println("Please enter a valid input\n");
        	
        }else if(len == 1) {
        	System.out.println("Reversed String = " + inputString);
        
        } else {
        	System.out.println("Reversed String using Recursive: " + reverse(inputString));
        }
	}
}
