package DMOJ;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMinimum {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		ArrayList <Integer> x = new ArrayList <Integer>();
		ArrayList <Integer> y = new ArrayList<Integer>();
		int lowest = 0;

		for (int i = 0; i < t; i ++)
		{
			x.add(scan.nextInt());
		}
		while (y.size() != x.size())
		{
			for (int i = 0; i < t -1; i ++)
			{
				if (x.get(i) < x.get(i + 1))
				{
					lowest = x.get(i);
				}
				
			}
			y.add(x.get(lowest));
			x.remove(lowest);
			
		}
		for (int i = 0; i < y.size(); i ++)
		{
			System.out.println(y.get(i));
		}
	}

}
