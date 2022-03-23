
/* JAVA program to find weather the file is redable or not */

package Excecise1;
import java.io.*;
public class Program16 {

	public static void main(String[] args) {
		try {
			File file = new File("D:\\FileHandlingExcecise\\main.txt");
			boolean r=file.canRead();
			if(r) {
				System.out.println("File is redable ");
			}else {
				System.out.println("File is no redable ");
			}
		}catch(Exception E) {
			System.out.println("Errer in finding the file is redable or not ");
		}

	}

}
