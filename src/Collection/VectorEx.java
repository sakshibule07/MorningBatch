package Collection;
import java.util.LinkedList;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		long start = System.nanoTime();
		
		LinkedList <Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.addFirst(20);
		list.add(8);
		list.add(65);
		list.add(3);
		
		long end = System.nanoTime();
		System.out.println("Array list takes "+ (end-start) +" nanotime");
		
		
		start = System.nanoTime();
		Vector <Integer>list1 = new Vector<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(8);
		list1.add(65);
		list1.add(3);
		
		end = System.nanoTime();
		System.out.println("Vector takes " +(end-start)+" nanoTime");
		
		System.out.println(list);
		System.out.println(list1);
		

	}

}
