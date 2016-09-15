package Kong;

import java.util.Scanner;

public class starRecursion {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);  
		int num = scan.nextInt();

		starString(num);
	}

	public static void starString (int x)
	{
		if (x == 0)
			System.out.println("*");
		else
		{
			starString (x-1);

			for (int i = 0; i < Math.pow(2 , x); i ++)
			{
				System.out.print("*");
			}
			System.out.println(""); 
		}
	}
}