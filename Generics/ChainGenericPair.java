package Generics;

public class ChainGenericPair<T,S> {
	
	private T firstpair;
	private S secondpair;
	
	public ChainGenericPair(){
		
	}
	
	public ChainGenericPair(T firstpair,S secondpair) {
		this.firstpair=firstpair;
		this.secondpair=secondpair;
	}
	
	
	public T getfirst()
	{
		return firstpair;
	}
	
	public void setfirst(T firstpair) {
		this.firstpair=firstpair;
	}
	
	public S getSecond()
	{
		return secondpair;
	}
	
	public void setSecond(S secondpair)
	{
		this.secondpair=secondpair;
	}
	
	

}
