package FileHandlingEx;
import java.io.BufferedReader;
//import java.io.BufferWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br =  new BufferedReader(new FileReader("C://FileHandling/hello.txt"));
		
		System.out.println(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("C://FileHandling/hello.txt"));
		bw.write("sakshu");
		bw.close();
		System.out.println("data written ");
		System.out.println("added welcome");		
	}

}
