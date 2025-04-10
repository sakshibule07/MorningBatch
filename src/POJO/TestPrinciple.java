package POJO;

public class TestPrinciple {
   public static void main(String[]args) {
	   Teacher obj = new Teacher(101,"sakshi","software developer",25000);
	   Principle obj1 = new Principle(12,"Bule","GPAN",obj);
	   System.out.println(obj1);
   }
}
