import javax.swing.JFrame;

public class CameraViewer {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(500,600);
		frame.setTitle("Lab 2 Assignment");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CameraComponent component= new CameraComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
