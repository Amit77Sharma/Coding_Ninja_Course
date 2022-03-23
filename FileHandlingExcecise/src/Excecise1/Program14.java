
/* JAVA program to get the size of the file in byte or kilobyte or megabyte*/

package Excecise1;
import java.io.*;
public class Program14 {

	public static void main(String[] args) {
		try {
			File file = new File("D:\\FileHandlingExcecise\\main.txt");
			long filesize=file.length();
			System.out.println("File size in byte :"+filesize);
			System.out.println("File size in KB is :"+(double)filesize/1024);
			System.out.println("File Size in MB is :"+(double)filesize/(1024*1024));
		}catch(Exception E) {
			System.out.println("gettting error ");
		}

	}

}
