/*
 * Given a string s, compute recursively a new String where identical chars that are 
 * adjacent into the original string are saperated from each other bu a "*".
 */
package Assignment_Recursion;
import java.util.Scanner;
public class Pair_star {
	
	//function for checking the pair of character......................
	
	static String ne="";
	public static String pair_star(String s,int i)
	{
		ne=ne+s.charAt(i);
		if(i==s.length()-1)
		{
			return "";
		}
		if(s.charAt(i)==s.charAt(i+1))
		{
			ne=ne+"*";
		}
		pair_star(s,i+1);
		return ne;
	}
	
	// main function of this program--------------------------------------

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s=sc.next();
		String ne1=pair_star(s,0);
		System.out.println(ne1);

	}

}
