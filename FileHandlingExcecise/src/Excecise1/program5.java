
/* JAVA program to read the content form the file using the BufferedReader Class */

package Excecise1;
import java.io.*;
import java.util.*;
public class program5 {

	public static void main(String[] args) {
		try {
			FileReader file=new FileReader("D:\\FileHandlingExcecise\\FirstProgram.txt");
			BufferedReader buffReader=new BufferedReader(file);
			Scanner sc=new Scanner(buffReader);
			while(sc.hasNext()) {
				 String s=sc.nextLine();
				 System.out.println(s);
			}
			buffReader.close();
			sc.close();
			file.close();
		}catch(Exception E) {
			System.out.println("There is an Error in Reading the file ");
		}

	}

}
