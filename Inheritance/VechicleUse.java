package Inheritance;

public class VechicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating the main class to use the vechicle 
		Vechicle v =new Vechicle();
		
		v.setName("Ajit");
		
		v.price=200;
		
		v.print();
		
		//v.name="ajit";
		System.out.println("Car proprties are ");
		
		Car c=new Car();
		
		c.setName("B.M.W");
		
		c.price=1000;
		
		c.maxSpeed=200;
		
//		c.printCar();	
		
		c.setNoDoor(8);
		
		c.print();
		
		//System.out.println(c.getValue());
		System.out.println("Bycycle properties are ");
		
		Bicycle b=new Bicycle();
		
		b.setName("amit");
		
		b.price=100;
		
		b.maxSpeed=20;
		
		b.print();
	}

}
