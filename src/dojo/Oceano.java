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
    for(Rede rede : redes){
      for (int i = rede.getXi(); i < rede.getXf(); i++) {
        for (int j = rede.getYi(); j < rede.getYf(); j++) {
          matriz[i][j] = true;
        }
      }
    }
    
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
