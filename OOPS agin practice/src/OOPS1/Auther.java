package OOPS1;

public class Auther {

	private String name;
	private String email;
	private char gender;
	//parameterise constructor ===
	public Auther(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	//lets create the getter and setter 
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public char getGender() {
		return gender;
	}
	public String toString() {
		return "Auther[ name=" +name+ " , email= "+email+" ,gender= "+gender+"]";
	}
}
