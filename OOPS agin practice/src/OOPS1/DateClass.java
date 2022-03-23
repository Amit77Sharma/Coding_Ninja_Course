package OOPS1;

public class DateClass {
	private int day;
	private int month;
	private int year;
	
	//default constructor ==================================================
	public DateClass() {
		
	}
	
	//parameterise constructor-==========================================================
	public DateClass(int day, int month, int year) throws DateException{
		if(day>31 || day<1) {
			throw new DateException();
		}else {
			this.day = day;
		}
		
		if(month>12 || month<1) {
			throw new DateException();
		}else {
			this.month = month;
		}
		
		if(year>9999 || year<1999) {
			throw new DateException();
		}else {
			this.year = year;
		}
	}
	
	//creted getter and setter ===============================================================
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) throws DateException {
		if(day>31 || day<1) {
			throw new DateException();
		}else {
			this.day = day;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) throws DateException {
		if(month>12 || month<1) {
			throw new DateException();
		}else {
			this.month = month;
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) throws DateException {
		if(year>9999 || year<1900) {
			throw new DateException();
		}else {
			this.year = year;
		}
	}	
	
	public String toString() {
		return "Day"+day+ "/Month "+month+"/year "+year;
	}
}
