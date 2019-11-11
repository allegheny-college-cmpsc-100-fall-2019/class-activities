package search;

import java.util.Scanner;

/** Implements various approaches to linear search.
 *
 * @author Douglas Luman
 */
public class RunSearch {
  
  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args){
    /*
     * Setup Scanner and class with Search objects
     */
    Search search = new Search();
    Scanner input = new Scanner(System.in);
    /*
     * Initialize variables
     */
    int linear;
    int recurse;
    int recurseOL;
    long start;
    long end;
    /*
     * Start user input and do searches
     */
    do {    
      System.out.print("Enter an integer to search for [1-20]: ");
      int number = input.nextInt();
      linear = search.linearSearch(number);
      recurse = search.recursiveSearch(number, search.list.length - 1);
      recurseOL = search.rOL(number,search.list.length - 1);
      int result = linear = recurse = recurseOL;
      switch (result) {
        case -1:
          System.out.println("Not found! Try again.");
          break;
        default:
          System.out.println("Found!");
          break;
      }
    } while (linear < 0 && recurse < 0);
    /*
     * Print results
     */
    System.out.printf("Linear result: %d\n", linear);
    System.out.printf("Recursive result: %d\n", recurse);
    System.out.printf("Recursive one-line result: %d\n", recurseOL);
    System.out.printf("List[%d] = %d\n", recurseOL, search.list[linear]);
  }
}