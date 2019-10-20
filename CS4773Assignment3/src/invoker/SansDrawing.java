package invoker;

import java.util.*;
import commands.*;
import shapes.*;

public class SansDrawing {
	
	
	private Stack<Command> commandHistory;
	public List<Shape> shapes;
	
	public Shape currentShape;
	
	public SansDrawing() {
		commandHistory = new Stack<Command>();
		shapes = new ArrayList<Shape>();
	}
	
	public void create(Shape shape) {
		//call create with execute() to add to commandHistory just in case you need undo back to once of this initials commands
		//TODO might be a better way maybe put a static command History in each command class
		execute(new CreateCommand());
		execute(new MoveCommand(shape, 0, 0));
		
		if(shape instanceof Circle) {
			execute(new ColorCommand(shape, "Blue"));
		}
		else {
			execute(new ColorCommand(shape, "Red"));
		}
	}
	
	public void execute(Command command) {
		commandHistory.push(command);
		command.execute();
	}
	
	public void undo() {
		Command previousCommand = commandHistory.pop();
		//TODO get next previous instanceof previouscommand and execute again to undo
		//Special cases on some commands
	}

}
