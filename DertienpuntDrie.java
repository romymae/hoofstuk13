package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;
/**
 * Created by Romy Mae on 21-11-2016.
 */
public class DertienpuntDrie extends Applet {
Color red = new Color(255,80,75);

public void init(){
setSize(800,600);
}

    public void paint(Graphics g) {
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j <25 ; j++) {
                muur(g,i*22+10*(j%2), j*12);

            }
        }
    }
    void muur(Graphics g, int x1, int y1){
        g.setColor(red);
        g.fillRect(x1,y1,20,10);
    }
}
