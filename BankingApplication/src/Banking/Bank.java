package Banking;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account A1=new Account("12345",0.0,"Amit_Sharma","amitmzc77@gmail.com","7717726919");
		A1.DepositeMoney(100.0);
		A1.DepositeMoney(200.0);
		A1.withDrawMoney(500.0);
		A1.withDrawMoney(200.0);

	}

}
