package john;

public class Tile {
  /**
   * 
   */
  public static final int SIZE = 256;

  public static final byte AIR = (byte) 0;
  public static final byte DIRT = (byte) 1;
  
  public static final byte COL_PARTICL = (byte) 1;
  public static final byte COL_ENTITY = (byte) 2;
  
  public byte[][] pixels;
  public PlayerTile tileObject = null;
  private HashMap<Byte,CollisionMap> collisionLayers = new HashMap<Byte,CollisionMap>();
  
  /**
   * @param collisionLayer the collision layer you wish to acquire the mapping of for this tile;
   */
  public CollisionMap getCollisionMap(byte collisionLayer) {
    return collisionLayers.get(collisionLayer);
  }
}
