package Kong;

import java.util.Scanner;

public class PalidromeConfirm {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		String one = scan.nextLine(), two = scan.nextLine();
		String wordBackwards = isReverse(one);
		
		if (wordBackwards.equalsIgnoreCase(two))
			System.out.println("True");
		else
			System.out.println("False");
		
	}
	public static String isReverse (String x)
	{
		char backwards = x.charAt(x.length()-1);
        if(x.length() == 1) 
        	return Character.toString(backwards);   

        return backwards + isReverse(x.substring(0,x.length()-1));
	}

}
