
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class BeanGame extends JFrame{
	static JFrame myFrame = new BeanGame();
	
	public BeanGame() {
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("C:/Image/BeanGame.png"));
		label.setPreferredSize(new Dimension(330, 450));
		paint(100, 200);
		
		this.add(label);
		this.pack();
	}
	
	public static void main(String[] args) {
		myFrame.setSize(500, 500);
		myFrame.setResizable(false);
		myFrame.setVisible(true);
		
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void paint(int x, int y) {
		Graphics g = myFrame.getGraphics();
		g.setColor(Color.red);
		g.fillOval(x, y, 10, 10);
	}
}
