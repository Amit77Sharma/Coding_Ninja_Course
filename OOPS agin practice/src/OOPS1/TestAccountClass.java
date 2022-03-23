package OOPS1;
import java.util.Scanner;
import java.util.ArrayList;
public class TestAccountClass {

	public static void main(String[] args) {
		
		//lets create the object of the AccountClass
		AccountClass A=new AccountClass("45011","Subham",100);
		AccountClass B=new AccountClass("374","Amit",200);
		A.credit(100);
		B.debit(30);
		B.transferTo(A, 100);
		System.out.println("New balance of ID "+A.getID()+" becomes "+A.getBalance());
		System.out.println("New Balance of ID "+B.getID()+" becomes "+B.getBalance());
		
		
//		ArrayList<AccountClass> array=new ArrayList<AccountClass>();
//		Scanner sc=new Scanner(System.in);
//		for(int i=0; i<2; i++) {
//			System.out.println("Enter the id of the Account holder ");
//			String ID=sc.nextLine();
//			System.out.println("Enter the name of the employe ");
//			String name=sc.nextLine();
//			System.out.println("Enter the initial balance of the employee");
//			int balance=sc.nextInt();
//			sc.nextLine();
//			A=new AccountClass(ID,name,balance);
//			array.add(A);
//		}
		
//		for(AccountClass account:array) {
//			System.out.println(account.getBalance());
//		}
//		A.transferTo(A, 0)

	}

}
