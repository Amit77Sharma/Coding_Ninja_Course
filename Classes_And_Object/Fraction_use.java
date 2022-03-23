package Classes_And_Object;

public class Fraction_use {

	public static void main(String[] args){
		// TODO Auto-generated method
		
		System.out.println("f1 object value");
		Fraction f1=new Fraction(3,6);
		f1.simplify();
		f1.increment();
		f1.print();
		
		System.out.println("f2 object value");
		Fraction f2=new Fraction(4,12);
		f2.simplify();
		f2.increment();
		f2.print();
		
		System.out.println("f3 object value");
		Fraction f3=new Fraction(5,8);
		f3.simplify();
		f3.increment();
		f3.print();
		
		//addintion of fraction1 anf fraction f2...
		System.out.println("Addition of two fraction f1 and f2");
		f1.add(f2);
		f1.simplify();
		f1.increment();
		f1.print();
		
		System.out.println("additio of f2 and f3 fraction ");
		// addition of fraction2 and fraction3....
		f2.add(f3);
		f2.print();
		
		Fraction f4=Fraction.add(f2,f3);
		f4.print();

	}

}
