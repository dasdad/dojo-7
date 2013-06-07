import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Rede {

  private int xi;
  private int xf;
  private int yi;
  private int yf;

  public Rede(int xi, int xf, int yi, int yf) {
    this.xi = xi;
    this.xf = xf;
    this.yi = yi;
    this.yf = yf;
  }

  public int getXi() {
    return xi;
  }

  public int getXf() {
    return xf;
  }

  public int getYi() {
    return yi;
  }

  public int getYf() {
    return yf;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + xf;
    result = prime * result + xi;
    result = prime * result + yf;
    result = prime * result + yi;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Rede other = (Rede) obj;
    if (xf != other.xf) return false;
    if (xi != other.xi) return false;
    if (yf != other.yf) return false;
    if (yi != other.yi) return false;
    return true;
  }
}


public class solucao {
  private boolean[][] matriz;

  public solucao() {
    matriz = new boolean[101][101];
  }

  public solucao(List<Rede> redes) {
    this();
    for (Rede rede : redes) {
      for (int i = rede.getXi(); i < rede.getXf(); i++) {
        for (int j = rede.getYi(); j < rede.getYf(); j++) {
          matriz[i][j] = true;
        }
      }
    }

  }

  public int areaCoberta() {
    int soma = 0;
    for (int i = 0; i < 101; i++) {
      for (int j = 0; j < 101; j++) {
        if (getMatriz()[i][j]) {
          soma++;
        }
      }
    }

    return soma;
  }

  public boolean[][] getMatriz() {
    return matriz;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Rede> redes = new ArrayList<>();

    for (int n = sc.nextInt(); n > 0; n--) {
      redes.add(new Rede(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }

    sc.close();
    System.out.println(new solucao(redes).areaCoberta());
  }
}
