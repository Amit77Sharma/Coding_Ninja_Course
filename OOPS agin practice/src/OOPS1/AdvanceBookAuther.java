package OOPS1;
import java.util.Scanner;
public class AdvanceBookAuther {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Auther[] au=new Auther[2];
		for(int i=0;i<2; i++) {
			System.out.println("Enter the name of the auther ");
			String name=sc.nextLine();
			System.out.println("Enter the email of auther");
			String email=sc.nextLine();
			System.out.println("Enter the gender of the auther");
			char gender=sc.next().charAt(0);
			sc.nextLine();
			au[i]=new Auther(name,email,gender);
		}
		AdvanceBook ab=new AdvanceBook("Amit",au,20.0,2);
		System.out.println(ab.getAutherNames());
		System.out.println(ab.toString());
		

	}

}
