
/* Write a java Program to create the copy of the file */

package Excecise1;
import java.io.*;
import java.util.*;
public class Program8 {

	public static void main(String[] args) {
		//lets first cretate the two file 
		try {
			File file1 = new File("D:\\FileHandlingExcecise\\main.txt");
			FileWriter wr=new FileWriter(file1);
			wr.write("Hellow my name is Amit Kumar Sharma");
			wr.close();
			File file2 = new File("D:\\FileHandlingExcecise\\Copiedfile.txt");
			FileWriter we=new FileWriter(file2);
			
			Scanner sc=new Scanner(file1);
			while(sc.hasNext()) {
				String s=sc.nextLine();
				we.write(s);
			}
			we.close();
			sc.close();
			System.out.println("File Coppied Successfully");
		}catch(Exception E) {
			System.out.println("There is an Error in copying the file ");
		}

	}

}
