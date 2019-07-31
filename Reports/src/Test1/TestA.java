package Test1;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.util.concurrent.TimeUnit;

public class TestA {
	
	public void mouseClicked(MouseEvent e) {
	    int x=e.getX();
	    int y=e.getY();
	    System.out.println(x+","+y);//these co-ords are relative to the component
	}

    public static void main(String[] args) throws InterruptedException, AWTException {

    	double mouseX = 0.0;
    	double mouseY = 0.0;
    	
        //get cords of mouse code, outputs to console every 1/2 second
        //make sure to import and include the "throws in the main method"
    	
        	
      
        mouseX = MouseInfo.getPointerInfo().getLocation().getX();
        mouseY = MouseInfo.getPointerInfo().getLocation().getY();
      
        
        System.out.println("X:" + mouseX);
        System.out.println("Y:" + mouseY);
        //make sure to import 
        
        
       Robot robot = new Robot();
    	robot.mouseMove(675,226);
    }   	
    	

}
