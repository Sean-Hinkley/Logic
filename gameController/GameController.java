package gameController;
import nodes.Ping;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import visualNodes.DataVisual;
import visualNodes.VisualPing;
public class GameController {
    DataVisual dv;
    int w;
    int h;
    public GameController(int w, int h) {
        dv = new DataVisual();
        this.w = w;
        this.h = h;

        dv.add(100, 200);
        dv.getData(0).ping(true);
    }

    public void draw(Graphics pen) {
        drawBG(pen);
        dv.draw(pen);
    }

    public void drawBG(Graphics pen) {
        pen.setColor(Color.darkGray);
        pen.fillRect(0, 0, w, h);
    }

    public void update() {
        dv.update();
    }

    


    public void mousePressed(MouseEvent me) {
        int mx = me.getX()-8;
        int my = me.getY()-32;
        if(me.getButton() == 3) {
            VisualPing vp = dv.pinPoint(mx, my, me.getButton());
            if(vp==null) {
                dv.add(mx, my);
            }
        } else if (me.getButton() == 1) {
            dv.pinPoint(mx, my, me.getButton());
        }
    }
    
    public void mouseReleased(MouseEvent me) {

    }
}