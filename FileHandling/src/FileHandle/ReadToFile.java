package FileHandle;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ReadToFile {

	public static void main(String[] args) {
		
		//IN this example we will sea how we can read from the file.
		//To read from the file we use the class File and Scanner class to get the input from the file 
		try {
			
			File f1=new File("D:\\Subject_Matter_Expert\\Amit.txt");
			
			Scanner sc=new Scanner(f1);
			
			while(sc.hasNext()) {
				
				String s=sc.nextLine();
				
				System.out.println(s);
				
			}
			
			sc.close();
			
		}catch(Exception e) {
			
			System.out.println("Error Occured");
			
		}

	}
}

/* In the above code, we import the "java.util.Scannner", "java.io.File" and "java.io.IOException" classes.
 *  We create a class ReadFromFile, and in its main method, we use the try-catch block. In the try section, 
 *  we create an instance of both the Scanner and the File classes. We pass the File class object to the Scanner 
 *  class object and then iterate the scanner class object using the "While" loop and print each line of the file. 
 *  We also need to close the scanner class object, so we use the close() function. If we get any error in the try section,
 *   it jumps to the catch block. In the catch block, we handle the IOException and print a custom message.
 *   
*/