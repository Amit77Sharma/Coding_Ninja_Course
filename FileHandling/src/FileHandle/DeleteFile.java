package FileHandle;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter; 
public class DeleteFile {

	public static void main(String[] args) {
		
		//here we will see how we can delete the data from the file.
		//initially importing the file class first...
		//to delete the file we used the delete() method of file class...
		File f1=new File("D:\\Subject_Matter_Expert\\Amit.txt");
		
		try {
			
			if(f1.delete()) {
				
				System.out.println("file deleted Successfully ");
				
			}else {
				
				System.out.println("File not deleted Successfully");
				
			}
		}catch(Exception e) {
			
			System.out.println("Error occured");
			
		}
	}
}

/*
 * In the above code, we import the File class and create a class DeleteFile. In the main() method of the class,
 *  we create f0 object of the file which we want to delete. In the if statement, we call the delete() method of the file using the f0 object.
 *   If the delete() method returns true, we print the success custom message. Otherwise, it jumps to the else section where we print the unsuccessful custom message.
*/