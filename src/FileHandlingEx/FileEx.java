package FileHandlingEx;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[]args) throws IOException {
    	
    	File f1= new File("C://FileHandling/Sakshi.txt");
    	
    	if(f1.exists()) {
    		System.out.println("file exists");
    	}
    	else{
    		f1.createNewFile();
    		System.out.println("file created");
    	}
    	System.out.println(f1.canRead());
    	System.out.println(f1.canWrite());
    	System.out.println(f1.getAbsolutePath());
    	System.out.println(f1.delete());
    	
    	
    }
}
