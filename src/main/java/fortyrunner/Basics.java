package fortyrunner;

public final class Basics {

  private Basics(){

  }

  public static int turnOffRightmostBits(final int x){
    return x & (x - 1);
  }

}
