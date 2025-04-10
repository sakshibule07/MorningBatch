package Opps;

abstract class man{
	abstract void work();
	
	public void working() {
		System.out.println("hello");
	}
	
}
public class praticeoops extends man{
	
	@Override
	public void work(){
		System.out.println("working man");
	}
	public static void main(String[]args)
	{
		praticeoops obj = new praticeoops();
		obj.work();
		obj.working();
		
	}
}