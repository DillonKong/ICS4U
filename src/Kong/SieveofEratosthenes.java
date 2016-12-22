package Kong;

import java.util.ArrayList;
import java.util.Scanner;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int m = scan.nextInt(), n = scan.nextInt();
		boolean [] array = new boolean [m];
		int counter = 2;
		ArrayList <Integer> primes = new ArrayList <Integer>();
		
		do 
		{
			for (int i = counter * counter; i < m; i += counter)
			{
				array[i] = true;
			}
			do 
			{
				counter ++;
			}while (array[counter]);

		}while (counter * counter <= m);

		for (int i = n; i <= m; i ++)
		{
			if (array[i] == false)
			{
				primes.add(i);
			}
		}

	}
}
