package main;

import shapes.*;
import commands.*;
import invoker.*;

public class Launcher {
	public static void main(String args[]) 
    {   
        //Probably only  once instance of this
        //could maybe make it a singleton
        SansDrawing drawing = new SansDrawing();
        
        //Probably some kind of builder to perform a this below per command, since it's going be similar per command
	        Shape shape = new Circle(5);
	        
	        
	        //test create Command
	        Command createCommand = new CreateCommand(drawing, shape);	       
	        drawing.execute(createCommand);
	        
	        
	        //Test Select Command
	        Command selectCommand = new SelectCommand(drawing, 1);
	        drawing.execute(selectCommand);
	        
	        
	        
	        Command moveCommand  = new MoveCommand(drawing.currentShape, 5, 4);
	        drawing.execute(moveCommand);
	        
	        
	       //Test right output
	        Command drawCommand = new DrawCommand(drawing.currentShape);
	        
	        drawing.execute(drawCommand);
	        
	        //Test color command
	        Command colorCommand =  new ColorCommand(drawing.currentShape, "Yellow");
	        
	        drawing.execute(colorCommand);
	        drawing.execute(drawCommand);
	        
	        
        
        
        
    } 
}
