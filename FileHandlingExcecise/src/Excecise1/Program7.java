
/* java Program to delete the file */

package Excecise1;
import java.io.*;
import java.util.*;
public class Program7 {

	public static void main(String[] args) {
		try {
			//delete the file ---
			File file = new File("D:\\FileHandlingExcecise\\FirstProgram.txt");
			if(file.delete()){
				//this will simply delete the file .../
				System.out.println("File deleted Successfully ");
			}else {
				System.out.println("File not deleted Successfully");
			}
		}catch(Exception E) {
			System.out.println("There is an Error in deleting the file ");
		}

	}

}
