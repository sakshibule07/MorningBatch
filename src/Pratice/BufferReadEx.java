package Pratice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReadEx {

	public static void main(String[] args) throws IOException{
		
		BufferedReader myfile = new BufferedReader (new FileReader("C://File Handling Java/File1.txt"));
		String line;
		while((line = myfile.readLine())!= null) {
			System.out.println(line);
			
		}
		myfile.close();

	}

}
