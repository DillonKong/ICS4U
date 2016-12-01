package Kong;

import java.util.ArrayList;

public class Sorting {

	public static void main(String[] args) {
	}

	public static int[] selectionSorting (int [] a)
	{
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				// Replaces the values if a smaller one is found
				if (a[i] > a[j]) 
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}	
		}
		return a;
	}

	public static double[] selectionSorting (double [] a)
	{
		double temp = 0;

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i; j < a.length; j++) 
			{
				// Replaces the values if a smaller one is found
				if (a[i] > a[j]) 
				{
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}	
		}
		return a;
	}

	public static String [] selectionSorting (String [] a)
	{
		String temp = null;

		for (int i = 0; i < a.length; i ++)
		{
			for (int j = 0; j < a.length; j ++)
			{
				if (a[i].compareTo(a[j]) > 0)
				{
					temp = a [j];
					a [j] = a [i];
					a[i] = temp;
				}
			}
		}
		return a;
	}

	public static ArrayList<Integer> insertionSorting(int [] a)
	{
		ArrayList <Integer> x = new ArrayList<Integer>();
		x.add(a[0]);

		for (int i = 1; i < a.length -1; i ++)
		{
			for (int j = 0; j < x.size()- 1; j ++)
			{
				if (a[i] < x.get(j))
				{
					x.add(0, a[i]);
				}
				else if ((a [i] > x.get(j)))
				{
					x.add(a[i]);
				}
			}
		}
		return x;


	}

	public static ArrayList<Double> insertionSorting(double[] a)
	{
		ArrayList <Double> x = new ArrayList<Double>();
		x.add(a[0]);

		for (int i = 1; i < a.length -1; i ++)
		{
			for (int j = 0; j < x.size()- 1; j ++)
			{
				if (a[i] < x.get(j))
				{
					x.add(0, a[i]);
				}
				else if ((a [i] > x.get(j)))
				{
					x.add(a[i]);
				}
			}
		}
		return x;
	}



	public static int [] bubbleSorting(int [] a)
	{
		int temp = 0;
		for (int i = 0; i < a.length; i ++)
		{
			for (int j = 0; j < a.length - 1; j ++)
			{
				if (a [j] > a [j+1])
				{
					temp = a[j];
					a[j] = a[j +1];
					a[j+1] = temp;
				}		
			}
		}
		return a;
	}

	public static double [] bubbleSorting(double [] a)
	{
		double temp = 0;
		for (int i = 0; i < a.length; i ++)
		{
			for (int j = 0; j < a.length- 1; j ++)
			{
				if (a [j] > a [j+1])
				{
					temp = a[j];
					a[j] = a[j +1];
					a[j+1] = temp;
				}		
			}
		}
		return a;
	}


	public static int [] merge (int i, int j, int k, int leftSide[], int rightSide[], int a[])
	{
		while (leftSide.length < j && rightSide.length < k)
		{
			if (leftSide[j] < rightSide[k])
			{
				a[i] = leftSide[j];
				i ++;
				j ++;	
			}
			else
			{
				a[i] = rightSide[k];
				i++;
				k++;
			}
		}
		return a;
	}

	public static double [] merge (int i, int j, int k, double leftSide[], double rightSide[], double a[])
	{
		while (leftSide.length < j && rightSide.length < k)
		{
			if (leftSide[j] < rightSide[k])
			{
				a[i] = leftSide[j];
				i ++;
				j ++;	
			}
			else
			{
				a[i] = rightSide[k];
				i++;
				k++;
			}
		}
		return a;
	}


	public static int [] mergeSorting (int [] a)
	{
		int i=0,j=0,k=0;
		if (a.length != 1)
		{
			int leftSide [] = {a.length / 2};
			int rightSide [] = {a.length / 2};

			for (int x = 0; x < a.length / 2; x ++)
			{
				leftSide [x] = a [x]; 
			}
			for (int x = a.length / 2; x < a.length; x ++)
			{
				rightSide [x] = a[x];
			}
			leftSide = mergeSorting(leftSide);
			rightSide = mergeSorting(rightSide);
			merge (i,j,k,leftSide, rightSide, a);
		}
		return a;
	}
	public static double [] mergeSorting (double [] a)
	{
		int i=0,j=0,k=0;
		if (a.length != 1)
		{
			double leftSide [] = {a.length / 2};
			double rightSide [] = {a.length / 2};

			for (int x = 0; x < a.length / 2; x ++)
			{
				leftSide [x] = a [x]; 
			}
			for (int x = a.length / 2; x < a.length; x ++)
			{
				rightSide [x] = a[x];
			}
			leftSide = mergeSorting(leftSide);
			rightSide = mergeSorting(rightSide);	
			merge (i,j,k,leftSide, rightSide, a);
		}
		return a;
	}

	public static int [] quickSorting (int [] a)
	{
		int pivot = a.length - 1;
		int counter = 0;
		int temp = 0;
		
		for (int j = 0; j < 0; j ++ )
		{
			 if (a[j] < pivot)
			 {
				 counter ++;
				 temp = a [j];
				 a[j] = a[counter];
				 a[counter] = temp;
			 }
		}
		
	}


}