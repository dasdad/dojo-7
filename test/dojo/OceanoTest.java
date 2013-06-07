package dojo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OceanoTest {

  @Test
  public void testSemRedes() {
    assertEquals(0, new Oceano().areaCoberta());
  }
  
  @Test
  public void testComUmaRede() {
    List<Rede> redes = new ArrayList<>();
    redes.add(new Rede(0, 1, 0, 1));
    assertEquals(1, new Oceano(redes).areaCoberta());
  }
  
  public void testAlocaUmaRede() {
    List<Rede> redes = new ArrayList<>();
    redes.add(new Rede(0, 1, 0, 1));
    assertTrue(new Oceano(redes).getMatriz()[0][0]);
  }

}
