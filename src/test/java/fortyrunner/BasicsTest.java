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

}