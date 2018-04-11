package john.gui.window;

import java.awt.*;
import javax.swing.*;

import john.gui.*;

public class GameWindow extends JFrame {
  /**
   * The canvas object used to display what the world's camera sees.
   */
  public WorldCanvas canvas;
  
  /**
   * Constructs and shows the new GameWindow
   * 
   * @param w the world to be rendered to this frame's canvas.
   */
  public GameWindow(World w) {
    this.canvas = new WorldCanvas(w,this);
    Dimension m = new Dimension(640,360);
    Dimension p = new Dimension(800,450);
    canvas.setPreferredSize(p);canvas.setMinimumSize(m);
    add(canvas);
    pack();
    setLocationrelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("John's Game");
    setVisible(true);
  }
  
  /**
   * Used by the Renderer to update the graphics for this frame.
   */
  public void render() {
    canvas.render();
    repaint();
  }
}
