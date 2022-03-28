package mainframe;

import panels.ConfigPanel;
import panels.ControlPanel;
import panels.DrawingPanel;

import javax.swing.*;


public class Mainframe extends JFrame {
     public ConfigPanel configPanel;
     ControlPanel controlPanel;
     DrawingPanel canvas;

    public Mainframe() {
        super("My Drawing Application");
        init();
    }

    public DrawingPanel getCanvas() {
        return canvas;
    }

    public ConfigPanel getConfigPanel() {
        return configPanel;
    }

    private void init() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        canvas = new DrawingPanel(this);
        configPanel = new ConfigPanel(this);
        controlPanel = new ControlPanel(this);
        add(canvas, "Center");
        add(configPanel, "North");
        add(controlPanel, "South");
        pack();
    }
}