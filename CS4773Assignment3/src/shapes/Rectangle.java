package shapes;

public class Rectangle extends Shapes {
	
	private int width;
	private int height;

	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		this.xPosition = 0;
		this.yPostiton = 0;
		this.color = Color.RED;
	}
	
	public void draw() {
		String.format("Rectangle, Color: %s, Origin: (%d,%d), Width: %d, Height: %d", color, xPosition, yPostiton, width, height);
	}
	
	public void delete() {
		
	}
	
}
