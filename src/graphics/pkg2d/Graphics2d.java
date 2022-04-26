package graphics.pkg2d;

import java.awt.*;

public class Graphics2d {

    public void drawPacMan(Graphics g, int x, int y, Color color) {

        g.setColor(color); // set color
        g.fillOval(x, y, 50, 50); // paint
        g.setColor(Color.black);
        g.drawOval(x, y, 50, 50); // outline
        // mouth?

    }

    public void drawGhost(Graphics g, int x, int y, Color color) {

        g.setColor(color); // color
        // here goes shape

    }

    public static void main(String[] args) {
        drawPacMan();
        drawGhost();
    }

}
