package UI;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private final JPanel mainPanel = new MainPanel().panel;

    public static void main(String[] args) {
        new Window();
    }

    public Window() {
        this.setContentPane(mainPanel);
        this.setMinimumSize(new Dimension(600, 400));
        this.setSize(800, 800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setTitle("Reminders");

        this.setVisible(true);
    }
}
