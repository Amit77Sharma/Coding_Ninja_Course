package OOPS1;

public class Ractangle {
	
	private float length;
	private float width;
	//default Constructor==============================
	public Ractangle() {
		length=1.0f;
		width=1.0f;
	}
	//lets create the parameterise constructor =================
	public Ractangle(float length,float width) {
		this.length=length;
		this.width=width;
	}
	
	//lets create the getter and setter to accress the private data created types ===============
	
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		this.length=length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width=width;
	}
	
	public float getArea() {
		return length*width;
	}
	
	public float getParameter() {
		return 2*(length+width);
	}

}
