package FileHandlingEx;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class WriteFile {
	public static void main(String[]args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter text");
		String str = sc.nextLine();
		
		FileWriter f1 = new FileWriter("C://FileHandling/Sakshi.txt");
		
		f1.write(str);
		f1.close();
		
		System.out.println("wrote");
		
		
		
		
	}
}
