package main;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private JPanel mainPanel;

    public static void main(String... args) {
        SwingUtilities.invokeLater(GUI::createAndShowGui);
    }

    public GUI() {
        mainPanel = new JPanel(new BorderLayout());
    }

    private static void createAndShowGui() {
        GUI gui = new GUI();

        JFrame frame = new JFrame("Battleship");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);
        frame.getContentPane().add(gui.getMainComponent());
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public JComponent getMainComponent() {
        return mainPanel;
    }
}
