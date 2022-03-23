
//Generics mean parameterized types. The idea is to allow type (Integer, String, … etc, and user-defined types) 
//to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. 
//An entity such as class, interface, or method that operates on a parameterized type is called a generic entity.

package Generics;

public class PairUse {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Pair<String> p=new Pair<String>("Amit","Rohil");
		
		
		System.out.println(p.getFirst() + " " + p.getSecond());
		Pair<Integer> d=new Pair<Integer>(-1,1000);
		
		System.out.println(d.getFirst() + " " + d.getSecond());
		
		Pair<Double> f=new Pair<Double>(10.25,1000.18);
		System.out.println(f.getFirst() + " " + f.getSecond());
		
		//Pair<Vechicle> g=pair<Vechicle>(new Vechicle(),newVechicle());//we can pass the vaule via creating the object of the vechicle
		

	}

}
