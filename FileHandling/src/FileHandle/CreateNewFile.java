package FileHandle;

import java.io.File;
import java.io.IOException;
public class CreateNewFile {

	public static void main(String[] args) {
		
		//lets create the Object of the File class ==========================
		File f1=new File("D:\\Subject_Matter_Expert\\filehandle.txt"); //here in the File parameter you must have to specify the name of the file you wants to create..
		try {
			
			if(f1.createNewFile()) {
				
				System.out.println("File "+f1.getName()+" created Successfully");
				
			}else {
				
				System.out.println("File already exist in the library");
				
			}
			
		}catch(Exception e) {
			
			System.out.println("path not found");
			
		}
	}

}
/*In the above code, we import the File and IOException class for performing file operation and handling errors, respectively.
 *  We create the f1 object of the File class and specify the location of the directory where we want to create a file. 
 *  In the try block, we call the createNewFile() method through the f0 object to create a new file in the specified location. 
 * If the method returns false, it will jump to the else section. If there is any error, it gets handled in the catch block.
 * */
