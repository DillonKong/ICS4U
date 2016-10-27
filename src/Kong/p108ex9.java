package Kong;
//PAY
import java.text.DecimalFormat;
import java.util.Scanner;

public class p108ex9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		double total = 0;
		double rate= scan.nextDouble();
		double pay = scan.nextDouble();
		String tax = scan.next();
		String donate = scan.next();

		if (tax.equalsIgnoreCase( "B"))
		{
			total = (rate * pay) * 0.9;
		}
		else if (tax.equalsIgnoreCase("C") )
		{
			total = (rate * pay) * 0.8;
		}
		else if (tax.equalsIgnoreCase("D"))
		{
			total = (rate * pay) * 0.71;
		}
		else if (tax.equalsIgnoreCase( "E"))
		{
			total = (rate * pay) * 0.65;
		}

		if (donate.equalsIgnoreCase("y"))
		{
			total = total - 10;
		}
		
		DecimalFormat round = new DecimalFormat("#.00");
		System.out.println(round.format(total));

	}
}