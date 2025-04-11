package StringHandling;

public class StringBufferEx {

	public static void main(String[] args) {
		
		StringBuffer sbf = new StringBuffer();
		sbf.append("Hello how are you guys");  //(oldsize *2 )+2
		sbf.append("hello how are");         
		System.out.println(sbf.capacity());
		
		StringBuilder sbf1 = new StringBuilder();   //more faster
		sbf1.append("Hello how are you guys");  //(oldsize *2 )+2
		sbf1.append("hello how are");         
		System.out.println(sbf1.capacity());

	}

}
