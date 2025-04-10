package Opps;


interface OperationsInterface {
	 void add(int a,int b);
	 double pi = 3.14;
	 
	  default void hello() {
		 System.out.println("hello all");
	 }
	 
}

public class TestoperationInterface implements OperationsInterface{
		@Override
		public void add(int a, int b) {
			System.out.println(a+b);
			System.out.println(pi);
		}
		public static void main(String[]args) {
			
			TestoperationInterface obj = new TestoperationInterface();
			obj.add(1,3);
			obj.hello();
		}

	}



