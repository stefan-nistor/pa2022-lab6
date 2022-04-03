package panels;

import mainframe.MainFrame;

import javax.swing.*;

public class DrawingPanel extends JPanel {

    final MainFrame frame;
    int rows = 10, cols = 10;
    int canvasWidth = 400, canvasHeight = 400;
    int boardWidth, boardHeight;
    int cellWidth, cellHeight;
    int padX, padY;
    int stoneSize = 20;

    public DrawingPanel(MainFrame frame) {
        this.frame = frame;
        init();
        frame.add(this);
    }

    final void init() {
        this.padX = stoneSize + 10;
        this.padY = stoneSize + 10;
        this.cellWidth = (canvasWidth - 2 * padX) / (cols - 1);
        this.cellHeight = (canvasHeight - 2 * padY) / (rows - 1);
        this.boardWidth = (cols - 1) * cellWidth;
        this.boardHeight = (rows - 1) * cellHeight;
    }

}
