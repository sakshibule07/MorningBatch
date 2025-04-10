//package Pratice;
//import java.io.FileReader;
//import java.io.IOException;
//
//
//public class FilereadEx {
//
//	public static void main(String[] args) throws IOException {
//		
//		FileReader myfile = new FileReader("C://File Handling Java/File1.txt") ;       //File Reader is predefined
//		int ch; 
//		
//		while((ch = myfile.read())!= -1 )						//myfile.read reads one character at a time|| ch stores the ascii value|| if the ascii value is not equal to -1 then enter the loop
//		{
//		System.out.print((char)ch);								//char will convert the ch from ascii value to character 
//		}
//		myfile.close();
//		System.out.println("read successfully");
//		
//
//	}
//
//}



//READ THE DATA OF FILE BY TAKING THE FILE NAME FROM USER

//package Pratice;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
//
//
//public class FilereadEx {
//
//	public static void main(String[] args) throws IOException {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the file name you want to read:");
//		String filename = sc.next();
//		
//		FileReader myfile = new FileReader("C://File Handling Java/"+filename+".txt");
//		int ch; 
//		
//		while((ch = myfile.read())!= -1) 
//		{
//			System.out.print((char)ch);
//		
//		}
//		myfile.close();
//		System.out.println();
//		System.out.println("Read the data of file " + filename +" successfully");
//	}
//	}