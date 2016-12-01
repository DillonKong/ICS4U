package DMOJ;

import java.util.Scanner;
//PULSE
//DONE
public class PulseDONE {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int s = scan.nextInt();
		int t = scan.nextInt();
		int x [] = new int [n] ;
		int counter = 0;
		
		for (int i = 0; i < n; i ++)
		{
			x[i] = scan.nextInt();
			x[i] = x[i] * 2;
		}
		for (int i = 0; i < n; i ++)
		{
			if ((x[i]> s || x[i] == s) && (x[i] < t || x[i] == t))
			{
				counter ++;
			}
		}
		System.out.println(counter);
	}
}
