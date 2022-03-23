
/* JAVA program to create the directory/folder in particular derive*/

package Excecise1;
import java.io.*;
public class Program15 {
	
	public static void main(String[] args) {
		try {
			File file = new File("D:\\Example");
			boolean isDirectory=file.mkdir();  // this method will create the directory ////
			if(isDirectory) {
				System.out.println("Directory created Successfully");
			}else {
				System.out.println("Directory not cretaed Successfully");
			}
		}catch(Exception E) {
			System.out.println("Cann't able to create the directory/ folder in particular drive");
		}

	}

}
