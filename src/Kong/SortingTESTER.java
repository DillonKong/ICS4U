package Kong;

public class SortingTESTER {

	public static void main(String[] args) {
		int  [] a = {9,5,1,3,4,7,8,2};
		double [] b = {9.0,5.0,4.0,7.0,8.0,2.0};
		String [] c = {"f","b","a","t","s","g","e","n"};
		/*
		System.out.println("selection sorting int");
		
		for (int i = 0;  i < a.length; i ++)
		{
			Sorting.selectionSorting(a);
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		
		System.out.println("selection sorting double");
		
		for (int i = 0;  i < b.length; i ++)
		{
			Sorting.selectionSorting(b);
			System.out.print(b[i] + " ");
		}
		System.out.println("");
		
		System.out.println("Incersion sorting int");
	
		for (int i = 0;  i < a.length; i ++)
		{
				Sorting.insertionSorting(a);
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		
		System.out.println("Incertion sorting double");
		
		for (int i = 0;  i < b.length; i ++)
		{
			Sorting.insertionSorting(b);
			System.out.print(b[i] + " ");
		}
		System.out.println("");
	
		System.out.println("Bubble sorting int");
		
		for (int i = 0;  i < a.length; i ++)
		{
			Sorting.bubbleSorting(a);
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		*/
		System.out.println("Bubble sorting double");
		
		for (int i = 0;  i < b.length; i ++)
		{
			Sorting.bubbleSorting(b);
			System.out.print(b[i] + " ");
		}
		System.out.println("");
		
		
	}
}