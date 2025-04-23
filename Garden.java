import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Starter Code for Lab 11
 * 
 * @author Ira Goldstein
 * @version Spring 2025
 */


public class Garden implements Runnable {

    private JPanel panel;

    @Override
    public void run() {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Garden");
		frame.setPreferredSize(new Dimension(800, 800));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JPanel with a paintComponent method
		panel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {

				// first, we should call the paintComponent method we are
				// overriding in JPanel
				super.paintComponent(g);

			}
		};
		frame.add(panel);

		// display the window we've created
		frame.pack();
		frame.setVisible(true);

    }

    public static void main(String args[]) {

        javax.swing.SwingUtilities.invokeLater(new Garden());
    }
}
