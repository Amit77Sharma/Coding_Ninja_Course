package FileHandle;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WriteToFile {

	public static void main(String[] args) {
		
		//lets write something to our created file previously 
		//so to write into the file we have created prviously we have to use the FileWrite Class and its method to Write into the files 
		//lets import the FileWriter clas above 
		//lets create the object of the FileWriter and pass the path  of the file we wants to edit //
		try {
			FileWriter edit=new FileWriter("D:\\Subject_Matter_Expert\\Amit.");
			
			edit.write("Hii my name is amit. I study in Btech Technical College ");
			edit.write(80);
			edit.close();
			
			System.out.println("Written Successfully");
			
		}catch(Exception e) {
			
			System.out.println("error occurs ");
		}
		
		

	}

}
