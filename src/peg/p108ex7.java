package peg;

import java.util.Scanner;

public class p108ex7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		int [] x = new int [t];
		int [] cost = new int [t];

		for (int i = 0; i < t; i ++)
		{
			x [i] = scan.nextInt();
			
			if (x[i]>= 0 && x [i] <= 30)
			{
				cost [i] = 38;
			}
			else if ( x[i] <= 50)
			{
				cost [i] = 55;
			}
			else if  (x[i] <=100)
			{
				cost [i] = 73;
			}
			else if (x[i] > 100)
			{
				int a = (x [i] - 101) / 50;
				if(a < 1)
				{
					cost[i] = cost[i] + (a * 24); 
				}
			}
			System.out.println(cost[i]);
		}
		

	}

}
