package Kong;

import java.util.Scanner;
/*Dillon Kong
 * PalindromeTester2
 * User inputs possible palindrome and program determines whether it is or not.
 * 15/9/16
 */
public class PalindromeTester2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		boolean  again = true;

		while(again == true)// Continues to repeat as long as the user has a another possible palindrome.
		{
			System.out.println("Please input potential palindrome.");

			String reverse = scan.nextLine();// Takes in possible palindrome	
			String another;
			String wordBackwards;
			
			
			wordBackwards = isReverse(reverse);

			if (wordBackwards.equalsIgnoreCase(reverse))// compares the original word and it reversed. Outputs whether it is a possible palindrome
			{
				System.out.println("This word IS a possible palindrome.\n Test another palindrome. y/n?");//asks user if they want to try another possible palindrome
				another = scan.nextLine();
				if (another.equalsIgnoreCase("y"))
				{
					again = true;
				}
				else if (another.equalsIgnoreCase("n"))
					System.exit(0);
			}
			else
			{
				System.out.println("This IS Not a possible palindrome \n Test another palindrome. y/n?");//asks user if they want to try another possible palindrome
				another = scan.nextLine();
				if (another.equalsIgnoreCase("y"))
				{
					again = true;
				}
				else if (another.equalsIgnoreCase("n"))
					System.exit(0);
			}
		}
	}
	/**
	 * reverses the inputed word, so that it can be compared to itself
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
