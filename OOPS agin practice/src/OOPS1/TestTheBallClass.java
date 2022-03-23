package OOPS1;

public class TestTheBallClass {

	public static void main(String[] args) {
		
		//lets create the object of TheBallClass..====
		
		TheBallClass ball=new TheBallClass(1.1f, 2.2f, 10, 3.3f, 4.4f);
		System.out.println(ball);  // toString()

	      // Test Setters and Getters
	      ball.setX(80.0f);
	      ball.setY(35.0f);
	      ball.setRadius(5);
	      ball.setXdelta(4.0f);
	      ball.setYdelta(6.0f);
	      System.out.println(ball);  // toString()
	      System.out.println("x is: " + ball.getX());
	      System.out.println("y is: " + ball.getY());
	      System.out.println("radius is: " + ball.getRadius());
	      System.out.println("xDelta is: " + ball.getXdelta());
	      System.out.println("yDelta is: " + ball.getYdelta());
	      
	      float xMin = 0.0f;
	      float xMax = 100.0f;
	      float yMin = 0.0f;
	      float yMax = 50.0f;
	      for (int i = 0; i < 15; i++) {
	         ball.move();
	         System.out.println(ball);
	         float xNew = ball.getX();
	         float yNew = ball.getY();
	         int radius = ball.getRadius();
	         // Check boundary value to bounce back
	         if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
	            ball.refelectHorizontal();
	         }
	         if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
	            ball.refelectVerticle();
	         }
	      }
	}

}
