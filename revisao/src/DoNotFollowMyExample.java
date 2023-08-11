    import java.util.ArrayList;
    import java.util.List;
    public class DoNotFollowMyExample {
      public static void main(String[] args) {
        List list = new ArrayList();
        try {
          for(;;) list.add("New item");
        }
        catch (RuntimeException rte) {
          System.out.print("Caught an RTE");
        }
        catch (OutOfMemoryError oome) {              // Line 15
          System.out.print("Out of memory ... ");
        }
        System.out.println("Total success!");
      }
    }