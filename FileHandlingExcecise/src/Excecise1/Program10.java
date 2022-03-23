
/* JAVA program to append the text into the file */

package Excecise1;
import java.io.*;
public class Program10 {

	public static void main(String[] args) {
		
		try {
			File file=new File("D:\\FileHandlingExcecise\\main.txt");
			FileOutputStream fos=new FileOutputStream(file);
			String s="there are the appended content into the java ";
			fos.write(s.getBytes());
			System.out.println("text appended successfully");
			fos.close();
		}catch(Exception E) {
			System.out.println("THere is an Error in appending the content");
		}

	}

}
