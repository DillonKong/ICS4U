package DMOJ;

import java.util.Scanner;

public class DMOPC {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int width = scan.nextInt();
		int length = scan.nextInt();
		int tile = scan.nextInt();
		int wNum = 0, lNum = 0, tNum = 0;
		
		if (width > tile && length > tile)
		{
			wNum = width / tile;
			length = length - tile;
			lNum = length / tile;
			if (wNum == 0)
			{
				tNum = lNum;
			}
			else if (lNum == 0)
			{
				tNum = wNum; 
			}
			else 
			{
				tNum = lNum * wNum;
			}
			
		}
		System.out.println(tNum);
	}

}
