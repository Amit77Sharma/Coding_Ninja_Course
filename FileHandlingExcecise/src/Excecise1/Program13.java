
/* JAVA program to check wheather the file is hidden or not */

package Excecise1;
import java.io.*;
public class Program13 {

	public static void main(String[] args) {
		//program that the file is hidden or not//
		try {
			File file = new File("D:\\FileHandlingExcecise\\main.txt");
			boolean value=file.isHidden();
			System.out.println(value);
		}catch(Exception E) {
			System.out.println("getting error in finding file ");
		}

	}

}
