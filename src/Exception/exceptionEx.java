package Exception;

public class exceptionEx {

	public static void main(String[]args) 
	{
		System.out.println("hello");
		
		try{
			System.out.println(10/0);				//code which will throw error
		}
		catch(Exception e){							//code which will handle error
			e.printStackTrace();					//predefined function
			
			
		
			System.out.println(e);
			System.out.println("due to zero");       //custom message
		}
		System.out.println("bye");
	}
}
