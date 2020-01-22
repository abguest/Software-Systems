import java.awt.Graphics;
import javax.swing.JFrame; 
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.io.InputStream;

public class Game implements World{
	Food food;

	Snake snake;
	int times;
	
	boolean doubleSpeed = false;

	public Game() {
		this.snake = new Snake(50, 80, "east");
		this.food = new Food();
	}

	public void draw(Graphics g) {
		Font font = new Font("SansSerif", Font.BOLD, 20);
		g.setFont(font);
		g.setColor(Color.BLACK);
		g.drawString("Score: " + this.times + "", 20, 40);

		//g.drawString("(" + this.snake.x() + ", " + this.snake.y() + ")", 140, 180);

		
		this.snake.draw(g);
		this.food.show(g);

	}

	public void actualice() {
		int speed = doubleSpeed ? 2 : 1;
		for (int s = 0; s < speed; s++)
		{
			this.snake.move();
			
			ArrayList<Circle> toDelete = new ArrayList<>();
			int foodsToAdd = 0;
			for (Circle c : food.data)
			{
				if(c.collidesWith(snake.getHead()))
				{
					toDelete.add(c);
					foodsToAdd++;
					snake.expandSnake();
					this.times++;
				}
			}
			food.data.removeAll(toDelete);
			for (int i = 0; i < foodsToAdd; i++)
				food.generateFood();
		}
		
	}

	public void keh(KeyEvent e) {
		int EAST = 39;
		// System.out.println( e.getKeyCode() );
		int code = e.getKeyCode();
		if (code == 37) { // West
			this.snake.setDirection("west");
		} else if (code == KeyEvent.VK_UP) { // North or 38 (not VK_KP_UP
			this.snake.setDirection("north");
		} else if (code == EAST) {
			this.snake.setDirection("east");
		} else if (code == 40) { // South
			this.snake.setDirection("south");
		} else if (code == KeyEvent.VK_B) {
			doubleSpeed = true;
		} else {
			this.snake.setDirection("no direction");
			// System.out.println( KeyEvent.VK_UP );
		}
	}

	public static void main(String[] args) {
		BigBang b = new BigBang(150, new Game());
		JFrame f = new JFrame();
		f.add(b);
		f.addKeyListener(b);
		f.setSize(400, 400);
		f.setVisible(true);
		b.start();
	}

	@Override
	public boolean gameOver() {
		for (Circle c : snake.getBody())
		{
			if (c.collidesWith(snake.getHead()))
			{
				return true;
			}
		}
		
		if (snake.x < 0 || snake.x > 400 ||
				snake.y < 0 || snake.y > 400)
			return true;
		
		return false;
	}
}
