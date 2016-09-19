package Kong;

import java.util.Scanner;
/*Dillon Kong
 * PalindromeConfrim
 * User inputs two strings and programs compares them to check if they're palindromes of each other. Prints TRUE or FALSE depending of the answer.
 * 15/9/16
 */
public class PalindromeConfirm {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		String one = scan.nextLine(), two = scan.nextLine();
		String wordBackwards = isReverse(one);
		
		if (wordBackwards.equalsIgnoreCase(two))//Compares the two strings
			System.out.println("True");
		else
			System.out.println("False");
		
	}
	/** 
	 * Reverse the first word so it can be compared to the second.
	 * @param x
	 * @return
	 */
	public static String isReverse (String x) 
	{
		char backwards = x.charAt(x.length()-1);
        if(x.length() == 1) 
        	return Character.toString(backwards);   

        return backwards + isReverse(x.substring(0,x.length()-1));
	}

}
