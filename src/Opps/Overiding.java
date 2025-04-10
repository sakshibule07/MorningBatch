package Opps;

class circle{
	public void shape() {
		System.out.println("I am circle");
	}
}
class square extends circle{
	public void shape() {
		super.shape();
		System.out.println("I am square");
	}
}

public class Overiding {
	public static void main(String[]args) {
		
		square obj = new square();
		obj.shape();
	}

}
