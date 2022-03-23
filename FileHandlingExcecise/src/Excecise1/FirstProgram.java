
/* JAVA program to create a new file */

package Excecise1;
import java.io.*;
public class FirstProgram {
	public static void main(String[] args) {
		try {
			File file=new File("D:\\FileHandlingExcecise\\FirstProgram.txt");
			
			if(file.createNewFile()) {
				System.out.println("File Created Successfully");
			}else {
				System.out.println("File Not Created Successfully");
			}
		}catch(Exception E) {
			System.out.println("There is an Error in creating the file ");
		}
	}
}
