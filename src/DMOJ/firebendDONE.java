package DMOJ;
//DONE
//firebender
import java.util.Scanner;

public class firebendDONE {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);

		int t= scan.nextInt();
		int total = 0, x = 0;
		
		for (int i = 0; i < t; i ++)
		{
			x = scan.nextInt();
			if (x < 0)
			{
				 x = x * -1;
				 total = total + x;
			}
			else 
			{
				total = total + x;
			}
		}
		System.out.println(total);

	}

}
