package oop.Test;

import javax.swing.*;
import java.awt.*;

public class LineDemo2D extends JApplet {
    public void paint(Graphics g) {
        Graphics graphics = getGraphics();
        g.drawLine(0, 1, 2, 3);

    }
}
