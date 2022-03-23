package OOPS1;
import java.util.*;
import java.lang.*;
public class TheInvoiceItemClass implements Comparable<TheInvoiceItemClass>{
	
	private String ID;
	private String desc;
	private int qty;
	private int unitPrice;
	
	//lets create the Constructor of the given employe 
	public TheInvoiceItemClass() {
		
	}
	
	//lets create the parameterise constructor of TheInvoiceItemClass......
	
	public TheInvoiceItemClass(String ID,String desc,int qty,int unitPrice) {
		this.ID=ID;
		this.desc=desc;
		this.qty=qty;
		this.unitPrice=unitPrice;
	}
	
	//lets create the getter and setter of the class to access the data type of the class ======================
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID=ID;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc=desc;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	
	public int getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(int unitPrice) {
		this.unitPrice=unitPrice;
	}
	
	public double getTotal() {
		return unitPrice*qty;
	}
	
	//using comparator to sort the object according to their property getUnitPrice  ==============================
	public int compareTo(TheInvoiceItemClass item1) {
		
		if(this.getUnitPrice()>item1.getUnitPrice()) {
			return 1;
		}else if(this.getUnitPrice()==item1.getUnitPrice()) {
			return 0;
		}else {
			return -1;
		}
	}

}
