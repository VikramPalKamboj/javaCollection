package JavaCollection;

import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {

	public static void main(String[] args) {

		List<String> ls=new ArrayList<>();
	
		ls.add("Java");
		ls.add("Orcale");
		ls.add("CSS");
		ls.add("Angular2");
		ls.add("JavaScript");
		
		System.out.println(ls);
		
		for(int i=0;i<ls.size();i++){
			
			String element = ls.get(i);
			
			System.out.println("index"+ +i+ " Element"+ element);
			
		}
		
		System.out.println(ls.subList(1, 3));
		
		ls.remove("CSS");
		
		System.out.println(ls);
		
		
	}

}
