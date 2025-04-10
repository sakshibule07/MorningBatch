package Pratice;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class BufferEx {

	public static void main(String[] args)throws IOException {
		
		BufferedWriter myfile = new BufferedWriter(new FileWriter("C://File Handling Java/File1.txt"));
		
		myfile.write("hello its buffer");
		myfile.close();
		
		
		System.out.println("done");

	}

}
