package OOPS1;

public class TheTimeClass {
	
	private int second;
	private int minute;
	private int hour;
	//lets create the constructor of theis class==========================
	public TheTimeClass(){
		
	}
	//lets create the parameterise constructor ===========================
	public TheTimeClass(int second,int minute,int hour) throws TimeExceedException {
		if(second<0 || second>59) {
			throw new TimeExceedException();
		}else {
			this.second=second;
		}
		if(minute<0 || minute>59) {
			throw new TimeExceedException();
		}else {
			this.minute=minute;
		}
		if(hour<0 || hour>23) {
			throw new TimeExceedException();
		}else {
			this.hour=hour;
		}
	}
	//lets create the getter and setter to assign the value to the private property============================
	public void setSecond(int second) throws TimeExceedException {
		if(second<0 || second>59) {
			throw new TimeExceedException();
		}else {
			this.second=second;
		}
	}
	public int getSecond() {
		return second;
	}
	public void setMinute(int minute) throws TimeExceedException {
		if(minute<0 || minute>59) {
			throw new TimeExceedException();
		}else {
			this.minute=minute;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setHour(int hour) throws TimeExceedException {
		if(hour<0 || hour>23) {
			throw new TimeExceedException();
		}else {
			this.hour=hour;
		}
	}
	public int getHour() {
		return hour;
	}
	public void setTime(int second,int minute,int hour) throws TimeExceedException{
		if(second<0 || second>=59) {
			throw new TimeExceedException();
		}else {
			this.second=second;
		}
		
		if(minute<0 || minute>59) {
			throw new TimeExceedException();
		}else {
			this.minute=minute;
		}
		if(hour<0 || hour>23) {
			throw new TimeExceedException();
		}else {
			this.hour=hour;
		}
	}
	public String toString() {
		return second+":"+minute+":"+hour;
	}
	public String nextSecond() throws TimeExceedException{
		this.second=this.second+1;
		this.setTime(this.second, this.minute,this.hour);
		return second+":"+minute+":"+hour;
	}
	
	public String prevoiusSecond() throws TimeExceedException{
		this.second=this.second-1;
		this.setTime(this.second,this.minute,this.hour);
		return second+":"+minute+":"+hour;
	}
}
