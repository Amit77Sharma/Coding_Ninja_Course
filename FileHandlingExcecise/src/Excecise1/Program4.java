
/* JAVA program to write content into the file using BufferedWriter Class */

package Excecise1;
import java.io.*;
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		try {
			//Writing the content into the file using the BufferedWriter ///
			
			FileWriter writ=new FileWriter("D:\\FileHandlingExcecise\\FirstProgram.txt");
			BufferedWriter buffer=new BufferedWriter(writ);
			buffer.write("Hii my name is amit again");
			System.out.println("File Written SuccessFully");
			buffer.close();
			
		}catch(Exception E) {
			System.out.println("There is an Error in the File Writting");
		}
		

	}

}
