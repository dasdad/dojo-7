package dojo;

import java.util.ArrayList;
import java.util.List;

public class Oceano {
  private boolean[][] matriz;
  
  public Oceano() {
    matriz = new boolean[100][100];
  }

  public Oceano(List<Rede> redes) {
    this();
    matriz[0][0] = true;
  }

  public int areaCoberta() {
    if(matriz[0][0]){
     return 1;
    }
    return 0;
  }
  
  public boolean[][] getMatriz(){
    return matriz;
  }
}
