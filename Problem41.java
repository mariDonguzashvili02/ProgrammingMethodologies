import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

//41. გააკეთეთ Paint-ის ფანქრის ანალოგიური ხელსაწყო. კერძოდ, მაუსის ყოველ მოძრაობაზე
//ეკრანზე დაამატეთ გაფერადებული წრეწირები იმავე წერტილში სადაც მაუსი 
//მდებარეობს.
public class Problem41 extends GraphicsProgram {
	private static final int RADIUS = 20;
	public void run() {
		
		addMouseListeners();
	}
	
	public void mouseDragged(MouseEvent e) {
		GOval circle = new GOval(2 * RADIUS, 2*RADIUS);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		add(circle, e.getX() - RADIUS, e.getY() - RADIUS);

	}
	
	public void mousePressed(MouseEvent e) {
		GOval circle = new GOval(2 * RADIUS, 2 * RADIUS);
		circle.setFilled(true);
		circle.setColor(Color.RED);
		add(circle, e.getX() - RADIUS, e.getY() - RADIUS);

	}
}
