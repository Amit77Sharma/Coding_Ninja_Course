
//Suppose this the class of circle and
package OOPS1;
public class Circle {
	
	private double radius;
	private String color;
	
	//lets define the default constructor of circle ====================================
	public Circle() {
		radius=1.0;
		color="red";
	}
	
	//lets overload the default constructor ===============================	
	public Circle(double radius) {
		this.radius=radius;
		color="red";
	}

	//lets create the getter and setter to access the value of the radius==============
	public double getRadius() {
		return radius;
	}
	
	//lets create the getter to get the color of the String===================================
	public String getColor() {
		return color;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	//lest set the color of the circle by using the setter finction=====================
	
	public void setColor(String color) {
		this.color=color;
	}
	
	
	
}
