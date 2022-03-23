package JavaINPUToutput;
import java.io.*;
import java.util.Scanner;
public class JavaCopyFile {

	public static void main(String[] args) {
		
		//here i wants to copy the one file data to another file data....
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first location of the file ");
		
		String file1=sc.next();
		
		System.out.println("Enter the second location of the file ");
		
		String file2=sc.next();
		
		try {
			FileReader r=new FileReader(file1);
			
			FileWriter w=new FileWriter(file2,true);
			
			int c;
			
			while((c=r.read())!=-1) {
				
				w.write(c);
				
			}
			
			System.out.println("copied Successfully");
			
			r.close();
			
			w.close();
			
		}catch(Exception e) {
			
			System.out.println("Error found");
			
		}
	}

}
