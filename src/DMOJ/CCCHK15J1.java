package DMOJ;

import java.util.Scanner;

public class CCCHK15J1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		String p1 = scan.nextLine();
		String p2 = scan.nextLine();
		String p1List []= p1.split(" ");
		String p2List []= p2.split(" ");
		int p1Counter = 0;
		int p2Counter = 0;
		
		System.out.println(p1List);
		for (int i = 0; i < t-1; i++)
		{
			if (p1List[i] == "rock" && p2List[i] == "paper")
			{
				p2Counter ++;
			}
			else if (p1List[i] == "paper" && p2List[i] == "rock")
			{
				p1Counter ++;
			}
			else if (p1List[i] == "scissors" && p2List[i] == "paper")
			{
				p1Counter++;
			}
			else if (p1List[i] == "paper" && p2List[i] == "scissors")
			{
				p2Counter++;
			}
			else if (p1List[i] == "rock" && p2List[i] == "scissors")
			{
				p2Counter ++;
			}
			else if (p1List[i] == "scissors" && p2List[i] == "rock")
			{
				p2Counter++;
			}
		} 	
		System.out.println(p1Counter + " " + p2Counter);
		
		
	}

}
