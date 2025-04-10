package Array;

public class MaximunNo {
	

	public static void main(String[] args) 
	{
		int arr[]= {1,2,56,7,899};
		int max = arr[0];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
