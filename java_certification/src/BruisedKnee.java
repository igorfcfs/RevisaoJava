class BruisedKnee {
      private static void run() { tripOverCat(); }
      private static void tripOverCat() { try{throw new Exception();}catch(Throwable t) {} }
      public static void main (String[] args) {
        run();
      }
    }