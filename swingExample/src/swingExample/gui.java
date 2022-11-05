package swingExample;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.*;

class gui extends  JFrame implements ActionListener{
    
    static JFrame frame = new JFrame("Random Number Guessing Game");
    static JPanel northPanel = new JPanel();
    static JTextField t = new JTextField(3);
    static JLabel label = new JLabel("Enter Text");
    static JButton button = new JButton("Guess");
    static JPanel southPanel = new JPanel();
    static JLabel message = new JLabel("nothing entered");

	gui() {
		
	}
	public static void main(String args[]){
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       gui tf = new gui();
       button.addActionListener(tf);
       northPanel.add(label);
       northPanel.add(t);
       northPanel.add(button);
       southPanel.add(message);
//       frame.getContentPane().add(BorderLayout.EAST, button);
       frame.getContentPane().add(BorderLayout.NORTH, northPanel); // Adds Button to content pane of frame
       frame.getContentPane().add(BorderLayout.CENTER, southPanel);
       frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch (e.getActionCommand()) {
		case "Guess": 
			message.setText(t.getText());
			t.setText("");
		
		
		}
		
	}
}
