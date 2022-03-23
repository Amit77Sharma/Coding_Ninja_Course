package Classes_And_Object;

public class Complex_Number {
	
	int real;
	int imaginary;
	
	Complex_Number(int real,int imaginary)
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	//function for setting the real part....
	public void setReal(int real) {
		this.real=real;
	}
	
	//function for setting the imaginary part....
	
	public void setImaginary(int imaginary) {
		this.imaginary=imaginary;
	}

	// adding the two complex Number....
	public void add(Complex_Number c2) {
		this.real=this.real+c2.real;
		this.imaginary=this.imaginary+c2.imaginary;
		
	}
	
	// Multiplication of two complex Nunber 
	public void multiply(Complex_Number c3) {
		int neWreal=this.real*c3.real-this.imaginary*c3.imaginary;
        int neWimaginary=this.real*c3.imaginary+this.imaginary*c3.real;
        this.real=neWreal;
        this.imaginary=neWimaginary;
	}
	
	//adding the two complex Number .......
	
	public static Complex_Number add(Complex_Number c1,Complex_Number c2) {
		int nereal=c1.real+c2.real;
		int neimaginary=c1.imaginary+c2.imaginary;
		Complex_Number c4=new Complex_Number(nereal,neimaginary);
		return c4;
	}
	
	public void print() {
		System.out.println(real+"+"+imaginary+"i");
	}
}
