//*********************ITS CREATED FILE DIRECTLY

//package Pratice
//import java.io.File;
//import java.io.IOException;
//
//
//public class FilecreateEx {
//	public static void main(String[]args)throws IOException {
//		
//		File myfile = new File("C://File Handling Java/File1.txt");
//		
//		if(myfile.exists()) {
//			System.out.println("file is already present");
//		}
//		else{
//			myfile.createNewFile();
//			System.out.println("file created sucessfully");
//		}
//	}
//
//}




//***************************FILE NAME IS TAKEN FROM USER

//package Pratice;
//import java.util.Scanner;
//import java.io.File;
//import java.io.IOException;
//
//public class FilecreateEx {
//	public static void main(String[]args)throws IOException {
//		Scanner sc = new Scanner(System.in);													//sc is manually taken you can taken any word
//		System.out.println("enter the new file name:");
//		String filename = sc.next();
//		
//		File myfile = new File("C://File Handling Java/"+filename+".txt");						//File is predefined
//		
//		if(myfile.exists()) {																	//exists() is predefined
//			System.out.println("Already available");
//		}
//		else {
//			myfile.createNewFile();																//createNewFile is predefined			
//			System.out.println("file created successfully");
//		}
//		
//		
//	}
//}


















