package JavaCollection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTreeSet {

	public static void main(String[] args) {

		SortedSet <String> s1=new TreeSet<>();
		s1.add("London");
		s1.add("Western");
		s1.add("Delhi");
		s1.add("India");
		s1.add("Love");
		
		// first element after sorting of list.
		System.out.println(s1.first());
		
		// last element after sorting of element.
		System.out.println(s1.last());
		
		// element b/w delhi and love, starting from Delhi to Love.
		SortedSet<String> s2=s1.subSet("Delhi","Love");
		System.out.println(s2);
		
		
		// element after Rakesh, all are after sorting.
		SortedSet<String> s3=s1.tailSet("Rakesh");
		System.out.println(s3);
		
	}

}
