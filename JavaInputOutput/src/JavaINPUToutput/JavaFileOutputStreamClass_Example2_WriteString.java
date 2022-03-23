package JavaINPUToutput;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class JavaFileOutputStreamClass_Example2_WriteString {

	public static void main(String[] args) {
		
		//lets create one more file to get edited with the stuff .
		try {
			File f1=new File("D:\\Subject_Matter_Expert\\Amit.txt");
			
			if(f1.createNewFile()) {
				
				System.out.println("File created Successfully");
				
			}else {
				
				System.out.println("File already Exist");
			}
		
		//lets create the object of the FileOutputStream class 
			FileOutputStream Example1=new FileOutputStream("D:\\Subject_Matter_Expert\\filehandle.txt");
			
			String s="Hii amit how are you";
			
			//lets create the byte array to 
			byte[] b=s.getBytes(); //this will convert the string into the byte array 
			
			Example1.close();		
		}catch(Exception e) {
			System.out.println("Error occurs ");
		}
		

	}

}
