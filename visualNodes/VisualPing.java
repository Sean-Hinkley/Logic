package visualNodes;

import java.awt.Color;
import java.awt.Graphics;

import nodes.Ping;

public class VisualPing {
    int x;
    int y;
    int w = 50;
    int h = 50;
    Ping ping;
    public VisualPing(Ping p, int x, int y) {
        setX(x);
        setY(y);
        ping = p;
    }

    public void draw(Graphics pen) {
        if(ping!=null) {
            drawColor(pen);
        }

        pen.fillOval(x, y, w, h);
    }

    private void drawColor(Graphics pen) {
        if(ping.send()) {
            pen.setColor(Color.red);
        }else {
            pen.setColor(Color.black);
        }
    }

    public void drawSelect(Graphics pen) {
        pen.setColor(Color.GREEN);
        pen.drawOval(x, y, w, h);
    }

    public void update() {

    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    public Ping getPing() {
        return ping;
    }

    public void slideX(int xDiff) {
        int x = getX() + xDiff;
        setX(x);
    }

    public void slideY(int yDiff) {
        int y = getY() + yDiff;
        setY(y);
    }

    public boolean collision(int x, int y) {
        if( (x > getX() && x < (getX() + getW())) && (y > getY() && y < getY() + getH()) ) {
            return true;
        }

        return false;
    }
}
