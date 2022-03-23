package OOPS1;

public class AccountClass  {
	private String ID;
	private String name;
	private int balance;
	
	//lets create the default constructor of Accountable class ===============================
	public AccountClass() {
		
	}
	//lets create the parameterise Constructor============================
	public AccountClass(String ID,String name,int balance) {
		this.ID=ID;
		this.name=name;
		this.balance=balance;
	}
	
	//lest create the getter and setter properties of the class ==================================
	
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance+=balance;
	}
	public int credit(int balance) {
		this.balance+=balance;
		return balance;
	}
	
	public int debit(int amount) {
		if(amount<=balance) {
			this.balance-=amount;
		}else {
			System.out.println("Amount exceed");
		}
		return balance;
	}
	
	public int transferTo(AccountClass A,int amount) {
		if(amount<=this.balance) {
			this.debit(amount);
			A.credit(amount);
			System.out.println("Amount is Credited Successfully");
			return this.balance;
		}else {
			System.out.println("Amount Exceed");
			return balance;
		}
	}
	
}
