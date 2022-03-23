package StudentExcel;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Excel {
	
	public static void saveTofile(String s, String text, boolean append) throws Exception{
		File file1=new File(s);
		FileWriter fr=new FileWriter(file1,append);
		PrintWriter pw=new PrintWriter(fr);
		pw.print(text);
		pw.close();
	}
	public static void main(String[] args) throws Exception{
		ArrayList<DataSheet> array=new ArrayList<DataSheet>();
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<2; i++) {
			System.out.println("Enter the name of the student");
			 String name=sc.nextLine();
			 System.out.println("Enter the roll no of the student");
			 String roll=sc.nextLine();
			 System.out.println("Enter the physic marks");
			 int physic=sc.nextInt();
			 sc.nextLine();
			 System.out.println("Enter the chemistry marks ");
			 int chemistry=sc.nextInt();
			 sc.nextLine();
			 System.out.println("Enter the maths marks ");
			 int math=sc.nextInt();
			 sc.nextLine();
			 DataSheet d1=new DataSheet(name,roll,physic,chemistry,math);
			 array.add(d1);
		}
		String s2="Name\tRollNo\tPhysic\tChemistry\tMath";
		saveTofile("D:\\Subject_Matter_Expert\\StudentMarkSheet.txt",s2+"\n",true);
		for(DataSheet d:array) {
			String s1=d.toString();
			saveTofile("D:\\Subject_Matter_Expert\\StudentMarkSheet.txt",s1+"\n",true);
			System.out.println();
		}
		System.out.println("data send successfully");
		sc.close();
	}

}
