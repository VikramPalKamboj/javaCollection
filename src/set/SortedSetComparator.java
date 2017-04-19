package set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetComparator {

	public static void main(String[] args) {
		
	    // Sort the names based on their length, placing null first

		SortedSet<String> s3=new TreeSet<String>(Comparator.nullsFirst(Comparator.comparing(String::length)));
		
		s3.add("Vikram");
		s3.add("Western");
		s3.add("university");
		s3.add("ECEECECECECECECE");
		s3.add(null);
		
		System.out.println(s3);
		
	   s3.forEach(System.out::println);
	}

}
