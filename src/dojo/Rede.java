package dojo;

public class Rede {

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
