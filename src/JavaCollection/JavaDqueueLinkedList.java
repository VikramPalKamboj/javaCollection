package JavaCollection;

import java.util.Deque;
import java.util.LinkedList;

public class JavaDqueueLinkedList {

	public static void main(String[] args) {

		Deque<String> dq=new LinkedList<>();
		dq.addLast("Python");
		dq.offerLast("Java");
		dq.offerLast("Angular2");
		dq.offerLast("MongoDb");
		dq.addLast("JavaScript");
		dq.addLast("Jquery");
		
		System.out.println(dq);
		
		while(dq.peekFirst()!=null){
			System.out.println("Head Element"+dq.peekFirst());
			
			dq.removeFirst();
			System.out.println("Dqeue"+dq);
		}
		
		System.out.println(dq.isEmpty());
		
		System.out.println(dq.peekFirst());
		
		System.out.println(dq.peekLast());

		System.out.println(dq.getFirst());
		
		System.out.println(dq.getLast());
	}

}
