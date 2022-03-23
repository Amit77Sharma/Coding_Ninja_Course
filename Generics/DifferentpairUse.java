package Generics;

public class DifferentpairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Differentpair<Integer,String> d=new Differentpair<>(10,"amit");
		System.out.println(d.getfirst() + " " + d.getSecond());
		
		Differentpair<Double,String> e=new Differentpair<>(10.28,"amit");
		System.out.println(e.getfirst() + " " + e.getSecond());
		
		
		

	}

}
