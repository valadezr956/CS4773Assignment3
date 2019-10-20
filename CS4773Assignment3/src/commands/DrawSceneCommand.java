package commands;

import shapes.Shape;
import java.util.*;

public class DrawSceneCommand extends Command{

	private List<Shape> shapes;
	
	public DrawSceneCommand(List<Shape> shapes) {
		this.shapes = shapes;
	}
	
	@Override
	public void execute() {
		for(Shape shape : shapes) {
			shape.draw();
		}	
	}

	@Override
	public void undo() {
		
	}

}
