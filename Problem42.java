import java.awt.event.MouseEvent;

import acm.graphics.GLine;
import acm.program.GraphicsProgram;

//42. Paint-ის მონაკვეთის ხატვის გაკეთება, ჯერ აჭერ მაუსს, ფიქსირდება ერთი წვერო, მერე
//მაუსის მოძრაობისას მონაკვეთიც მოძრაობს რადგან მეორე წვერო არაა დაფიქსირებული და
//კლიკით ფიქსირდება მეორე წვეროც.
public class Problem42 extends GraphicsProgram{
	private GLine line;
	public void run(){
		addMouseListeners();
	}
	
	@Override
	public void mousePressed(MouseEvent e ){
		line = new GLine( e.getX(), e.getY(), e.getX(), e.getY());
		add(line);
	}
	
	@Override
	public void mouseMoved(MouseEvent e ){
		line.setEndPoint(e.getX(), e.getY());
		
	}
	
	

}
