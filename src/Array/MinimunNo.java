package Array;

public class MinimunNo {
	public static void main(String[]args)
			{
		       int arr[]= {10,23,4,8,5,5};
		       int min = arr[0];
		       
		       for(int i=0 ; i<arr.length; i++)
		       {
		    	  if(arr[i] < min)
		    	  {
		    		  min = arr[i];
		    	  }
		       }
		       System.out.println(min);
		       
		       
			}
	
}