
/* JAVA program to Read Content form the file using the FileIutputStream class  */

package Excecise1;
import java.io.*;
import java.util.*;
public class Program3 {

	public static void main(String[] args) {
		try {
			//to read the data from the file we use the FileInputStream Class ///
			InputStream fileRead=new FileInputStream("D:\\FileHandlingExcecise\\FirstProgram.txt");
			Scanner sc=new Scanner(fileRead);
			while(sc.hasNext()) {
				String Str=sc.nextLine();
				System.out.println(Str);
			}
			fileRead.close();
			sc.close();
			System.out.println("File Content Displayed Successfully");
		}catch(Exception E) {
			System.out.println("There is an Error in reading the file ");
		}

	}

}
