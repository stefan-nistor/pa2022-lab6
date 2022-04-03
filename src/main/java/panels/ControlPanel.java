package panels;

import lombok.Getter;
import lombok.Setter;
import mainframe.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

@Getter
@Setter
public class ControlPanel extends JPanel {

    private MainFrame frame;

    private JButton exitButton;
    private JButton saveButton;
    private JButton loadButton;

    public ControlPanel(MainFrame frame) {
        super();
        this.setBounds(0, frame.getHeight() - MainFrame.TITLE_BAR_HEIGHT - 30, frame.getWidth(), 40);
        setLayout(new GridLayout(1, 6));
        this.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        this.setBackground(Color.GRAY);
        this.frame = frame;

        this.exitButton = new JButton("Exit");
        this.saveButton = new JButton("Save");
        this.loadButton = new JButton("Load");

        this.add(this.saveButton);
        this.add(this.loadButton);
        this.add(this.exitButton);

        this.saveButton.addActionListener(this::saveCanvas);
        this.loadButton.addActionListener(this::loadCanvas);
        this.exitButton.addActionListener(this::exitGame);
    }

    public void exitGame(ActionEvent e) {
        frame.dispose();
    }

    public void saveCanvas(ActionEvent e) {

    }

    public void loadCanvas(ActionEvent e) {

    }

}
