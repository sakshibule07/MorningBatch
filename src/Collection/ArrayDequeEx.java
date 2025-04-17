package Collection;

import java.util.ArrayDeque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> list = new ArrayDeque <Integer> ();
		
		list.offer(10);
		list.offerLast(78);
		list.offerFirst(88);
		
		//System.out.print(list);
		System.out.println();
		System.out.print(list.peek());
		System.out.println();
		System.out.println(list);
		System.out.println(list.pollLast());
		System.out.println(list);

	}

}
