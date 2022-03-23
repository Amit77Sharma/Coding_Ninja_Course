package Generics;

public class GenericMethod {

	//this method is general method to print the array of only integer type but whts if we wants to
	//print the array of String type an takes input ar String
//	public static void printArray(int[] arr)
//	{
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
//	}
	
	
	//lets create the method generic ...to print the elemeents of the Array...
	
	public static<T extends Vechicle> void printArray(T arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i].print();
		}
	}
	
	public static<T> void printArray(T arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args)
	{
		//Integer type array....................
		Integer[] arr=new Integer[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=i+1;
		}
		printArray(arr);
		
		//String type array.............
		
		String[] arrS=new String[5];
		
		for(int i=0; i<arrS.length; i++)
		{
			arrS[i]="Amit";
		}
		printArray(arrS);
		
		//we can Create the Vechicle type class and crete the tpe of Array of that ......
		Vechicle[] v=new Vechicle[10];
		for(int i=0; i<v.length; i++)
		{
			v[i]=new Vechicle(i+1,i*2);
		}
		printArray(v);
	}

}
