import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;

public class CameraViewer extends JComponent{
	
	CameraComponent a, b, c;
	public CameraViewer() {
		this.a=new CameraComponent(20,50,0.3);
		this.b=new CameraComponent(220,20,0.5);
		this.c=new CameraComponent(40,230,0.4);
	}
	
	public void paintComponent(Graphics g) {
		a.draw(g);
		b.draw(g);
		c.draw(g);
	}
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(500,600);
		frame.setTitle("Lab 3 Assignment");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CameraViewer component= new CameraViewer();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
