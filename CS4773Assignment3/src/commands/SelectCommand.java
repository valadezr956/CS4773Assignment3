package commands;

import invoker.*;
import shapes.*;

public class SelectCommand extends Command {
	
	private SansDrawing invoker;
	private int iShape;
	
	public SelectCommand(SansDrawing sansDrawing, int iShape) {
		invoker = sansDrawing;
		this.iShape = iShape;
	}
	
	
	@Override
	public void execute() {
		invoker.currentShape = invoker.shapes.get(iShape - 1);		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
