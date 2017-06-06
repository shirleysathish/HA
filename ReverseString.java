package xx.yy.zz.util;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String inputString=in.nextLine();
        int len = inputString.length();
        if (len < 1) {
        	System.out.println("Please enter a valid input\n");
        } else if(len == 1) {
        	System.out.println("Reversed String = " + inputString);
        
        } else {
        
        	String reversed = "";               
        	for(int i=(len-1);i>=0;i--){
        		reversed+=inputString.charAt(i);
        	}

        	System.out.println(reversed);
        }
	}

}
