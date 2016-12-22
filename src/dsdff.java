import java.util.Scanner;

public class dsdff {

	public static void CCC14J2 (  )
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		String x [] = null;
		x[0] = scan.nextLine();
		int vote = 0;

		for (int i = 0; i < t; i ++)
		{
			if (x[0].charAt(i) == ('a'))
			{
				vote ++;
			}
			else 
			{
				vote --;
			}
		}
		if (vote > 0)
		{
			System.out.println("A");
		}
		else if (vote < 0)
		{
			System.out.println("B");
		}
		else 
		{
			System.out.println("Tie");
		}
	}
}