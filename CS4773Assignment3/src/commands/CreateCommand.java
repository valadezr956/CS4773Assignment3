package commands;

import invoker.SansDrawing;
import shapes.Circle;
import shapes.Shape;

public class CreateCommand extends Command {

    private SansDrawing invoker;

    
    public CreateCommand(SansDrawing invoker, Shape shape) {
    	this.invoker = invoker;
    	this.shape = shape;
    }
	
	@Override
	public void execute() {
		
		invoker.shapes.add(this.shape);
		
		invoker.execute(new MoveCommand(shape, 0, 0));
    	
    	if(shape instanceof Circle) {
			invoker.execute(new ColorCommand(shape, "Blue"));
		}
		else {
			invoker.execute(new ColorCommand(shape, "Red"));
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
