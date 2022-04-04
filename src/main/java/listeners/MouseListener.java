//package listeners;
//
//import panels.DrawingPanel;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseEvent;
//
//public class MouseListener extends JFrame implements java.awt.event.MouseListener {
//
//    private DrawingPanel drawingPanel;
//
//    public MouseListener(){
//        addMouseListener(this);
//        setSize(300, 300);
//        setLayout(null);
//        setVisible(true);
//    }
//
//    public void mouseClicked(MouseEvent e){
//        Graphics2D graphics = (Graphics2D) getGraphics();
//        graphics.setColor(Color.BLUE);
//        graphics.fillOval(e.getX(), e.getY(), 30, 30);
//    }
//
//}
