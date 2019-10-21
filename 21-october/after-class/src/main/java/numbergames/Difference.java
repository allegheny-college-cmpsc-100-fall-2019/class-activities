package numbergames;

public class Difference {

  private final int a;

  public Difference(int a, int b) {
    while (b != 0) {
      a--;
      b--;
    }
    this.a = a;
  }
  
  public String toString() {
    return Integer.toString(this.a);
  }
}