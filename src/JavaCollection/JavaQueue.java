package JavaCollection;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

	public static void main(String[] args) {
		
		Queue<String> qs=new LinkedList<>();
		qs.offer("rakesh");
		qs.offer("Vicky");
		qs.offer("yash");
		qs.add("vikram");
		qs.offer("Apporav");
		
		System.out.println(qs);
		
		System.out.println("isEmpty: "+ qs.isEmpty());
		
		System.out.println("peek in queue: "+ qs.peek());

		System.out.println("pooling in queue: "+ qs.poll());
		
		
		while(qs.peek()!=null){
			System.out.println("isEmpty: "+ qs.peek());
			qs.remove();
			System.out.println(qs);
			
			
		}

	}

}
