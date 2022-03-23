////Exception is an abnormal event that occurs in your code and Disrupt the normal flow of code 
// There are three types of Exception..
/*
 * 1.Error:-
 * 2.Checked Exception:-
 * 3.Unchecked Exception:-
 */
package Exception_Handling;

public class Exceptiondemo {
	
	public static int fact(int n) throws NegativeNumber{
		if(n<0)
		{
			throw new NegativeNumber();
		}
		int ans=1;
		for(int i=1; i<=n; i++)
		{
			ans=ans*i;
		}
		return ans;
	}
	
	public static int divide(int a,int b) throws DivideByZero {
		if(b==0)
		{
//			throw new ArithmeticException();//here as we Know that the exception is ocurs either we can handle it exception
			//or we can throw it to the main function
			throw new DivideByZero();
		}
		return a/b;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
//		String s=null;
//		System.out.println(s.length());// it will throw null pointer exception
//		
//		System.out.println(4/0);// it will throw an exception ArithmaticException
		try {
			divide(2,4);// here exception raised either you can handle here exception or main will throw the Exception 
			System.out.println("After Exception occured ");
			System.out.println(fact(-1));
		}catch(DivideByZero z) {
			System.out.println("Divide by Zero Exception raised ");
		}catch(NegativeNumber n) {
			System.out.println("Negative number found");
		}catch(Exception e)
		{
			System.out.println("Generic Exception");
		}finally {
			System.out.println("finally block is going to execute either the exception occurs or not ");
		}
		System.out.println("Successfully Executed");
			// to the Exception class...
		// what if we wants to create our own Exception class and we will handle by our self 
	}

}
