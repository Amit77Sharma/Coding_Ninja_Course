package OOPS1;

public class Book {
	private String name;
	private Auther auther;
	private double price;
	private int qty=0;
	
	//lets create the Book parameterise constructor with the authers..
	public Book(String name,Auther auther,double price) {
		this.name=name;
		this.auther=auther;
		this.price=price;
	}
	public Book(String name,Auther auther,double price,int qty) {
		this.name=name;
		this.auther=auther;
		this.price=price;
		this.qty=qty;
	}
	
	//lets create the getter and setter of the Books Class..
	public String getName() {
		return name;
	}
	public Auther getAuther() {
		Auther a1=this.auther;
		return a1;
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
		return "Book[name=" +name+ "," +auther.toString() +",price= " +price+ " qty = " +qty+ "]";
	}

}
