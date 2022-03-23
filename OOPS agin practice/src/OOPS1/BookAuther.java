package OOPS1;

public class BookAuther {

	public static void main(String[] args) {
		//lets crete the book and Auther class
		Auther au=new Auther("Amit","amitmzc77@gmail.com",'m');
		Book b1=new Book("microprocessor",au,200.0,1);
		System.out.println(b1.getAuther());
		System.out.println(b1.toString());
		System.out.println(b1.getName());
		b1.setPrice(20);
		System.out.println(b1.getPrice());
		System.out.println("Authers name  is "+b1.getAuther().getName());
	}

}
