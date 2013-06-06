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
  
  public int area(){
    return (xf - xi) * (yf - yi);
  }
}
