/*
 * Write a program to rotate the number by the given places 
 */
package Basic_Programing;
import java.util.*;
import java.lang.*;
public class Rotate_a_Number {
	
	// function to rotate the number by given places ----------------------
	public static int rotatenum(int n,int r) {
		int count=0;
		int ne=n;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		int po=(int)Math.pow(10,r);
		int num=ne%po;
		int left=ne/po;
		int leftdigit=count-r;
		int po2=(int)Math.pow(10,leftdigit);
		int rotate=num*po2+left;
		return rotate;	
	}

	// main function-----------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int r=sc.nextInt();
		int newnumber=rotatenum(n,r);
		System.out.println(newnumber);
	}

}
