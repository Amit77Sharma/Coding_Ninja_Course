package OOPS1;

public class Employe implements Comparable<Employe>{
	
	private int ID;
	private String first;
	private String last;
	private double Salary;
	
	//lets create the default constructor ====
	public Employe() {
		
	}
	
	//lets create the parameterise Constructor ===============
	
	public Employe(int ID,String first,String last,double Salary) {
		this.ID=ID;
		this.first=first;
		this.last=last;
		this.Salary=Salary;
	}
	
	//lets create the getter and setter to access the private data;;
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID=ID;
	}
	
	public String getFirst() {
		return first;
	}
	
	public void setFirst(String first) {
		this.first=first;
	}
	
	public String getLast() {
		return last;
	}
	
	public void setLast(String last) {
		this.last=last;
	}
	
	public String getName() {
		return first+last;
	}
	
	public double getAnnualSalary() {
		return 12*Salary;
	}
	
	public double getraisePercent() {
		double percent=(Salary*10)/100;
		return percent;
	}
	
	public int compareTo(Employe e2) {
		if(this.getAnnualSalary()>e2.getAnnualSalary()) {
			return 1;
		}else if(this.getAnnualSalary()==e2.getAnnualSalary()) {
			return 0;
		}else {
			return -1;
		}
	}
	
}
