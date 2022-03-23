
// In this program we will create the ArrayList  by taking input from the user...

package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Take_Input_ArrayList {

	public static void main(String[] args) {
		
		// taking input in ArrayList...
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println("Enter the number ");
		int number=sc.nextInt();
		while(number !=-1)
		{
			arr.add(number);
			number=sc.nextInt();
		}
		
		System.out.println("the inserted Elements into the ArrayList are");
		System.out.println(arr);
	}

}
