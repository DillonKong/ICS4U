package peg;
import java.util.Scanner;

public class p100ex4DONE {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner scan = new Scanner (System.in);
	    
		String code = scan.nextLine();
		if (code.equals("MG"))
			System.out.println("midget girls");
		else if (code.equals("MB"))
			System.out.println("midget boys");
		else if (code.equals("JG"))
			System.out.println("junior girls");
		else if (code.equals("JB"))
			System.out.println("junior boys");
		else if (code.equals("SG"))
			System.out.println("senior girls");
		else if (code.equals("SB"))
			System.out.println("senior boys");
		else 
			System.out.println("invalid code");
	}

}
