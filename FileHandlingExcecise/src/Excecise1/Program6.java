
/* Java program how to get the file size and get the file path of the file in java */

package Excecise1;
import java.io.*;
import java.util.*;
public class Program6 {

	public static void main(String[] args) {
		try {
			File file = new File("D:\\FileHandlingExcecise\\FirstProgram.txt");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length());//it will only gives you the length of the text there are present in the file//
		}catch(Exception E) {
			System.out.println("there is an Error in getting the file path and size ");
		}

	}

}
