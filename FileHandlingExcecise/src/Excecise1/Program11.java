
/* java program to determine the number of bytes written in the file using DataOutputStream class */

package Excecise1;
import java.io.*;
public class Program11 {

	public static void main(String[] args) {
		try {
			FileOutputStream file=new FileOutputStream("D:\\FileHandlingExcecise\\main.txt");
			DataOutputStream d=new DataOutputStream(file);
			d.writeBytes("hii how are you");
			int s=d.size();
			System.out.println(s);
			d.close();
		}catch(Exception E) {
			System.out.println("there is an Error indetermining the number of bytes written ");
		}

	}

}
