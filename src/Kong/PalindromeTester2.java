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

		while(again == true)
		{
			System.out.println("Please input potential palindrome.");

			String one = scan.nextLine();
			String another;
			String wordBackwards;
				
			/*int space;
			String space1;

			for (int i = 0; i < one.length()- 1; i ++)
			{
				if ((one.charAt(i)) == (' '))
				{
					 space = one.get(i).getText();
					 space1 = space.trim();
				}
			}*/
			
			wordBackwards = isReverse(one);

			if (wordBackwards.equalsIgnoreCase(one))
			{
				System.out.println("This word IS a possible palindrome.\n Test another palindrome. y/n?");
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
				System.out.println("This IS Not a possible palindrome \n Test another palindrome. y/n?");
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
	
	public static String isReverse (String x)
	{
		char backwards = x.charAt(x.length()-1);
		
		if(x.length() == 1) 
			return Character.toString(backwards);   

		return backwards + isReverse(x.substring(0,x.length()-1));
	}

}
