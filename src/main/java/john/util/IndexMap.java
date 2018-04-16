package john;

public class IndexMap extends HashMap<Integer,Integer> {
  public int get(int i) {return (int) super.get(i);}
  public void set(int i,int b) {super.put(i,b);}
}
