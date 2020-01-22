import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
//this component draws two rectangles
public class RectangleComponent extends JComponent{
	public void paintComponent(Graphics g) {
		//Recover graphics2D
		Graphics2D g2=(Graphics2D) g;
		
		//construct rectangle and draw
		Rectangle box=new Rectangle(5,10,20,30);
		g2.draw(box);
		
		//move rectangle 15 units right 25 units down
		box.translate(15, 25);
		
		//draw moved rectangle
		g2.draw(box);
	}

}
