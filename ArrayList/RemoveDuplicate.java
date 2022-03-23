package ArrayList;

import java.util.Scanner;

import java.util.ArrayList;

public class RemoveDuplicate {
	
	public static ArrayList<Integer> removeConsecutive(int[] arr)
	{
		ArrayList<Integer> result=new ArrayList<>();
		result.add(arr[0]);
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]!=arr[i-1])
			{
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[7];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> result=removeConsecutive(arr);
		for(int i:result)
		{
			System.out.println(i);
		}

	}

}
