package dojo;

import java.util.ArrayList;
import java.util.List;

public class Oceano {

  private List<Rede> redes;
  
  public Oceano() {
    redes = new ArrayList<>();
  }

  public Oceano(List<Rede> redes) {
    this.redes = redes;
  }

  public int areaCoberta() {
    if(redes.size() > 0){
     return 1;
    }
    return 0;
  }
}
