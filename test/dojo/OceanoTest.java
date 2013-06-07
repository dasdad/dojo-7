package dojo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

@SuppressWarnings("serial")
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

  @Test
  public void testAlocaUmaRede() {
    List<Rede> redes = new ArrayList<>();
    redes.add(new Rede(0, 1, 0, 1));
    assertTrue(new Oceano(redes).getMatriz()[0][0]);
  }

  @Test
  public void testAlocaOutraRede() {
    assertTrue(new Oceano(new ArrayList<Rede>() {
      {
        add(new Rede(1, 2, 1, 2));
      }
    }).getMatriz()[1][1]);
  }


  @Test
  public void testAlocaRede2Posicoes() {
    assertEquals(4, new Oceano(new ArrayList<Rede>() {
      {
        add(new Rede(1, 3, 1, 3));
      }
    }).areaCoberta());
  }

  @Test
  public void testAlocaDuasRede2Posicoes() {
    assertEquals(7, new Oceano(new ArrayList<Rede>() {
      {
        add(new Rede(1, 3, 1, 3));
        add(new Rede(2, 4, 2, 4));
      }
    }).areaCoberta());
  }
}
