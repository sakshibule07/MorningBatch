package Exception;

public class Exampleexception {
 public void addition(int a,int b) {
	 try {
		 System.out.println(a/b);
	 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
 }
 public static void main(String[]args) {
	 Exampleexception obj=new Exampleexception();
	 obj.addition(20, 0);
 }
}
