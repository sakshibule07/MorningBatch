package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeveloperTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Developer dev = new Developer(111,"sakshi","java developer",1800);
		
		FileOutputStream fos = new FileOutputStream("C://File Handling Java/menu.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		os.writeObject(dev);
		os.close();
		System.out.println("Object saved");
		
		FileInputStream fis = new FileInputStream("C://File Handling Java/menu.txt");
		ObjectInputStream is = new ObjectInputStream(fis);
		
		
		System.out.println(is.readObject());
		
		
		
		
		

	}

}
