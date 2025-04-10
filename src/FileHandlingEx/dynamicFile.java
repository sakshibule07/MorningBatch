package FileHandlingEx;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class dynamicFile {
	public static void main(String[]args) throws IOException {
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter name:");
		String name = sc.next();
		
		File f1 = new File("C://FileHandling/"+name+".txt");
		
		f1.createNewFile();	
		System.out.println("created");
				
				
	}	
		
}
