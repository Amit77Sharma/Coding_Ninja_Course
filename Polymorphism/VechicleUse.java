package Polymorphism;

public class VechicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// As we all konow Object class is the super class of every object ....
		
//		Object O=new Vechicle();
//		Object O=new Car();
		
		Vechicle v;// initiallay we are creating the referenec of the vechicle....
		
		v=new Car();// creating object like this is absolutly ok.....
		
		Car c=(Car)v;		// here we are typecasting the vechicle refereence into the car......
		
		v.name="amit";
		//v.noDoors=8; this shows compilation error.....
		
		v.price=1000;
		//Car c=new Car();
		
		c.noDoors=9;
		v=new Bicycle();
		//v.nonDiesel=10;
		
		
		
		
		
		

	}

}
