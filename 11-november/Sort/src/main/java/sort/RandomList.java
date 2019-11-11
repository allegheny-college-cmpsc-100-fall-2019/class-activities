package sort;

import java.util.ArrayList;
import java.util.Random;

/** Generates one-dimensional lists with random values.
 *
 * @author Douglas Luman
 */
public class RandomList {

  ArrayList<Integer> used = new ArrayList<Integer>();
  public final int[] list;
  private Random seed = new Random();

  /** Constructor.
   *
   * @param indexes Length of dimension
   */
  public RandomList(int indexes) {
    int number;
    this.list = new int[indexes];
    for(int i = 0; i < this.list.length; i++) {
      do {
        number = this.seed.nextInt(indexes + 50) + 1;
        this.list[i] = number;
      } while (checkUsed(number));
      this.used.add(number);
    }
  }
  
  /** Checks if a number has already been used.
   *
   * @param number Number to check
   */
  private boolean checkUsed(int number){
    if(this.used.indexOf(number) > -1) {
      return true;
    }
    return false;
  }
  
  /** Return String representation of list.
   *
   */
  public String toString() {
    String result = new String();
    for (int number : this.list) {
      result += number + "\t";
    }
    return result + "\n";
  }
}