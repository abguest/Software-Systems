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
	int x,y;
	double scale;
	
	public CameraComponent(int x, int y, double scale) {
		this.x=x;
		this.y=y;
		this.scale=scale;			
	}
	
	private int scale(int size) {
		return (int)(this.scale*size);
	}
	
	public void draw(Graphics g) {
		int left=6;
		
		Graphics2D g2=(Graphics2D) g;
		
		//Draw main rectangle
		Rectangle box=new Rectangle(x+scale(50-left),y+scale(100),scale(400),scale(250));
		g2.setColor(Color.LIGHT_GRAY);
		g2.draw(box);
		g2.fill(box);
		
		//Draw smaller rectangle
		Rectangle small=new Rectangle(x+scale(50-left),y+scale(150),scale(400),scale(175));
		g2.setColor(Color.BLACK);
		g2.fill(small);
		
		//Draw main lens holder
		Ellipse2D.Double lens1=new Ellipse2D.Double(x+scale(165-left),y+scale(155),scale(175),scale(175));
		g2.setColor(Color.WHITE);
		g2.fill(lens1);
		
		//Draw a smaller lens holder
		Ellipse2D.Double lens2=new Ellipse2D.Double(x+scale(170-left),y+scale(160),scale(165),scale(165));
		g2.setColor(Color.BLACK);
		g2.fill(lens2);
		
		//Draw actual brown lens
		Ellipse2D.Double lens3=new Ellipse2D.Double(x+scale(190-left),y+scale(180),scale(125),scale(125));
		Color lightBrown= new Color(153,102,102);
		g2.setColor(lightBrown);
		g2.fill(lens3);
		
		//Draw lens glare
		Ellipse2D.Double glare=new Ellipse2D.Double(x+scale(202-left),y+scale(205),scale(100),scale(100));
		Color darkBrown=new Color(120,51,51);
		g2.setColor(darkBrown);
		g2.fill(glare);
		
		//Draw main flash holder
		Rectangle flash1=new Rectangle(x+scale(140-left),y+scale(112),scale(80),scale(25));
		g2.setColor(Color.WHITE);
		g2.fill(flash1);
		
		//Draw smaller flash holder
		Rectangle flash2=new Rectangle(x+scale(145-left),y+scale(117),scale(70),scale(15));
		g2.setColor(Color.BLACK);
		g2.fill(flash2);
		
		//Draw actual flasher
		Rectangle flash3=new Rectangle(x+scale(167-left),y+scale(122),scale(20),scale(5));
		g2.setColor(Color.GRAY);
		g2.fill(flash3);
		
		//Draw button1
		Rectangle button1=new Rectangle(x+scale(60-left),y+scale(85),scale(40),scale(15));
		g2.setColor(Color.BLACK);
		g2.fill(button1);
		
		//Draw button2
		Rectangle button2=new Rectangle(x+scale(110-left),y+scale(75),scale(50),scale(25));
		g2.setColor(Color.BLACK);
		g2.fill(button2);
		
		//Draw accessory holder
		Rectangle accessory1=new Rectangle(x+scale(300-left),y+scale(90),scale(115),scale(35));
		g2.setColor(Color.WHITE);
		g2.fill(accessory1);
		
		//Draw inside accessory holder
		Rectangle accessory2=new Rectangle(x+scale(305-left),y+scale(105),scale(100),scale(15));
		g2.setColor(Color.LIGHT_GRAY);
		g2.fill(accessory2);
		
		//Draw the greeting
		//g2.setColor(Color.BLUE);
		//g2.drawString("Say Cheese!",200,400);
		
		//Draw a trapezoid part
		g2.setColor(Color.LIGHT_GRAY);
		g2.fillPolygon( new Polygon // put this last                                 [11] 
                ( new int[] {  x+scale(270), x+scale(320), x+scale(400), x+scale(450) }, 
                  new int[] { y+scale(100), y+scale(60), y+scale(60), y+scale(100) }, 
                  4
                )
             );
				
	}
}
