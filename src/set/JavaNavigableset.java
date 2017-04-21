package set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class JavaNavigableset {

	public static void main(String[] args) {
		
		NavigableSet<Integer> ns=new TreeSet<>();
		ns.add(0);
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		ns.add(6);
		ns.add(7);
		ns.add(8);
		ns.add(9);
		
		
		System.out.println("Normal order"+" "+ns);
		
		NavigableSet<Integer> reverseOrder=ns.descendingSet();
		
		System.out.println(reverseOrder);
		
		
		NavigableSet<Integer> tailSet=ns.tailSet(4,true);
		
		System.out.println(tailSet);
		
		// lower in first four integer 
		System.out.println("lower in first four integers"+ +ns.lower(4));
		
		
		//less than or equal
		System.out.println("less than the specified element"+ +ns.floor(5));
		
		//higher after first four
		System.out.println("higher after first four: "+ +ns.higher(4));
		
		//greater than or equal 
		System.out.println("greater than or equal "+ +ns.ceiling(6));
		
		
		//
		System.out.println("poll first; first element in the list"+ +ns.pollFirst());
		
		System.out.println("poll last; last elemetn in the list "+ +ns.pollLast());
		
		

	}

}
