package Collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(4);
		list.add(39);
		list.add(3);
		list.add(33);
		
		System.out.println(list);
		
		TreeSet <Integer> set = new TreeSet<Integer>(list);
		
		set.add(10);
		set.add(77);
		set.add(1);
		
		System.out.println(set);
		

	}

}
