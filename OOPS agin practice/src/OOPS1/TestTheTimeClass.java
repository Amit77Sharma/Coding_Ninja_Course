package OOPS1;

public class TestTheTimeClass {

	public static void main(String[] args) throws TimeExceedException {
		
		//lets create the sobject of the time=============
		
		TheTimeClass time=new TheTimeClass();
		
		  time.setHour(4);
	      time.setMinute(5);
	      time.setSecond(6);
	      System.out.println(time);  // toString()
	      System.out.println("Hour: " + time.getHour());
	      System.out.println("Minute: " + time.getMinute());
	      System.out.println("Second: " + time.getSecond());

	      // Test setTime()
	      time.setTime(23,59,58);
	      System.out.println(time);  // toString()

	      // Test nextSecond();
	      System.out.println(time.nextSecond());
	      System.out.println(time.nextSecond());

	      // Test previousSecond()
	      System.out.println(time.prevoiusSecond());
	      System.out.println(time.prevoiusSecond());
	   }

}
