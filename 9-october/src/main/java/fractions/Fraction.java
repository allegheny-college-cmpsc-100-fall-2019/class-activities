package fractions;

public class Fraction {
  
  private final int numer;
  private final int denom;
  
  public Fraction(int numer, int denom) {
    this.numer = numer;
    this.denom = denom;
  }
  
  public Fraction reciprocal(){
    Fraction inverse = new Fraction(this.denom, this.numer);
    return inverse;
  }
  
  public String toString(){
    String fraction = this.numer + "/" + this.denom;
    return fraction;
  }
}