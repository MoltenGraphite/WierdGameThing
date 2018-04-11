package john.graphics;

import java.awt.*;
import javax.swing.*;

import john.gui.*;
import john.gui.window.*;

public class WorldRenderer implements Runnable {
  public World world;
  private boolean running = false;
  private boolean paused = false;
  private WorldCanvas canvas;
  
  public WorldRenderer(World world,WorldCanvas canvas) {
    this.world = world;this.canvas = canvas;
  }
  
  public void run() {
    while (running) {
      if (!paused) {
        canvas.render();
      }
    }
  }
}
