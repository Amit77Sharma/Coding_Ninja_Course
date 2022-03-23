package Generics;

public class ChainGenericPairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChainGenericPair<Integer,String> s=new ChainGenericPair<>(10,"amit");
		
		ChainGenericPair<ChainGenericPair<Integer,String>,String> n;
		n=new ChainGenericPair<>();
		
//		System.out.println(n.getfirst());
		
		//n.setfirst().setfirst(200);
		
		//n.setfirst(10000,"amiyt");
		
		System.out.println(n.getfirst().getfirst());
		System.out.println(n.getfirst().getSecond());
		

	}

}
