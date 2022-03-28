package panels;

import lombok.Data;
import mainframe.Mainframe;

import javax.swing.*;
import java.awt.event.ActionEvent;

@Data
public class ControlPanel extends JPanel{

    final Mainframe frame;
    JButton exitBtn = new JButton("Exit");

    public ControlPanel(Mainframe frame) {
        this.frame = frame;
        init();
    }

    private void init() {
        exitBtn.addActionListener(this::exitGame);
    }

    private void exitGame(ActionEvent e){
        frame.dispose();
    }

}
