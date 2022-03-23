package Inheritance2;

import Inheritance.Vechicle;

public class Vechicle2Use {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Vechicle v=new Vechicle();
		
		v.setName("Amirt");
		
		v.maxSpeed=20;// if we try to access the property of vechicle here it will show error because 
					// the maxSpeed variable has  Default Acess specifier in the vechicle class...
		// and default accessspecifier can be only used within a package....
		// so to access it we have to make it public to the maxSpeed in Vechicle class....
		// once we declear it public the error will goes...
		v.print();
		
		Truck t = new Truck();
		
		t.maxCapacity=2000;
		
		t.print();
	}

}
