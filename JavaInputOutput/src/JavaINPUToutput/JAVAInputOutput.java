package JavaINPUToutput;
import java.io.*;
import java.io.IOException;
public class JAVAInputOutput {

	public static void main(String[] args) {
		
		try {
			
			int i=System.in.read();//returns ASCII code of 1st character  
			
			System.out.println((char)i);//will 
			
			System.out.println("hii code excecuted successfully");
			
		}catch(Exception e) {
			
			System.out.println("Error in code ");
			
		}
	}

}
