package StringHandling;

public class TimeCal {

	public static void main(String[] args) {
	
		long start,end;
		
		start = System.nanoTime();
		String str = "Welcome To ";
		for(int i=1; i<=1000; i++) {
			str+= "Logipool";
			
		}
		end = System.nanoTime();
		System.out.println((end-start));
		

		start = System.nanoTime();
		String str = "Welcome To ";
		for(int i=1; i<=1000; i++) {
			str+= "Logipool";
			
		}
		end = System.nanoTime();
		System.out.println((end-start));
	}

}
