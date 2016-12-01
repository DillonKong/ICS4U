package DMOJ;

import java.util.Scanner;
// Boolean
// DONE
public class BooleanDONE {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		String x = scan.nextLine();
		String [] stringArray = x.split(" "); 
		int counter = 0;// pos = true, neg = false
		
		if (stringArray[stringArray.length - 1].equals("True"))
		{
			counter = 1;
		}
		else if (stringArray[stringArray.length - 1].equals("False"))
		{
			counter = -1;
		}
		
		for (int i = 0; i < stringArray.length -1; i ++)
		{
			if (stringArray[i].equals("not"))
			{
				counter = counter * -1;
			}
		}
		
		if (counter == 1)
		{
			System.out.println("True");
		}
		else if (counter == -1)
		{
			System.out.println("False");
		}
	}
}
