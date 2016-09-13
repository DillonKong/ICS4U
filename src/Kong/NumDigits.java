package Kong;

import java.util.Scanner;
/*Dillon Kong
 * NumDigits (Exercise 4)
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
	public static int NumDigit(int x)//Figures out how many digits in the number inputted
	{
		if (x == 0)
		{
			return 1;
		}
		else 
		{
		 tally ++;
		 NumDigit(x/10);
		}
		return tally;
	}

}
