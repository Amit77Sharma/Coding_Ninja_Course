package JavaINPUToutput;
import java.io.*;
public class JavaBufferOutputClass {

	public static void main(String[] args) {
		
		//To add buffer into the OutputStream class we use the BufferOutputStream class to write the data directly into the stream....
		try {
			FileOutputStream file1=new FileOutputStream("D:\\Subject_Matter_Expert\\Amit.txt");
			BufferedOutputStream os=new BufferedOutputStream (file1);
			String s="Welcomes agin ";
			byte[] b=s.getBytes();
			os.write(b);
			os.flush()
			System.out.println("File ex");
		}catch(Exception e) {
			System.out.println("Error in the code ");
		}
	}

}
