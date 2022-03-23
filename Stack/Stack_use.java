package Stack;

public class Stack_use {

	public static void main(String[] args) throws stackException {
		// TODO Auto-generated method stub
		Stack_Using_Arrays stack=new Stack_Using_Arrays(20);
		stack.push(20);
		
		System.out.println(stack.top());
		
		stack.push(30);
		
		System.out.println(stack.top());
		
		stack.push(40);
		
		System.out.println(stack.top());
		
		stack.push(50);
		
		System.out.println(stack.top());
		
		stack.push(60);
		
		System.out.println(stack.top());
		
		stack.push(10);
		
		System.out.println(stack.top());
		
		stack.push(100);
		
		System.out.println(stack.top());
		
		stack.push(90);
		
		System.out.println(stack.size());
		
		System.out.println(stack.top());
		
		stack.push(80);
		
		System.out.println(stack.top());
		
		stack.push(110);
		
		System.out.println(stack.top());
		
		stack.push(120);
		
		System.out.println(stack.top());
		
		stack.push(130);
		
		System.out.println(stack.pop());
		
		System.out.println(stack.size());
		
		stack.top();
		
		stack.isEmpty();
	}

}
