package ArrayList;

import java.util.Scanner;

import java.util.ArrayList;

public class PrintArray {
	
	
	// Print function to print the array of the ArrayList..
	
	public static void print(ArrayList<Integer> arr)
	{
		for(int i=0; i<arr.size(); i++)
		{
			System.out.println(arr.get(i));
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In this program we will take input from the user and print its value in Dynamic Array.
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> arr=new ArrayList<>();
		{
			int n=sc.nextInt();
			arr.add(n);
		}
		print(arr);
		
	}

}
