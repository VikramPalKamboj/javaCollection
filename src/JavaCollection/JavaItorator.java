package JavaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class JavaItorator {

	public static void main(String[] args) {

		List<String> ls=new ArrayList<>();
		ls.add("Vikram");
		ls.add("Rakesh");
		ls.add("Vicky");
		ls.add("rocky");
		ls.add("Tialk");
		ls.add("Parmeshwari");
		
		System.out.println(ls);
		
	    ListIterator<String> iterator = ls.listIterator();
	   
	    // straight indexing and element interation.
	    while(iterator.hasNext()){
	    	
	    	int index=iterator.nextIndex();
	    	String element = iterator.next();
	    	
	    	System.out.println("index"+index+"element"+element);
	    }
	    
	    // backward indexing and element iteration.
	    while(iterator.hasPrevious()){
	    	
	    	int index=iterator.previousIndex();
	    	String element = iterator.previous();
	    	
	    	System.out.println("index"+index+"element"+element);
	    }

	}

}
