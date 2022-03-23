package OOPS1;

public class AdvanceBook {
	private String name;
	private Auther[] auther;
	private double price;
	private int qty;
	
	//lets create the constructor of the advance book-============
	public AdvanceBook(String name,Auther[] auther,double price) {
		this.name=name;
		this.auther=auther;
		this.price=price;
	}
	
	public AdvanceBook(String name,Auther[] auther, double price,int qty) {
		this.name=name;
		this.auther=auther;
		this.price=price;
		this.qty=qty;
	}
	//lets create the getter and setter of the properties of the class ===
	public String getName() {
		return name;
	}
	public Auther[] getAuther() {
		return auther;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public String toString() {
		return "Book[ name= " +name+ "," +auther[0].toString()+ ",price="+price+ ",qty=" +qty+"]";
	}
	public String getAutherNames() {
		return auther[0].getName();
	}
	
}
