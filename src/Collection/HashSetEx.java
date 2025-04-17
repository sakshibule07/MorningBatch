package Collection;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer>list = new HashSet <Integer>();               //hashset stores unique value and allow null,doesnot allow duplicate values
		
		list.add(88);
		list.add(89);
		list.add(null);
		list.add(78);
		
		System.out.println(list);
	}

}
