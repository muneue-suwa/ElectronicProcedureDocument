import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InitialScreen extends JFrame {

    private JLabel startLabel;
    public MainPanels mainPanels;

    InitialScreen(MainPanels main_panels) {
        mainPanels = main_panels;
        mainPanels.add(createInitialScreenPanel(), "InitialScreen");
    }

    private JPanel createInitialScreenPanel() {
        JPanel initialscreenPanel = new JPanel();
        startLabel = new JLabel("電子化手順書");
        // initialscreenContainer.add(startLabel);
        startLabel.setFont(new Font("Arial", Font.BOLD, 32));
        startLabel.setSize(startLabel.getPreferredSize());
        startLabel.setHorizontalAlignment(JLabel.CENTER);

        initialscreenPanel.add(startLabel);
        return initialscreenPanel;
    }

}
