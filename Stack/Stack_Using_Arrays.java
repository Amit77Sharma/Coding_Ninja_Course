package Stack;

public class Stack_Using_Arrays {
	
	private int data[];
	private int indexElement;
	
	public Stack_Using_Arrays() {
		data=new int[10];
		indexElement=-1;	
	}
	
	public Stack_Using_Arrays(int value) {
		data=new int[value];
	}
	//get the size of the stack.....=========================================
	public int size() {
		return indexElement+1;
	}
	
	// to get wheather the stack is empty or not=================================
	public boolean isEmpty() {
		return indexElement==-1;
	}
	
	//To get the top of the element of the stack======================
	public int top() {
		return data[indexElement];
		
	}
	
	// Want's to insert iinto the satck=================================
	public void push(int number) throws stackException{
		if(indexElement>=data.length-1)
		{
			Dynamicstack();
		}
		indexElement++;
		data[indexElement]=number;	
	}
	
	//want's to pop the element of the stack....=====================================
	public int pop() throws stackException{
		if(indexElement==-1) {
			// throw the exception...
			throw new stackException();
		}
		int temp=data[indexElement];
		indexElement--;
		return temp;	
	}
	
	// creating Dynamic stack.....
	public void Dynamicstack() {
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0; i<temp.length; i++) {
			data[i]=temp[i];
		}
	}

}
