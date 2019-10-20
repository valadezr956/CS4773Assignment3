package commands;

import shapes.*;

public class DrawCommand extends Command{

	private Shape shape;
	
	public DrawCommand(Shape shape) {
		this.shape = shape;
	}
	
	@Override
	public void execute() {
		shape.draw();
	}

	@Override
	public void undo() {
		
	}

}
