import java.util.*;
import java.lang.*;
public class Solution{
public class Fabric{
	int id;
	String name;
	int availableStock;
	double price;
	Fabric(int id,String name,int availableStock,double price){
		this.id=id;
		this.name=name;
		this.availableStock=availableStock;
		this.price=price;
	}
	public void setID(int id) {
		this.id=id;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setavailabelStock(int availableStock) {
		this.availableStock=availableStock;
	}
	public void setprice(double price) {
		this.price=price;
	}
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	//Solution sl=new Solution();
	int n=sc.nextInt();
	Fabric[] f=new Fabric[n];
	for(int i=0; i<n; i++)
	{
		int id=sc.nextInt();
		String name=sc.nextLine();
		int availableStock=sc.nextInt();
		double price=sc.nextDouble();
		f[i]=new Fabric(id,name,availableStock,price);
	}
	String nm=sc.nextLine();
	Fabric fm=findFabricWithMaximumPrice(f);
	if(fm!=null) {
		System.out.println("id:"+fm.id);
		System.out.println("name:"+fm.name);
		System.out.println("availableStock:"+fm.availableStock);
		System.out.println("price:"+fm.price);
	}
	else
	{
		System.out.println("no fabric found with mentioned asttributes ");
	}
	
	Fabric fn=searchGabricByName(f,nm);
	if(fn!=null) {
		System.out.println("id:"+fn.id);
		System.out.println("name:"+fn.name);
		System.out.println("avialableStock:"+fn.avaialbleStock);
		System.out.println("price:"+fn.price);
		
	}
	else
	{
		System.out.println("no fabric found with mentioned attrinutes");
	}
}

	public static int findFabricWithMaximumPrice(Fabric[] f){
		int l=f.length;
		doublemp=f[0].price;
		Fabric ans=null;
		for(int i=0; i<l; i++)
		{
			if(f[i].price>=mp)
			{
				ans=f[i];
			}
		}
		return ans;
	}
	
	public static Fabric searchFabricByName(Fabric[] f, String nm){
		int l=f.length;
		for(int i=0; i<l; i++)
		{
			if(nm.equals(f[i].name))
			{
				return f[i];
			}
		}
		return null;
		
	}	
}