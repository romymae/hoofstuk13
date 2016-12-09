package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;
/**
 * Created by Romy Mae on 22-11-2016.
 */
public class PraktijkHoofdstuk13 extends Applet {

    public void init() {
        setSize(800, 600);
    }

    public void paint(Graphics g) {
        for (int headloop = 0; headloop < 6; headloop++) {
            for (int secondloop = 0; secondloop < 3; secondloop++) {
                tekenboom(g, headloop * 80 + 20 * (secondloop % 2), (secondloop + 5) * 40);
            }

        }
    }

    void tekenboom(Graphics g, int x, int y) {
        g.setColor(new Color(50, 25, 0));
        g.fillRect(x, y, 25, 35);
        g.setColor(Color.green);
        g.fillOval(x - 20, y - 30, 60, 40);
    }










}
