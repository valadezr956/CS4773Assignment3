package shapes;

public class Circle extends Shapes {
	
	private int radius;
	
	
	public Circle(int radius) {
		this.radius = radius;
		this.color = Color.BLUE;
		this.xPosition = 0;
		this.yPostiton = 0;
	}
	
	
	public void draw() {
		String.format("Circle, Color: %s, Origin: (%d,%d), Radius: %d", color, xPosition, yPostiton, radius);
	}
	
	public void delete() {
		
	}

}
