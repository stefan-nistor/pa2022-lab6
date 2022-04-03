package panels;

import lombok.Getter;
import lombok.Setter;
import mainframe.MainFrame;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class ConfigPanel extends JPanel {

    private final MainFrame frame;
    private JLabel label;
    private JSpinner rowsCount;
    private JSpinner colsCount;
    private JButton createButton;
    int rows = 10, cols = 10;

    public ConfigPanel(MainFrame frame) {
        super();
        this.setBounds(0, 0, frame.getWidth(), 40 );
        this.setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.BLACK));
        setBackground(Color.GRAY);
        this.frame = frame;

        this.createButton = new JButton("Create");
        this.label = new JLabel("Grid size: ");
        this.rowsCount = new JSpinner(new SpinnerNumberModel(10, 0, 20, 1));
        this.colsCount = new JSpinner(new SpinnerNumberModel(10, 0, 20, 1));

        this.add(this.label);
        this.add(this.rowsCount);
        this.add(this.colsCount);
        this.add(this.createButton);
    }
}
