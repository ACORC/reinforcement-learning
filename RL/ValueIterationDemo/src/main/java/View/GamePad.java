package View;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;

public class GamePad extends JFrame {
    private int cols;
    private int rows;

    public GamePad(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.setupUI();
    }

    private void setupUI () {
        this.setLayout(new GridLayout(cols,rows));
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                JPanel panel = new JPanel();
                panel.setBackground(Color.black);
                this.add(panel);
            }
        }
        this.setSize(800, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ValueIterationDemo");
    }
}
