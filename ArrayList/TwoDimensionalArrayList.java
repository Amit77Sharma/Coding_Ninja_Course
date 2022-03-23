package ArrayList;

import java.util.Scanner;

import java.util.ArrayList;

public class TwoDimensionalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//taking input from the user and printitng it in matrix formm...
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<ArrayList<Integer>> outer=new ArrayList<ArrayList<Integer>>();
		
		//Taking input form the user .....
		System.out.println("Enter the number ");
		
		for(int i=0; i<3; i++)
		{
			ArrayList<Integer> min=new ArrayList<Integer>();
			for(int j=0; j<2; j++)
			{
				int num=sc.nextInt();
				min.add(num);
			}
			outer.add(min);
		}
		
		//printing the ArrayList......
		for(int i=0; i<outer.size(); i++)
		{
			for(int j=0; j<outer.get(0).size(); j++)
			{
				System.out.print(outer.get(i).get(j)+" ");
			}
			System.out.println();
		}
		//outer.clear();
		
//		for(int i:outer)
//		{
//			System.out.println(i);
//		}

		System.out.println(outer);
	}

}
