package shapes;

public class Circle extends Shape {
	
	private int radius;
	
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	public void draw() {
		System.out.println(String.format("Circle, Color: %s, Origin: (%d,%d), Radius: %d", color, xPosition, yPostiton, radius));
	}
	
	public void delete() {
		
	}

}
