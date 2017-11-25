package fortyrunner;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicsTest {

  @Test
  public void turnOffRightmostBits() {

    assertEquals(0b0, Basics.turnOffRightmostBits(0b0));
    assertEquals(0b0, Basics.turnOffRightmostBits(0b1));
    assertEquals(0b0, Basics.turnOffRightmostBits(0b10));
    assertEquals(0b10, Basics.turnOffRightmostBits(0b11));
    assertEquals(0b10101000, Basics.turnOffRightmostBits(0b10101010));

  }
}