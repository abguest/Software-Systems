import javax.swing.JOptionPane;
public class DialogViewer
{
  public static void main(String[] args)
  {
    //E1.15
    //JOptionPane.showMessageDialog(null, "Hello, Abbie!");
    //E1.16 and E1.17
    String name = JOptionPane.showInputDialog("What is your name?");
    System.out.println("Hello, " + name + "! My name is Hal! What would you like me to do?");
    System.out.println("I'm sorry, " + name + " I'm afraid I can't do that.");  
    
  }
}