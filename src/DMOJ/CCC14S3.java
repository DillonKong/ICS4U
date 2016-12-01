package DMOJ;
import java.util.Scanner;
import java.util.Stack;

public class CCC14S3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();


		for (int i = 0; i < t; i ++)
		{
			int n = scan.nextInt();
			int c = 1;

			Stack <Integer> mountain = new Stack<Integer>();	
			Stack <Integer>branch = new Stack<Integer>();

			for (int j = 0; j < n; j ++)
			{
				mountain.add(scan.nextInt());			
			}

			while (c < n)
			{
				if (!branch.empty())
				{
					if (branch.peek() == c)
					{
						branch.pop();
						c++;
					}
					else if (mountain.peek() == c)
					{
						mountain.pop();
						c++;
					}
					else 
					{
						branch.push(mountain.pop());
					}
				}
				else 
				{
					if (mountain.peek() == c)
					{
						mountain.pop();
						c++;
					}
					else 
					{
						branch.push(mountain.pop());
					}
					
				}
				if (mountain.empty() && branch.peek() != c)
				{
					System.out.println("N");
					break;
				}
				if (c == n)
				{
					System.out.println("Y");
					break;
				}
			}
		}
	}
}
