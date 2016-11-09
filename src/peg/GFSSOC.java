package peg;

import java.util.Scanner;

public class GFSSOC {
	// Flying Plushies
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int t = scan.nextInt();
		int counters = 0;
		
		for (int i = 0; i < t; i ++)
		{
			int x = scan.nextInt();
			
			if (x >= height)
			{
				counters++;
			}
		}
	}

} 
