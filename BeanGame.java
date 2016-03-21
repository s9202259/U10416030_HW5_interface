
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class BeanGame {
	JFrame frame;
	JMenuItem item1, item2, item3;
	JPopupMenu popupMenu;
	
	public static void main(String[] args) {
		new BeanGame();
	}
	
	public BeanGame() {
		frame = new JFrame("BeanGame");
		frame.setSize(600, 400);
		frame.setLayout(new GridLayout(6, 4));
		
		JLabel label = new JLabel("BeanGame");
		label.setIcon(new ImageIcon("C:/Image/1.JPG"));
		
		frame.add(label);
		frame.setVisible(true);
		
		System.out.println("getLabel:");
	}
}
