/*
 * here we are calculating the fraction value and simplifaying its value 
 */
package Classes_And_Object;

public class Fraction{
	
	int numerator;
	int denominator;
	
	Fraction(int numerator,int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
//		if(denominator==0)
//		{
//			throws new DivideByZero();
//		}
		simplify();
	}
	
	// finding the simplified calue of the fraction.......
	public void simplify() {
		int GCD=1;
		int smaller=Math.min(numerator,denominator);
		for(int i=2; i<=smaller; i++)
		{
			if(numerator%i==0 && denominator%i==0)
			{
				GCD=i;
			}
		}
		this.numerator=numerator/GCD;
		this.denominator=denominator/GCD;
	}
	
	//Incrementing the fraction value by 1
	
	public void increment() {
		this.numerator=this.numerator+this.denominator;
	}
	
	//adding the value of f1 and f2.....
	public void add(Fraction f2)
	{
		this.numerator=this.numerator*f2.denominator+f2.numerator*this.denominator;
		this.denominator=this.denominator*f2.denominator;
		simplify();
	}
	
	public static Fraction add(Fraction f2, Fraction f3)
	{
		int neWnumerator=f2.numerator*f3.denominator+f3.numerator*f2.denominator;
		int neWdenominator=f2.denominator*f3.denominator;
		Fraction f4=new Fraction(neWnumerator,neWdenominator);
		return f4;
		
	}
	
	public void print()
	{
		System.out.println(numerator+"/"+denominator);
	}

}
