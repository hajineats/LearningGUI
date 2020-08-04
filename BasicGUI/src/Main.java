import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;


public class Main {
	JFrame frame;
	JLabel header;
	JLabel footer;
	JPanel control;
	
	
	public static void main(String[] args) {
		Main main = new Main();
		main.showDemo();
		
	}
	
	private void showDemo() {
		frame = new JFrame();
		frame.setSize(400,400);
		frame.setLayout(new GridLayout(3,1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		header = new JLabel("hey!", JLabel.CENTER);
		footer = new JLabel("yo!", JLabel.CENTER);
		control = new JPanel();
		
		frame.add(header);
		frame.add(control);
		frame.add(footer);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.setVisible(true);
	}

}
