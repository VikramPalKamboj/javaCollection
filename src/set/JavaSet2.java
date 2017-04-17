package set;

import java.util.HashSet;
import java.util.Set;

public class JavaSet2 {

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
		
		Set<String> s3=new HashSet<>(s1);
		s3.addAll(s2);
		System.out.println(s3);
		
		Set<String> s4=new HashSet<>(s1);
		s4.retainAll(s2);
		System.out.println(s4);
		
		
		
		Set<String> s5=new HashSet<>(s1);
		s5.removeAll(s1);
		System.out.println(s5);
		
		
		
		Set<String> s6=new HashSet<>(s2);
		s6.removeAll(s1);
		System.out.println(s6);
		
		
		
		Set<String> s7=new HashSet<>(s2);
		s7.containsAll(s1);
		System.out.println(s7);
		
		
		//The HashSet does not guarantee the ordering of elements during iteration. 
		//LinkedHashSet keeps the element order as the elements were inserted.
		

	}

}

