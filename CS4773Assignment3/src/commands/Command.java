package commands;

import shapes.*;

public abstract class Command {
	
	public Shape shape;
	
	abstract public void execute();
	
	abstract public void undo();

}
