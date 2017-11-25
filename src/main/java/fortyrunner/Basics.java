package fortyrunner;

/**
 * Bit twiddling courtesy of Hackers Delight by Henry S. Warren
 */
public final class Basics {

  private Basics(){

  }

  public static int turnOffRightmostBits(final int x){
    return x & (x - 1);
  }


  public static boolean isPowerOf2(final int x){
    return turnOffRightmostBits(x) == 0;
  }

  /**
   * Is the number of the form 2^n-1?
   */
  public static boolean is2nMinusOne(final int x){
    return (x & (x + 1)) == 0;
  }

  /**
   * E.g. 0101 1000 -> 0000 1000
   */
  public static int isolateRightmostOneBit(final int x){
    return x & (-x);
  }

  /**
   * E.g. 10100111 -> 00001000
   */
  public static int isolateRightmostZeroBit(final int x){
    return -x & (x + 1);
  }



}
