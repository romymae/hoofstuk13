package Hoofdstuk13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Romy Mae on 11-11-2016.
 */
public class DertienpuntEen extends Applet {
    String tekst = "";
    Color[] achtergrond = {Color.magenta, Color.green, Color.pink, Color.red, Color.orange};
    String[] kleuren = {"magenta", "green", "pink", "red", "orange"};
    Button[] knop = new Button[5];

    public void init() {
        setSize(800, 600);
        for (int i = 0; i < knop.length; i++) {
knop[i]= new Button("" + kleuren[i]);
            add(knop[i]);
            knop[i].addActionListener(new Listener());
            knop[i].setBackground(achtergrond[i]);
        }
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
Button knop = (Button) e.getSource();
            setBackground(knop.getBackground());
            tekst = knop.getLabel();
        }
    }

    public void paint(Graphics g) {
g.drawString(tekst, getWidth()/2-20, getHeight()/2);
    }


}
