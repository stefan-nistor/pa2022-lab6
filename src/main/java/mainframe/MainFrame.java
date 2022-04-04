package mainframe;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import panels.ConfigPanel;
import panels.ControlPanel;
import panels.DrawingPanel;

import javax.swing.*;
import java.awt.*;

@Getter
@Setter
public class MainFrame extends JFrame {
    private ConfigPanel config;
    private ControlPanel controls;
    private DrawingPanel canvas;

    public static final int APP_WINDOW_DEFAULT_WIDTH = 1366;
    public static final int APP_WINDOW_DEFAULT_HEIGHT = 768;
    public static final int APP_WINDOW_DEFAULT_X_OFFSET = 0;
    public static final int APP_WINDOW_DEFAULT_Y_OFFSET = 0;
    public static final int CONTROLS_BAR_HEIGHT = 40;

    private int windowWidth = APP_WINDOW_DEFAULT_WIDTH;
    private int windowHeight = APP_WINDOW_DEFAULT_HEIGHT;
    private int windowOffsetX = APP_WINDOW_DEFAULT_X_OFFSET;
    private int windowOffsetY = APP_WINDOW_DEFAULT_Y_OFFSET;


    public MainFrame() {
        super.setBounds(
                this.windowOffsetX,
                this.windowOffsetY,
                this.windowWidth,
                this.windowHeight
        );

        this.setBackground(Color.white);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.canvas = new DrawingPanel(this);
        this.config = new ConfigPanel(this);
        this.controls = new ControlPanel(this);

        this.add(this.config);
        this.add(this.canvas);
        this.add(this.controls);

        super.setLayout(null);
        super.setVisible(true);
        super.setSize(this.windowWidth, this.windowHeight);
    }
}