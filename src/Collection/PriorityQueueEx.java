package Collection;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue <Integer> list = new PriorityQueue <Integer>();
		
		list.offer(0);
		list.add(10);
		//list.add(null);
		list.add(3);
		list.add(68);
		
		System.out.println(list);
	}

}
