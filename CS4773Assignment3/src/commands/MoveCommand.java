package commands;

import shapes.*;

public class MoveCommand extends Command{

	private int x;
	private int y;
	
	public MoveCommand(Shape shape, int x, int y) {
		this.shape = shape;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void execute() {
		shape.move(x, y);
	}

	@Override
	public void undo() {
		
	}

}
