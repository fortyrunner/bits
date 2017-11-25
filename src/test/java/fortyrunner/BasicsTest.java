package fortyrunner;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BasicsTest {

  @Test
  public void turnOffRightmostBits() {

    assertEquals(0b0, Basics.turnOffRightmostBits(0b0));
    assertEquals(0b0, Basics.turnOffRightmostBits(0b1));
    assertEquals(0b0, Basics.turnOffRightmostBits(0b10));
    assertEquals(0b10, Basics.turnOffRightmostBits(0b11));
    assertEquals(0b10101000, Basics.turnOffRightmostBits(0b10101010));

  }


  @Test
  public void isPowerOf2() {

    assertTrue( Basics.isPowerOf2(0));
    assertTrue( Basics.isPowerOf2(0b1));
    assertTrue( Basics.isPowerOf2(0b10));
    assertFalse( Basics.isPowerOf2(0b11));
    assertFalse( Basics.isPowerOf2(0b010001000));
    assertTrue( Basics.isPowerOf2(0b1000000));
  }

  @Test
  public void is2nMinusOne() {

    assertTrue( Basics.is2nMinusOne(0));
    assertTrue( Basics.is2nMinusOne(0b1));
    assertFalse( Basics.is2nMinusOne(0b10));
    assertTrue( Basics.is2nMinusOne(0b11));
    assertTrue( Basics.is2nMinusOne(0b111));
    assertFalse( Basics.is2nMinusOne(0b1001));
    assertTrue( Basics.is2nMinusOne(0b1111));
  }

  @Test
  public void isolateRightmostOneBit() {
    assertEquals(0b1, Basics.isolateRightmostOneBit(0b1));
    assertEquals(0b0, Basics.isolateRightmostOneBit(0b0));
    assertEquals(0b10, Basics.isolateRightmostOneBit(0b10));
    assertEquals(0b01, Basics.isolateRightmostOneBit(0b11));
    assertEquals(0b00001000, Basics.isolateRightmostOneBit(0b00001000));

  }

  @Test
  public void isolateRightmostZeroBit() {
    assertEquals(0b10, Basics.isolateRightmostZeroBit(0b01));
    assertEquals(0b0, Basics.isolateRightmostZeroBit(0b0));
    assertEquals(0b10, Basics.isolateRightmostZeroBit(0b10));
    assertEquals(0b1000, Basics.isolateRightmostZeroBit(0b111));
    assertEquals(0b0001000, Basics.isolateRightmostZeroBit(0b00001000));

  }

}