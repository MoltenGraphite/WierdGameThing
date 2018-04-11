package john.gui;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

import john.gui.window.GameWindow;

public class WorldCanvas extends JPanel {
  protected World world;
  protected GameWindow window;
  public float zoom = 1f;
  
  public WorldCanvas(World world,GameWindow window) {
    this.world = world;this.window = window;
  }
  
  public World getWorld() {return world;}
  public GameWindow getGameWindow() {return window;}
  
  protected void paintComponent(Graphics g) {
    world.getCamera().draw(g,getWidth(),getHeight(),zoom);
  }
}
