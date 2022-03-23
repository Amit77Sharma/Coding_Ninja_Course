package JavaINPUToutput;
import java.io.FileOutputStream;
import java.util.Scanner;
public class JavaFileOutputStreamClass_Example1_WriteByte {

	public static void main(String[] args) {
		
		//lets create the object of FileOutputStream class with the path of file we wants to edit 
		
		//this is used to Write byte into the file======================
		
		try {
			
			FileOutputStream Example1=new FileOutputStream("D:\\Subject_Matter_Expert\\filehandle.txt");
			
			Example1.write(89);
			
			Example1.close();
			
			System.out.println("File Edited Successfully");
			
		}catch(Exception e) {
			
			System.out.println("Error Occured ");
		}
		
		//to write string into the file we use byte[] array to write the String into the file===============
		
		try {
			FileOutputStream Example2=new FileOutputStream("D:\\Subject_Matter_Expert\\filehandle.txt");
			
			String s="Welcome to my file Amit";
			
			byte[] b=s.getBytes();  //this method is use to convert the String s to the byte array....
			
			Example2.write(b);
			
			Scanner sc=new Scanner((Readable) Example2); //here the error is causes need to solve this 
			
			while(sc.hasNext()) {
				
				String s4=sc.nextLine();
				
				System.out.println(s4);
			}
			sc.close();
			
			Example2.close();
			
		}catch(Exception e1) {
			
			System.out.println("Error found in the file ");
		}
	}
}

/*
 * Java FileOutputStream is an output stream used for writing data to a file.
If you have to write primitive values into a file, use FileOutputStream class. 
You can write byte-oriented as well as character-oriented data through FileOutputStream class. 
But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.
*/
