package Kong;

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		int n = scan.nextInt(), r = scan.nextInt();
		if (r>n)
			System.out.println("Mathamatical anomily. (Impossible)");
		else
		System.out.println(permut (n , r));
	}
	public static int permut (int x, int y)
	{
		return factorial(x)/factorial(y);
	}

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