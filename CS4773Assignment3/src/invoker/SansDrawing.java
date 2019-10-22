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
	
	public void execute(Command command) {
		commandHistory.push(command);
		command.execute();
	}
	
	public void undo() {
		if(!commandHistory.isEmpty()) {
			Command previousCommand = commandHistory.pop();
			//TODO get next previous instanceof previouscommand and execute again to undo
			//Special cases on some commands
		}
		
	}

}
