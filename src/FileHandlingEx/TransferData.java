package FileHandlingEx;
//import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TransferData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C://FileHandling/hello.txt");
		
		int i;
		String str ="";
		while((i = fr.read())!=-1) {
			str+=(char)i;
		}
		FileWriter fw = new FileWriter("C://FileHandling/sakshhi2.txt");
		
		fw.write(str);
		fw.close();
		System.out.println("written siuccessfully");
		

	}

}
