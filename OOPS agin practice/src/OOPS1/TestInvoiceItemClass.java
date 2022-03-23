package OOPS1;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class TestInvoiceItemClass {

	public static void main(String[] args) {
		
		//lets create the referece of TheInvoiceItemCalss
		
		TheInvoiceItemClass item1;
		
		ArrayList<TheInvoiceItemClass> array=new ArrayList<TheInvoiceItemClass>();
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println("Enter the ID");
			String ID=sc.nextLine();
			System.out.println("Ente the desc ");
			String desc=sc.nextLine();
			System.out.println("Enter the qty");
			int qty=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the unitPrice");
			int unitPrice=sc.nextInt();
			sc.nextLine();
			item1=new TheInvoiceItemClass(ID,desc,qty,unitPrice);
			array.add(item1);
		}
		//printing the value stored in the items===========================
		Collections.sort(array);
		for(TheInvoiceItemClass arr:array) {
			System.out.print("ID of the product is "+arr.getID()+"|");
			System.out.print(" Desc of the product is "+arr.getDesc()+"|");
			System.out.print(" Quantity of the product is "+arr.getQty()+"|");
			System.out.print(" unitprice of Each Item is "+arr.getUnitPrice()+"|");
			System.out.print(" The toatl price is "+arr.getTotal()+"|");
			System.out.println();
		}
	}

}
