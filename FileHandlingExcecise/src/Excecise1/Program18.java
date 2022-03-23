
/*JAVA program to get the file owner name in java*/

package Excecise1;
import java.io.*;
import java.util.*;
public class Program18 {

	public static void main(String[] args) {
		try {
			FileOwnerAttributeName file = new FileOwnerAttributeName("D:\\Subject_Matter_Expert\\filehandle.txt");
			
		}catch(Exception E) {
			System.out.println("Errer in getting the name of the file ");
		}

	}

}
