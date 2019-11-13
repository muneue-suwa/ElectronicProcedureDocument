import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ElectronicProcedureDocument extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Electronic Procedure Document");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = frame.getContentPane();
		container.setBackground(Color.white);
		// JPanel mainPanel = new JPanel();
		MainPanels mainPanels = new MainPanels(container);

		PrevNextButton prevnextButton = new PrevNextButton(container);
		prevnextButton.showPrevNextButton();

		ProcedureDocData procedureDocData = new ProcedureDocData();
		// GridLayout gl = new GridLayout(3, 2, 5, 10);
		// container.setLayout(gl);

		InitialScreen initialScreen = new InitialScreen(mainPanels);
		IdDateScreen idDateSreen = new IdDateScreen(mainPanels, procedureDocData);
		// ProcedureScreen procedureScreen = new ProcedureScreen(contanier);
		// initialScreen.showScreen();
		// procedureScreen.showScreen();
		prevnextButton.nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int canMove = 1;
				String currentScreenName = mainPanels.currentScreenName();
				canMove *= idDateSreen.update(currentScreenName);
				if (canMove > 0) {
					mainPanels.next();
				}
			}
		});
		prevnextButton.prevButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanels.previous();
			}
		});
		mainPanels.init();
		frame.setLocation(200, 100);
		frame.setSize(640, 480);
		frame.setVisible(true);
	}

}
