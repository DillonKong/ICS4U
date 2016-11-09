package Kong;

public class TESTER {

	public static void main(String[] args) {
		int [] ints = {1,2,3,5,8,9,11,13,14,19,20,25};
		double [] doubles = {1.0,2.0,3.0,5.0,8.0,9.0,11.0,13.0,14.0,19.0,20.0,25.0};
		String [] strings = {"a","c","d","g","h","i","k","l","m","p","r","s","z"};
		
		//Test
		System.out.println("Linear ints. Target: 19. Index: 9");
		System.out.println(Searches.linearSearch(ints, 19));
		
		System.out.println("Linear doubles. Target: 11.0. Index: 6");
		System.out.println(Searches.linearSearch(doubles, 11.0));
		
		System.out.println("Linear strings. Target: d. Index: 2");
		System.out.println(Searches.linearSearch(strings, "d"));
		
		
		System.out.println("Binary ints. Target: 19. Index: 9");
		System.out.println(Searches.binarySearch(ints, 19));
		
		System.out.println("Binary doubles. Target: 11.0. Index: 6");
		System.out.println(Searches.binarySearch(doubles, 11.0));
		
		System.out.println("Binary strings. Target: d. Index: 2");
		System.out.println(Searches.binarySearch(strings, "d"));
	}
}
