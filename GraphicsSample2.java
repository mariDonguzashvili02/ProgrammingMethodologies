import java.awt.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class GraphicsSample2 extends GraphicsProgram{
	private static final int PAUSE_MS = 20;
	private final static int VEL_X = 3;
	public void run(){
		
		GRect myRect = new GRect(100,200);
		myRect.setFilled(true);
		add(myRect, 100, 150);
		
		myRect.setColor(Color.RED);
		pause(PAUSE_MS);
//		myRect.setColor(Color.BLUE);
//		
//		myRect.setLocation(200, 250);
//		myRect.move(200, 250);
		
		
		int finalX = 200;
		int vx = VEL_X;
		int vy = 0;
		
		while(myRect.getX() <= finalX - vx){
			myRect.move(vx, vy);
			pause(PAUSE_MS);
		}
	}

}
