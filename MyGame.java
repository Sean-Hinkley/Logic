
//import java.awt.Color;
//import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import gameController.GameController;

public class MyGame extends Game  {
    
        public static final String TITLE = "Data Structures";
        public static final int SCREEN_WIDTH = 1600;
        public static final int SCREEN_HEIGHT = 1000;
        

        GameController gc = new GameController(SCREEN_WIDTH, SCREEN_HEIGHT);
	public MyGame() {

                
        }
        
	public void update() {

        }
	
	public void draw(Graphics pen) {   
                gc.draw(pen);
        }
        
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {

    }

    @Override
    public void keyReleased(KeyEvent ke) {}

    @Override
    public void mouseClicked(MouseEvent me) {}

    @Override
    public void mousePressed(MouseEvent me) {
        gc.mousePressed(me);
    }
    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
        
        
    //Launches the Game
    public static void main(String[] args) { new MyGame().start(TITLE, SCREEN_WIDTH,SCREEN_HEIGHT); }

        @Override
        public void mouseDragged(MouseEvent e) {
                // TODO Auto-generated method stub
        }

        @Override
        public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
        }
}