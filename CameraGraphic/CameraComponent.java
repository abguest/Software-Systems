import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D.Double;
import javax.swing.JComponent;
import java.awt.Polygon;

public class CameraComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2=(Graphics2D) g;
		
		//Draw main rectangle
		Rectangle box=new Rectangle(50,100,400,250);
		g2.setColor(Color.LIGHT_GRAY);
		g2.draw(box);
		g2.fill(box);
		
		//Draw smaller rectangle
		Rectangle small=new Rectangle(50,150,400,175);
		g2.setColor(Color.BLACK);
		g2.fill(small);
		
		//Draw main lens holder
		Ellipse2D.Double lens1=new Ellipse2D.Double(165,155,175,175);
		g2.setColor(Color.WHITE);
		g2.fill(lens1);
		
		//Draw a smaller lens holder
		Ellipse2D.Double lens2=new Ellipse2D.Double(170,160,165,165);
		g2.setColor(Color.BLACK);
		g2.fill(lens2);
		
		//Draw actual brown lens
		Ellipse2D.Double lens3=new Ellipse2D.Double(190,180,125,125);
		Color lightBrown= new Color(153,102,102);
		g2.setColor(lightBrown);
		g2.fill(lens3);
		
		//Draw lens glare
		Ellipse2D.Double glare=new Ellipse2D.Double(202,205,100,100);
		Color darkBrown=new Color(120,51,51);
		g2.setColor(darkBrown);
		g2.fill(glare);
		
		//Draw main flash holder
		Rectangle flash1=new Rectangle(140,112,80,25);
		g2.setColor(Color.WHITE);
		g2.fill(flash1);
		
		//Draw smaller flash holder
		Rectangle flash2=new Rectangle(145,117,70,15);
		g2.setColor(Color.BLACK);
		g2.fill(flash2);
		
		//Draw actual flasher
		Rectangle flash3=new Rectangle(167,122,20,5);
		g2.setColor(Color.GRAY);
		g2.fill(flash3);
		
		//Draw button1
		Rectangle button1=new Rectangle(60,85,40,15);
		g2.setColor(Color.BLACK);
		g2.fill(button1);
		
		//Draw button2
		Rectangle button2=new Rectangle(110,75,50,25);
		g2.setColor(Color.BLACK);
		g2.fill(button2);
		
		//Draw accessory holder
		Rectangle accessory1=new Rectangle(300,90,115,35);
		g2.setColor(Color.WHITE);
		g2.fill(accessory1);
		
		//Draw inside accessory holder
		Rectangle accessory2=new Rectangle(305,105,100,15);
		g2.setColor(Color.LIGHT_GRAY);
		g2.fill(accessory2);
		
		//Draw the greeting
		g2.setColor(Color.BLUE);
		g2.drawString("Say Cheese!",200,400);
		
		//Draw a trapezoid part
		g2.setColor(Color.LIGHT_GRAY);
		g2.fillPolygon( new Polygon // put this last                                 [11] 
                ( new int[] {  270, 320, 400, 450 }, 
                  new int[] { 100, 60, 60, 100 }, 
                  4
                )
             );
				
	}
}
