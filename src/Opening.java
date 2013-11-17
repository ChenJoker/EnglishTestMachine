import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Opening extends JFrame{
	
	private JButton start;
	private JButton enter;
	private JButton quit;
	private JPanel screen;
	private starting startmain;
	public Opening(){
		super("English Test Machine");
				
		startmain = new starting();
		
		screen = new JPanel();
		screen.setLayout(null);
		screen.setPreferredSize(new Dimension(500,800));
		
		start = new JButton("Start");
		start.setLocation(100,100);
		start.setSize(300, 100);
		start.setFont(new Font("Serif" , Font.BOLD,30));
		
		enter = new JButton("Enter words");
		enter.setLocation(100, 300);
		enter.setSize(300, 100);
		enter.setFont(new Font("Serif" , Font.BOLD,30));
		enter.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						startmain.filecreate();
					}				
				}
		);
		quit = new JButton("Quit");
		quit.setLocation(100, 500);
		quit.setSize(300, 100);
		quit.setFont(new Font("Serif" , Font.BOLD,30));
		quit.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}				
				}
		);
		screen.add(start);
		screen.add(enter);
		screen.add(quit);
		
		add(screen);
	}
	
}
