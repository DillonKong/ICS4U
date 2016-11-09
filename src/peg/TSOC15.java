package peg;

import java.util.Scanner;
// Molecular or Non-Molecular?

public class TSOC15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		String nonMetals [] = {"Cl" , "Br", "Xe", "Kr", "Si", "As", "Rn", "Ne", "He", "H", "C", "N", "O", "F", "P", "S", "I"};

		for(int i = 0; i < t; i ++)
		{
			String element = scan.nextLine();
			String arrayElement []= element.split(" "); 


			for (int j = 0; j <arrayElement.length; j ++)
			{
				for (int k = 0; k < nonMetals.length; k ++)
				{
					if (arrayElement[j].equals(nonMetals[k]))
					{
						System.out.println("Molecular!");
					}
					else 
					{
						System.out.println("Not molecular!");
						break;
					}

				}

			}
		}
	}

}

