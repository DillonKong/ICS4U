package Kong;

import java.util.Scanner;
/*Dillon Kong
 * HanoiPuzzle
 * takes in number of disks and outputs ever move needed to successfully finish the puzzle
 * 19/9/16
 */
public class HanoiPuzzle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int disk  = scan.nextInt();// takes in number of disc for puzzle
		Solve (disk, "Source", "auxillary","destination"); 
		
	} 
	/**
	 * Method that solves the hanoi puzzle and prints the moves
	 * @param num aka number of disks
	 * @param src Sender	
	 * @param aux Nothing
	 * @param dst Receiver
	 */
	public static void Solve (int num, String src, String aux, String dst)
	{
		if (num != 0)
		{
			Solve(num - 1, src, dst, aux);
			System.out.println("Move from " + src + " to " + dst);
			Solve(num-1, aux, src, dst);
		}	
	}

}

