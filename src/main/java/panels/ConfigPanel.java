package panels;

import lombok.Data;
import mainframe.Mainframe;

import javax.swing.*;

@Data
public class ConfigPanel extends JPanel {

    final Mainframe frame;
    JLabel label;
    JSpinner spinner;
    int rows = 10, cols = 10;

    public ConfigPanel(Mainframe frame) {
        this.frame = frame;
        init();
    }

    private void init(){
        label = new JLabel("Grid size: ");
        spinner = new JSpinner(new SpinnerNumberModel(10, 2, 100, 1));
    }

}
