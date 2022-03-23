package FileHandle;

import java.io.File;

import java.io.IOException;
public class ExistFileFunction {

	public static void main(String[] args) {
		
		//lets first create the file first at particular location..
		
		File f1=new File("D:\\Subject_Matter_Expert\\Amit.txt");//here I wants to create the file of the name Amit.
		
		try {
			
			if(f1.createNewFile()) {
				
				System.out.println("File created Successfully"+f1.getName());
				
			}else {
				
				System.out.println("thre is an error of creating the file ");
				
			}
			
		}catch(Exception e) {
			
			System.out.println("Handle the exception arises");
		}
		
		try {
			if(f1.exists()) {
				System.out.println("the name of the file is "+f1.getName());
				System.out.println("the file is readable or not:- "+f1.canRead()+" its readable ");
				System.out.println("the file can be writable "+f1.canWrite()+" its writable file ");
				System.out.println("the size of the file is "+f1.length());
				System.out.println("The absolute path of the file is "+f1.getAbsolutePath());
			}
		}catch(Exception e1) {
			
			System.out.println("there is an error in the file created ");
			
		}
	}

}


/*
 * In the above code, we import the java.io.File package and create a class FileInfo. 
 * In the main method, we create an object of the text file which we have created in our previous example.
 *  We check the existence of the file using a conditional statement, and if it is present, we get the following information about that file:
1. We get the name of the file using the getName()
2. We get the absolute path of the file using the getAbsolutePath() method of the file.
3. We check whether we can write data into a file or not using the canWrite()
4. We check whether we can read the data of the file or not using the canRead()
5. We get the length of the file by using the length()
*/
