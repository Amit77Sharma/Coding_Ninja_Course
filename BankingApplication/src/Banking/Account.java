package Banking;

public class Account {
	
	private String Accountnumber;
	private double Balance;
	private String name;
	private String Email;
	private String phoneNumber;
	
	public Account(String Accountnumber, double balance, String name, String email, String phoneNumber) {
		super();
		this.Accountnumber = Accountnumber;
		this.Balance = balance;
		this.name = name;
		this.Email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getNumber() {
		return Accountnumber;
	}

	public void setNumber(String Accountnumber) {
		this.Accountnumber = Accountnumber;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public void DepositeMoney(double depositedMoney) {
		this.Balance+=depositedMoney;
		System.out.println("Deposit is successful, new Balance is "+ this.Balance);
	}
	
	public void withDrawMoney(double withdraw) {
		if(this.Balance-withdraw<0) {
			System.out.println("Withdraw unsuccessful "+this.Balance);
		}else {
			this.Balance-=withdraw;
			System.out.println("withdraw is successful, Remaining Balance is "+this.Balance);
		}
	}
	
	
}
