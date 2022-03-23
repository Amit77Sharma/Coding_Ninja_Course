/*
 * Program for finding the maximum number can be formed from the given number of 3 digit..
 * order should be maintained ......
 */
package Basic_Programing;
import java.util.Scanner;
public class Maximum_Number {
	
	//function for calculating the numbe can be formed----
	public static int canbeformed(int n) {
		int newnumb=n;
		int i=1;
		int j=1;
		int k=10;
		int max=Integer.MIN_VALUE;
		int count=0;
		while(newnumb>0)
		{
			newnumb=newnumb/10;
			count++;
		}
		while(count>0)
		{
			int obtained=((n/k)*i);
			int newobtained=(n%i);
			int fin=obtained+newobtained;
			if(max<fin)
			{
				max=fin;
			}
			i=i*10;
			k=k*10;
			count--;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numeber ");
		int n=sc.nextInt();
		int ne=canbeformed(n);
		System.out.println(ne);

	}

}
