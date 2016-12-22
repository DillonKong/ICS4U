package DodgeBall;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * @version Nov. 2015    
 * 
 * @author Christina Kemp adapted from Sam Scott */
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements Runnable, MouseMotionListener
{
	int mouseX = 0, mouseY = 0;
	int lives = 3;
	int width = 1900, height = 950;
	int numBalls = 45;
	final int pauseDuration = 0;

	FlashingBall[] ball = new FlashingBall[numBalls];
	
	public static void main(String[] args) {
		// Set up main window (using Swing's Jframe)
		JFrame frame = new JFrame("Dodgeball");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500, 300));
		frame.setAutoRequestFocus(false);
		frame.setVisible(true);
		Container c = frame.getContentPane();
		c.add(new GamePanel());
		frame.pack();
	}

	public GamePanel(){
		// Start the ball bouncing (in its own thread)
		this.setPreferredSize(new Dimension(width, height));
		this.setBackground(Color.WHITE);

		for (int i = 0; i < numBalls; i++) {
			ball[i] = new FlashingBall(950, 475, 0, width, 0, height);
			ball[i].setXSpeed(Math.random() * 16-8);
			ball[i].setYSpeed(Math.random() * 16-8);
			ball[i].setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
		}

		addMouseMotionListener(this);
		Thread gameThread = new Thread(this);
		gameThread.start();

	}

	/**
	 * Repaints the frame periodically.
	 */
	public void run() 
	{
		while (true) 
		{
			this.requestFocus();
			updateLives(getGraphics());

			for (int i = 0; i < ball.length; i++) 
			{
				if (checkHit(ball[i])) 
				{
					lives --;

					for (i = 0; i < ball.length; i ++)
					{	
						ball[i].stopThread();
						this.setBackground(Color.RED);
						updateLives(getGraphics());
					}

					try {
						Thread.sleep(1250);
					} catch (InterruptedException e) {
					}

					for (i = 0; i < ball.length; i ++)
					{						
						ball[i].startThread();
						this.setBackground(Color.white);
						updateLives(getGraphics());
					}
				}
			}

			repaint();
			try {
				Thread.sleep(pauseDuration);
			} catch (InterruptedException e) {
			}
		}
	}

	public boolean checkHit(FlashingBall ball) 
	{
		int radius = ball.getRadius();
		double xDistance = mouseX - ball.getX();
		double yDistance = mouseY - ball.getY();
		double hyp = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));

		return hyp <= radius;
	}

	/**
	 * Clears the screen and paints the balls.
	 */
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		for (int i = 0; i < numBalls; i++)
		{
			ball[i].draw(g);
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) 
	{
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) 
	{
		mouseX = arg0.getX();
		mouseY = arg0.getY();
		repaint();
	}

	public void updateLives (Graphics g)
	{
		if (lives > 0 )
		{
			g.setColor(Color.BLACK);
			g.setFont(new Font("New Times Roman", 50 , 50));
			g.drawString("LIVES:", 100, 100);
			g.drawString(Integer.toString(lives), 250, 100);
		}

		else 
		{
			this.setBackground(Color.red);
			g.drawString("0", 150, 100);
			g.setFont(new Font("New Times Roman", 100 , 100));
			g.drawString("GAME OVER", 550, 500);

			for (int i = 0; i < numBalls; i ++)
			{
				ball[i].stopThread();
			}
		}
	}
}