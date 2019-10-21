package numbergames;

public class Sum {
  
  private final int a;
  
  public Sum(int a, int b) {
    while (b != 0) {
      a++;
      b--;
    }
    this.a = a;
  }
  
  public String toString(){
    return Integer.toString(this.a);
  }
}