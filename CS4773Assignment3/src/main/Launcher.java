package main;

import shapes.*;
import commands.*;
import invoker.*;

public class Launcher {
	public static void main(String args[]) 
    { 
        System.out.println("Hello, World"); 
        
        //Probably only  once instance of this
        SansDrawing drawing = new SansDrawing();
        
        //Probably some kind of builder to perform a this below per command
	        Shape shape = new Circle(5);
	        
	        //Don't really like the create in the SansDrawing class feel it should be more of a command
	        drawing.create(shape);
	        
	        Command moveCommand  = new MoveCommand(shape, 5, 4);
	        drawing.execute(moveCommand);
        
        
        
    } 
}
