public class RainForest extends Forest {
  public RainForest(long treeCount) {
//	super(treeCount);
    super.treeCount = treeCount+1;
  }
  public static void main(String[] birds) {
    System.out.print(new RainForest(5L).treeCount); }
  }
class Forest {
  public long treeCount;
  public Forest() {}
  public Forest(long treeCount) {
    this.treeCount = treeCount+2;
  }
}