package Classes_And_Object;

public class Complex_Number_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Complex number 1 value ");
		Complex_Number c1=new Complex_Number(2,3);
		c1.print();
		System.out.println("after setting the real and imaginary value int it ");
		c1.setReal(4);
		c1.setImaginary(10);
		System.out.println("the new value of complex number becomes ");
		c1.print();
		
		System.out.println("Complex number 2 value ");
		Complex_Number c2=new Complex_Number(2,3);
		System.out.println("after setting the value of c2 we get the updated c1 value ");
		c1.add(c2);
		c1.print();
		c2.print();
		
		System.out.println("Comlex number 3 value");
		Complex_Number c3=new Complex_Number(2,3);
		c3.multiply(c2);
		c3.print();
		
		System.out.println("Complex number 4 value ");
		Complex_Number c4=Complex_Number.add(c1,c2);
		c1.print();
		c2.print();
		c4.print();
		

	}

}
