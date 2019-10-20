package commands;

import shapes.*;

public class SelectCommand extends Command {
	
	private int nShape;
	
	public SelectCommand(int i) {
		nShape = i;
	}
	
	
	@Override
	public void execute() {
		// TODO somehow get the static SansDrawing.currentShape and set it new Shape		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
