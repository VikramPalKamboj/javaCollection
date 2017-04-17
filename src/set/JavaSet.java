package set;

import java.util.HashSet;
import java.util.Set;

public class JavaSet {

	public static void main(String[] args) {
		
		Set<String> s1= new HashSet<>();

		s1.add("vikram");
		s1.add("Rakesh");
		s1.add("Vicky");
		s1.add("western");
		
		Set<String> s2=new HashSet<>();
		s2.add("vikram");
		s2.add("Vicky");
		s2.add("Rakesh");
		
		System.out.println(s2+""+s1);
		
		
		
	}

}
