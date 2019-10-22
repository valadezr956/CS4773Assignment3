package shapes;

public abstract class Shape {
	
	protected int xPosition;
	protected int yPostiton;
	protected Color color;
	
	
	abstract public void draw();
	
	public void move(int x, int y) {
		xPosition = x;
		yPostiton = y;
	}
	
	public void color(String color) {
		
		try {
			this.color = Color.valueOf(color.toUpperCase());
		}
		catch(IllegalArgumentException e){
			//TODO add Shapes exception class or sansDrawing exception class
			System.err.println("Error string Color to Color convertion");
		}
		
	}
	
	abstract void delete();
	
}
