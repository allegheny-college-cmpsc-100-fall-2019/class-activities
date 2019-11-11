package search;

import java.util.ArrayList;
import java.util.Random;

/** Demonstrates various approaches to linear search.
 *
 * @author Douglas Luman
 */
public class Search {
  
  public final int[] list;
  
  /** Constructor
   *
   */
  public Search() {
    RandomList list = new RandomList(100);
    this.list = list.list;
  }
  
  /** Executes a iterative linear search.
   *
   * @param number Number to search for
   */
  public int linearSearch(int number) {
    /*
     * TODO Linear search
     */
  }
  
  /** Executes a recursive linear search.
   *
   * @param number Number to search for
   * @param index Location in array to start search
   */
  public int recursiveSearch(int number, int index) {
    /*
     * TODO Recursive search
     */
  }
  
  /** Executes a recusive linear search in as few instructions as possible.
   *
   * @param n Number to search for
   * @param i Location in array to start search
   */
  public int rOL(int n, int i) {
    return (i < 0 || this.list[i] == n) ? i : rOL(n, i -  1);
  }
}