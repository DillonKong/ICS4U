package Kong;

import java.util.Scanner;
/* Dillon Kong
 * NumDigits 
 * (Exercise 4) Counts the number digits from the number inputed by the user
 * 13/9/16
 */
public class NumDigits {
	public static int tally = 0;//Counter to count the number of digits in the input
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);//Scanner for user input
		int number = scan.nextInt();
		
		System.out.println(NumDigit(number));//Prints what the method returns
	}
	/**
	 * Figures out how many digits in the number inputed
	 * @param x
	 * @return
	 */
	public static int NumDigit(int x)
	{
		if (x == 0)
		{
			return 1;//0 has one digit
		}
		else // For any other number besides 0
		{
		 tally ++; //Counts the number of digits in the number
		 NumDigit(x/10); //Breaks down the number by 10
		}
		return tally; // Return the to main method
	}

}
