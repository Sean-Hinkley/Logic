package visualNodes;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import nodes.*;
public class DataVisual {
    ArrayList<Ping> pings;
    ArrayList<VisualPing> visuals;
    VisualPing selected;
    public DataVisual() {
        pings = new ArrayList<>();
        visuals = new ArrayList<>();
        selected = null;
    }

    public void add(int x, int y) {
        Ping p = new Ping("ping");
        System.out.println(selected);
        
        pings.add(p);
        
        visuals.add(new VisualPing(p, x, y));
    }

    public void remove(int ind) {
        pings.remove(ind);
        pings.remove(ind);
    }

    public VisualPing getVisual(int ind) {
        return visuals.get(ind);

    }

    public VisualPing getVisual(Ping p) {
        int n = pings.indexOf(p);
        return visuals.get(n);
    }

    public Ping getData(int ind) {
        return pings.get(ind);
    }

    public Ping getData(VisualPing vp) {
        int n = visuals.indexOf(vp);
        return pings.get(n);
    }

    public int indexOf(VisualPing vp) {
        return visuals.indexOf(vp);
    }

    public int indexOf(Ping p) {
        return pings.indexOf(p);
    }

    public void draw(Graphics pen) {
        for(int x = 0; x < visuals.size(); x++) {
            VisualPing vp = visuals.get(x);
            if(vp!=null) { 
                vp.draw(pen);
                if(vp.equals(selected)) {
                    //System.out.println(vp.equals(selected));
                    vp.drawSelect(pen); 
                }
            }

        }
    }

    public void update() {
        
        pings.get(0).ping(true);
    }

    public void setSelected(VisualPing vp) {
        selected = vp;
    }

    public VisualPing pinPoint(int x, int y, int mc) {
        for(int n = 0; n < visuals.size(); n++) {
            if(visuals.get(n).collision(x, y)) {
                if(mc==1) this.setSelected(visuals.get(n));
                
                return visuals.get(n);
                
            } else if (mc==1 && !(visuals.get(n).collision(x, y))) {
                selected = null;
            }
        }
        return null;
    }
}
