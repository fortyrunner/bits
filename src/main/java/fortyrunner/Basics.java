package fortyrunner;

public final class Basics {

  private Basics(){

  }

  public static int turnOffRightmostBits(final int x){
    return x & (x - 1);
  }


  public static boolean isPowerOf2(final int x){
    return turnOffRightmostBits(x) == 0;
  }

}
