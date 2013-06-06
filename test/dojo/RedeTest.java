package dojo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RedeTest {
  @Test
  public void testRedeTrivial() {
    int xi = 0;
    int xf = 0;
    int yi = 0;
    int yf = 0;

    Rede rede = new Rede(xi, xf, yi, yf);
    
    assertEquals(0, rede.area());
  }
  
  @Test
  public void testRede0202() {
    int xi = 0;
    int xf = 2;
    int yi = 0;
    int yf = 2;

    Rede rede = new Rede(xi, xf, yi, yf);
    
    assertEquals(4, rede.area());
  }
}
