package commands;


import shapes.*;

public class ColorCommand extends Command {

	private String color;
	
	public ColorCommand(Shape shape, String color) {
		this.shape = shape;
		this.color = color;
	}
	
	@Override
	public void execute() {
		shape.color(color);		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
