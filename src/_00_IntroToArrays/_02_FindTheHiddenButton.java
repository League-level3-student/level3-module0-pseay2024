package _00_IntroToArrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	//1. create an array of JButtons. Don't initialize it yet.

	//2 create an int variable called hiddenButton


	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] jb;
	// 2 create an int variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//3.  Ask the user to enter a positive number and convert it to an int

		//4. Initialize the array of JButtons to be the size of the int created in step 3

		//5. Make a for loop to iterate through the JButton array
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel

		//9 add the panel to the window

		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.

		//11. set the JFrame to visible.

		//12. Give the user the instructions for the game.

		//13. initialize the hiddenButton variable to a random number less than the int created int step 3

		//14. Set the text of the JButton located at hiddenButton the read "ME"

		//15. Use Thread.sleep(100); to pause the program.
		//    Surround it with a try/catch

		//16. Set the text of the JButton located at hiddenButton to be blank.

		// 3. Ask the user to enter a positive number and convert it to an int
		int pos = Integer.parseInt(JOptionPane.showInputDialog("What is a positive number?"));
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		jb = new JButton[pos];
		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel
		for (int i = 0; i < pos; i++) {
			jb[i] = new JButton();
			jb[i].addActionListener(this);
			panel.add(jb[i]);
		}
		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.
		JOptionPane.showMessageDialog(null, "click until it is the right oine");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3
		Random r = new Random();
		int hiddenButton = r.nextInt(pos);
		// 14. Set the text of the JButton located at hiddenButton the read "ME"
		jb[hiddenButton].setText("ME");
		// 15. Use Thread.sleep(100); to pause the program.
		// Surround it with a try/catch
		try {
			Thread.sleep(10000);
		} catch (Exception e) {
		}
		// 16. Set the text of the JButton located at hiddenButton to be blank.
		jb[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//17. if the hiddenButton is clicked, tell the user that they win.

		//18. else tell them to try again
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		if (buttonClicked.getText() == "ME") {
			JOptionPane.showMessageDialog(null, "You Win");
		} else {
			JOptionPane.showMessageDialog(null, "Try Again");
		}
		// 18. else tell them to try again
	}
}