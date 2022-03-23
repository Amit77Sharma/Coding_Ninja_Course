
/* JAVA program to get the last modified date and time of the file */

package Excecise1;
import java.io.*;
import java.util.*;
public class Program9 {

	public static void main(String[] args) {
		try {
			File file = new File("D:\\FileHandlingExcecise\\main.txt");
			long last=file.lastModified();  //it will give me the last modified date ..////
			System.out.println(last+" "+ new Date(last));
		}catch(Exception E) {
			System.out.println("There is an Error in getting the last modified date and time ");
		}
	}
}
