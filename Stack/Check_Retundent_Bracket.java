
//Program to check wheather the brackets are unusal in the expression or not.........

package Stack;
import java.util.Stack;
import java.util.Scanner;
public class Check_Retundent_Bracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Stack<Character> st=new Stack<>();
		int i=0;
		while(i<str.length()) {
			char ch=str.charAt(i);
			if(ch==')') {
				if(st.peek()=='(') {
					System.out.println("true");
					break;
				}else {
					while(st.peek()!='(') {
						st.pop();
					}
					st.pop();
				}
			}else {
				st.push(ch);
			}
			i++;
		}
		if(st.size()==0) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}

	}

}
