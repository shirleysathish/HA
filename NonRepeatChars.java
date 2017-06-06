package xx.yy.zz.util;

import java.util.Scanner;

public class NonRepeatChars {

    public static void main(String[] args) {
    	System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String inputString=in.nextLine();
        if (inputString.length() < 1) {
        	System.out.println("Please enter a valid input\n");
        }

      for (char c : inputString.toCharArray()) {
          if (inputString.indexOf(c) == inputString.lastIndexOf(c)) {
              System.out.println("First non repeated characted in String \""
              + inputString + "\" is:" + c);
              break;
          }
      }
    }
}