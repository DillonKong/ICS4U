package Kong;

import java.util.Scanner;
/*Dillon Kong
 * Takes in r and n, finds the permutation for the two and prints the answer
 */
public class Permutations {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		int n = scan.nextInt(), r = scan.nextInt(); // Takes in r and n which are needed for the equation.
		if (r>n)
			System.out.println("Mathamatical anomily. (Impossible)"); // r cannot be greater then n.
		else
		System.out.println(permut (n , r)); // Sends the users n and r to method permut
	}
	/**
	 *solves the permutation by dividing the factorial of x or n divided by y or r
	 * @param x
	 * @param y
	 * @return the answer to the permutation
	 */
	public static int permut (int x, int y)
	{
		return factorial(x)/factorial(y);
	}

	/**
	 * Finds the factorial for each, which are needed to permut the two
	 * @param a
	 * @return
	 */
	public static int factorial (int a) 
	{
		if (a == 0)
		{
			return 1;
		}
		else
		 return a * factorial(a - 1);	
	}
}