package Kong;
import java.util.Scanner;

public class Bananas {
	
	static Boolean another = true;

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		String word = null ;
		char lastLetter;

		while (another == true)
		{
			word = scan.nextLine();

			if (word.charAt(0) == 'A' || word.charAt(0) == 'a')
			{
				lastLetter = 'N';
				System.out.println(monkeyWord(word, lastLetter));

			}
			else if (word.charAt(0) == 'B' || word.charAt(0) == 'b' )
			{
				lastLetter = 'N';
				System.out.println(monkeyWord (word, lastLetter));
			}
			else if (word.length() > 7)
			{
				System.out.println("NO");
			}
			else
			{
				another = false;
				System.out.println("NO");
			}
		}
	}

	public static String monkeyWord (String x, char lastLetter)
	{
		int y = 1;
		String blank = " ";



		if (x.charAt(0) == 'A')
		{
			if (x.charAt(x.length() - 1) == 'A')
			{

				while (y < x.length())
				{
					if (x.charAt(y) == lastLetter)
					{
						y ++;
						monkeyWord (x, x.charAt(y-1));
						System.out.println("Yes");
					}

					else 
					{
						System.out.println("N1O1");
						another = false;
					}
				}
				System.out.println("YES");
			}
			else 
			{
				System.out.println("NO");
				another = false;
			}
		}
		else if (x.charAt(0) == 'B')
		{
			if (x.charAt(x.length() - 1) == 'S' || x.charAt(x.length() - 1) == 'A')
			{
				while (y < x.length()-1)
				{
					if (x.charAt(y) == lastLetter)
					{
						y ++;
						monkeyWord (x, x.charAt(y-1));
						System.out.println("Yes");
					}

					else 
					{
						System.out.println("N1O");
						another = false;
					}
				}
				System.out.println("YES");
			}
			else 
			{
				System.out.println("NO");
				another = false;
			}
		}
		return blank ;
	}

}