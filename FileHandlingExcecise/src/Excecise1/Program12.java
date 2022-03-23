
/*JAVA program to read the text from the file using the specified indexes */

package Excecise1;
import java.io.*;
public class Program12 {

	public static void main(String[] args) {
		File file1 = new File("D:\\FileHandlingExcecise\\main.text");
		try {
			FileInputStream file=new FileInputStream(file1);
			int c;
			System.out.println("the text after the value 5 is ");
			file.skip(5);
			while((c=file.read())!=-1) {
				System.out.println((char)c);
			}
			file.close();
		}catch(Exception E) {
			System.out.println("File upto the index is not working ");
		}
	}
}
