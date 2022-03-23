package Stack;
import java.util.Stack;
import java.util.Scanner;
public class Balance_parentesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Character> stock=new Stack<>();
		String s=sc.nextLine();
		int i=0;
		while(i<s.length()) {
			char ch=s.charAt(i);
			if(ch=='[' || ch=='{'  || ch=='(') {
				stock.push(ch);
			}
			else if(ch==']')
			{
				if(stock.size()==0) {
					System.out.println("false");
				}
				else if(stock.peek()!='[') {
					System.out.println("false");
				}else {
					System.out.println(stock.pop());
				}
				
			}else if(ch=='}') {
				if(stock.size()==0) {
					System.out.println("flase");
				}
				else if(stock.peek()!='{') {
					System.out.println("false");
				}else {
					System.out.println(stock.pop());
				}
			}else if(ch==')') {
				if(stock.size()==0) {
					System.out.println("false");
				}
				else if(stock.peek()!='(') {
					System.out.println("false");
				}else {
					System.out.println(stock.pop());
				}
			}
			i++;
		}
		if(stock.size()==0) {
			System.out.println("correct");
		}
		if(stock.size()>0) {
			System.out.println("false");
		}
	}
}
