package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class JavaSortedSet {

	public static void main(String[] args) {
		
		SortedSet<String> s1=new TreeSet<>();
		s1.add("Vikram");
		s1.add("Rakesh");
		s1.add("World");
		s1.add("tilak");
		s1.add("parmeshWari");
		s1.add("World");
		
		System.out.println(s1);

	}

}
