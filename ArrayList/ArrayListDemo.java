package ArrayList;

import java.util.ArrayList; // To use the Dynamic Array we have to import the Arraylist Package 

import javax.naming.Reference;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//lets create the dynamic Array ....
		
		ArrayList<Integer> arr=new ArrayList<>();//we have create the Dynamic Array.
		 
		// this method is used to add the element into the Arraylist.
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(50);
		arr.add(80);
		
		// This function is used to get the size of the Current Dynamic Array...
		
		arr.size();
		
		//this function is ude to get the element from the Dynamic ArrayList...
		
		arr.get(2);//In get function we have to define the index value which we wants to Access..
		
		// this function can take index at which position we wants to add the value into the Array..
		
		arr.add(2,90);// at 2nd index and the element is 90....
		
		System.out.println(arr.size());
		
		System.out.println(arr.get(3));
		
		System.out.println(arr.get(1));
		
		// the function to replace the element at specific position into the Array..
		
		arr.set(2, 100);// the firt position represent the index and the second position represent the data;
		
		System.out.println(arr.get(2));
		
		// the function used to remove the element from the Array list are..
		System.out.println(arr.get(3));
		
		arr.remove(3);// it will remove the element present at index three..
		
		System.out.println(arr.get(3));
	
		//we can also remove the element by creating the object Reference ....
		
		Integer i=70;
		arr.remove(i);
		
		
		// to trvel or to iterate over the loop is ...
		System.out.println("Elemenet present after all the operation performed ");
		
		for(int j=0; j<arr.size(); j++)
		{
			System.out.println(arr.get(j));
		}
		
		
		// Another for loop for printitng the array are 
		
		// this is for each loop
		
		System.out.println("By using new for loop ");
		
		for(int n:arr)
		{
			System.out.println(n);
		}
		
	}

}
