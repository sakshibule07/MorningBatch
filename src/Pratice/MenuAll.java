package Pratice;

import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MenuAll {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name to create new file:");
        String name = sc.next();
        File myfile = new File("C://File Handling Java/" + name + ".txt");

        boolean flag = true;
        while (flag) {
        	
            System.out.println("1. Create New File");
            System.out.println("2. Write File");
            System.out.println("3. Read File");
            System.out.println("4. delete File");
            System.out.println("5.Exit");

            
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            
            switch (choice) {
                case 1: {
                    if (myfile.exists()) {
                        System.out.println("File already exists.");
                    } else {
                        myfile.createNewFile();
                        System.out.println("File created.");
                    }
                    break;
                }

                case 2: {
                    System.out.println("Enter the name to Write the File: ");
                    String fname = sc.next();
                    sc.nextLine(); // consume newline

                    FileWriter fw = new FileWriter("C://File Handling Java/" + fname + ".txt", true);

                    System.out.println("Enter the Content to write to the file: ");
                    String contentToWrite = sc.nextLine();
                    fw.write(contentToWrite + "\n");
                    fw.close();

                    System.out.println("Written successfully.");
                    break;
                }

                case 3: {
                    System.out.println("Enter the name to Read the File: ");
                    String fname = sc.next();

                    File fileToRead = new File("C://File Handling Java/" + fname + ".txt");
                    if (!fileToRead.exists()) {
                        System.out.println("File does not exist.");
                        break;
                    }

                    FileReader fr = new FileReader(fileToRead);
                    int ch;
                    System.out.println("File Content:");
                    while ((ch = fr.read()) != -1) {
                        System.out.print((char) ch);
                    }
                    fr.close();
                    System.out.println();
                    break;
                }
                case 4: {
        			if(myfile.delete()) {
        				System.out.println("File Deleted Successfully....");
        			}
        			else {
        				System.out.println("Not Able to Delete the File.!");
        			}
        			
        			break;
        		}

                case 5: {
                    flag = false;
                    break;
                }

                default:
                    System.out.println("Invalid input. Please select from 1 to 4.");
                    break;
            }

            // Ask if user wants to continue
            System.out.println("Do you want to continue ...yes..or..no");
            String str = sc.next();

            if (str.equals("yes")) {
                // continue loop
            } else {
                flag = false;
            }
        }

        System.err.println("Application has been Closed...!");
        sc.close();
    }
}
