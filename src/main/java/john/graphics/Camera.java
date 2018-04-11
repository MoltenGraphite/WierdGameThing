package john.graphics;

import java.awt.*;

public class Camera {
  public int x;
  public int y;
  public int width;
  public int height;
  public World world;
  
  public void draw(Graphics g,int width,int height,float zoom) {
    int hw = Math.round(this.width/2);
    int hh = Math.round(this.height/2);
    int tw = Math.round(width/this.width);
    int th = Math.round(height/this.height);
    Tile[][] tiles = world.getTiles(new Rectangle(x-hw,y-hw,this.width,this.height));
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        g.drawImage(tiles[y][x].draw().getScaledInstance(tw,th,Image.SCALE_SMOOTH),0,0,null);
      }
    }
  }
}
