package Kong;

public class Searches {

	public static void main(String[] args)
	{

	}
	public static int binarySearch (int [] a, int target)
	{
		return binarySearch(a, target, 0, a.length - 1);
	}
	public static int binarySearch (double [] a, double target)
	{
		return binarySearch(a, target, 0, a.length - 1);
	}
	public static int binarySearch (String [] a, String target)
	{
		return binarySearch(a, target, 0, a.length - 1);
	}
	
	
	public static int binarySearch (int []a, int target, int startIndex, int endIndex)
	{
		int middleIndex = (startIndex + endIndex) / 2;

		if (startIndex > endIndex)
		{
			return -1;
		}

		if (target == a[middleIndex])
		{
			return middleIndex;
		}
		else if (a[middleIndex] > target)
		{
			return binarySearch(a, target, startIndex, middleIndex- 1);
		}
		else if (a[middleIndex] < target)
		{
			return binarySearch(a, target, middleIndex + 1, endIndex);
		}
		return -1;
	}

	public static int binarySearch(double []a, double target, int startIndex, int endIndex) 
	{
		int middleIndex = (startIndex + endIndex) / 2;

		if (startIndex > endIndex)
		{
			return -1;
		}
		if (target == a[middleIndex])
		{
			return middleIndex;
		}
		else if (a[middleIndex] > target)
		{
			return binarySearch(a, target, startIndex, middleIndex- 1);
		}
		else if (a[middleIndex] < target)
		{
			return binarySearch(a, target, middleIndex + 1, endIndex);
		}
		return -1;
	}

	public static int binarySearch(String []a, String target, int startIndex, int endIndex) 
	{
		int middleIndex = (startIndex + endIndex) / 2;

		if (startIndex > endIndex)
		{
			return -1;
		}
		if (target.equals(a[ middleIndex]))
		{
			return middleIndex;
		}
		else if (target.compareTo(a[middleIndex]) > 0)
		{
			return binarySearch(a, target, middleIndex + 1, endIndex);
		}
		else if (target.compareTo(a[middleIndex]) < 0)
		{
			return binarySearch(a, target, startIndex, middleIndex - 1);
		}
		return -1;
	}

	public static int linearSearch (int []a , int target)
	{
		for (int i = 0; i < a.length - 1; i ++)	
		{
			if (a [i] == target)
			{
				return i;
			}
		}
		return -1;
	}

	public static int linearSearch (double []a , double target)
	{
		for (int i = 0; i < a.length - 1; i ++)	
		{
			if (a [i] ==  target)
			{
				return i;
			}
		}
		return -1;
	}
	public static int linearSearch (String [] a, String target )
	{
		for (int i = 0; i < a.length - 1; i ++)	
		{
			if (a [i].equals(target))
			{
				return i;
			}
		}
		return -1;
	}
}