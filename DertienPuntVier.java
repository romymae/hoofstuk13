package Hoofdstuk13;

/**
 * Created by Romy Mae on 21-11-2016.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;
public class DertienPuntVier extends Applet {
Color red = new Color(255,80,75);
    int steensoort;

    public void init() {
setSize(900,6);
     steensoort = 1;
        Button baksteen = new Button ("baksteen");
        Button beton = new Button ("beton");
        BaksteenListen l1 = new BaksteenListen ();
        BetonListen l2 = new BetonListen ();
        baksteen.addActionListener(l1);
        beton.addActionListener(l2);
        add(baksteen);
        add(beton);
    }

    public void paint(Graphics g) {
if(steensoort ==0){
    for (int muur1 = 0; muur1 < 30; muur1++) {
        for (int muur2 = 0; muur2 <30; muur2++) {
            tekenbaksteen(g, muur1 * 22 + 10 * (muur2 % 2), (muur2 + 5) * 12);
        }
    }
}else if(steensoort==1){
    for (int muur1 = 0; muur1 <20 ; muur1++) {
        for (int muur2 = 0; muur2 <20 ; muur2++) {
            tekenbeton(g, muur1 * 42 + 20 * (muur2 % 2), (muur2 + 5) * 22);
            }
        }
    }
}
    public class BaksteenListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            steensoort = 0;
            repaint();
        }

    }

    public class BetonListen implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            steensoort = 1;
            repaint();
        }
    }

    void tekenbaksteen(Graphics g, int x1, int y1) {
        g.setColor(red);
        g.fillRect(x1, y1, 20, 10);
    }

    void tekenbeton(Graphics g, int x1, int y1) {
        g.setColor(Color.gray);
        g.fillRect(x1, y1, 40, 20);
    }


}
