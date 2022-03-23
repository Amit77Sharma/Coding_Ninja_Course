
/* JAVA program to write the content into the file using FileOutputStram Class */

package Excecise1;
import java.io.*;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(System.in);
			OutputStream file=new FileOutputStream("D:\\FileHandlingExcecise\\FirstProgram.txt");
			String str=sc.nextLine();
			byte[] b=str.getBytes();  //this is going to convert the string into the byte of array and then store.
			file.write(b);
			System.out.println("File Content Added Successfuly ");
			file.close();
			sc.close();
		}catch(Exception E) {
			System.out.println("There is an Error in Writting into the file");
		}
	}
}
