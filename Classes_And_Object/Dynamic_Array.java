package Classes_And_Object;

public class Dynamic_Array {
	
	private int[] data;
	private int indexElement;
	Dynamic_Array()
	{
		data=new int[5];
		indexElement=0;
	}
	
	public boolean isEmpty()
	{
		return indexElement==0;
	}
	
	public int size()
	{
		return indexElement;
	}
	
	public int get(int i)
	{
		if(i>=indexElement)
		{
			return -1;
		}
		return data[i];
	}

	public void add(int elem)
	{
		if(indexElement>=data.length)
		{
			dublicateArray();
		}
		data[indexElement]=elem;
		indexElement++;
	}
	public void dublicateArray()
	{
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0; i<temp.length; i++)
		{
			data[i]=temp[i];
		}
	}
	public int removelast()
	{
		if(indexElement==0)
		{
			return 0;
		}
		int temp=data[indexElement-1];
		indexElement--;
		return temp;
	}
//	public int removefirst()
//	{
//		if(indexElement==0)
//		{
//			return 0;
//		}
//		
//	}
	
	
	
}
