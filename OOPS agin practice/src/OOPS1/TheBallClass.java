package OOPS1;

public class TheBallClass {
	
	private float x;
	private float y;
	private int radius;
	private float xdelta;
	private float ydelta;
	//lets create the constructor of TheBallClass ===============================================
	public TheBallClass() {
		
	}
	//lets create the default constructor =============================================
	public TheBallClass(float x,float y,int radius,float xdelta,float ydelta) {
		this.x=x;
		this.y=y;
		this.radius=radius;
		this.xdelta=xdelta;
		this.ydelta=ydelta;
	}
	//lets create the getter and setter of the class property ================================
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public float getXdelta() {
		return xdelta;
	}
	
	public void setXdelta(float xdelta) {
		this.xdelta = xdelta;
	}
	
	public float getYdelta() {
		return ydelta;
	}
	
	public void setYdelta(float ydelta) {
		this.ydelta = ydelta;
	}
	
	//move function =======================
	public void move() {
		x=x+xdelta;
		y=y+ydelta;
	}
	
	public void refelectHorizontal() {
		xdelta = -xdelta;
	}
	
	public void refelectVerticle() {
		ydelta = -ydelta;
	}
	
	public String toString() {
		return "Ball[( "+x+ "," +y+" ) "+", Speed=("+xdelta+","+ydelta+")]";
	}
}
