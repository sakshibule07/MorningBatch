//package Pratice;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FilewriteEx {
//	public static void main(String[]args)throws IOException {
//		
//		FileWriter myfile = new FileWriter("C://File Handling Java/File1.txt");       //FileWriter is predefined
//		
//		myfile.write("Its the first file");						//write is predefined
//		myfile.close();											//Mandatory	//in filewriter the file should be compulsory closed 
//		
//		System.out.println("Message written in File1.txt file");
//		
//		
//	}
//
//}

//********************************TO TAKE FILE NAME FROM USER IN WHOCH YOU WANT TO WRITE
//package Pratice;
//import java.util.Scanner;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class FilewriteEx{
//	public static void main(String[]args)throws IOException {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter file name to write text:");
//		String filename = sc.next();
//		
//		FileWriter myfile = new FileWriter("C://File Handling Java/"+filename+".txt");
//		
//		myfile.write("hello everyone");
//		myfile.close();
//		System.out.println("written successfully");
//	}
//	
//}
