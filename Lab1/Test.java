import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test
{
  public static void main(String[] args) throws Exception
  {
    //R1.7, R1.8, R1.9
//    System.out.println("39+3");
//    System.out.println(39+3);
//    System.out.print("Hello");
//    System.out.println("World");
//    System.out.println("Hello","World!");
    //E1.8
//      System.out.println("  /////");
//      System.out.println(" |/////|");
//      System.out.println("(| o o |)");
//      System.out.println(" |  u  |");
//      System.out.println(" | 'O' |");
//      System.out.println(" +-----+");
    //E1.18
    URL imageLocation = new URL(
           "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Rotating_earth_%28large%29.gif/200px-Rotating_earth_%28large%29.gif");
    JOptionPane.showMessageDialog(null, "Hello. Welcome!", "Title",
          JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
  }
}
// R1.7 the program prints the following:
//39+3
//42
//R1.8 the program prints the following:
//HelloWorld
//R1.9 The compile-time error is in the syntax of using a comma between two strings.
     //This type of syntax is not applicable for the given arguments.
