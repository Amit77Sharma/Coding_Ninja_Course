package OOPS1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class TestEmploye {

	public static void main(String[] args) {
		
		//lets test the Employe class is it working fine or not //
		Employe E1;
		
		Scanner sc=new Scanner(System.in);
		
		//lets pass the value in it to get the salary
		
		ArrayList<Employe> array=new ArrayList<Employe>();
		
		for(int i=0; i<2; i++) {
			System.out.println("Enter the ID of the Employe");
			int ID=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the first name of the employe");
			String first=sc.nextLine();
			System.out.println("Enter the last name of the employe");
			String last=sc.nextLine();
			System.out.println("Enter the Salary of the Employe");
			double Salary=sc.nextDouble();
			sc.nextLine();
			
			//putting all the details in the Arrays list of Employe ================
			E1=new Employe(ID,first,last,Salary);
			array.add(E1);	
		}	
		Collections.sort(array);
		for(Employe arr:array) {
			System.out.print("Name of the Employe is "+arr.getName()+".");
			System.out.print(" ID of the Employee id "+arr.getID()+".");
			System.out.print(" Annual Salary of the Employe id "+arr.getAnnualSalary()+".");
			System.out.print(" Raise percent per month is "+arr.getraisePercent()+".");
			System.out.println();
		}
		

	}

}
