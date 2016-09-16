package Kong;
//******************************************************************
//  PalidromeTester.java              Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of nested while loops.
//******************************************************************

import java.util.Scanner;

public class PalindromeTester
{
  //----------------------------------------------------------------
  //  Tests strings to see if they are palindromes.
  //----------------------------------------------------------------
  public static void main(String[] args)
  {
    String str, another = "y";
    int left, right;
    Scanner scan = new Scanner(System.in);
    
    while (another.equalsIgnoreCase("y"))
    {
    	System.out.println("Enter a potential palidrome:");
    	str = scan.nextLine();
    	
    	left = 0;
    	right = str.length() -1;
    	
    	while(str.charAt(left) == str.charAt(right) && left < right)
    	{
    		left++;
    		right--;
    	}
    	
    	System.out.println();
    	
    	if(left<right)
    		System.out.println("That string is NOT a palidrome.");
    	else
    		System.out.println("That string IS a palindrome");
    	
    	System.out.println();
    	System.out.print("Test another palidrome (y/n)? " );
    	another = scan.nextLine();
    }
    
  }
  
}