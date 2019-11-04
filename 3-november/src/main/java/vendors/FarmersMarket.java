package vendors;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

/** Simulates a trip to the farmer's market.
 *
 * @author Douglas Luman
 */
public class FarmersMarket {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Fruit fruit;
    String choice;
    String response;
    double price = 0;
    double bankroll = // Provide a starting bank roll;
    Receipt receipt = new Receipt();
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    Scanner input = new Scanner(System.in);
    /*
     * TODO Implement shopping using a do...while and switch statement
     */
    if (bankroll < price) {
      System.out.println("You ran out of money for fruit! You bought:");
    } else {
      System.out.println("Today, you purchased:");
    }
    System.out.println("---------");
    System.out.println(receipt);
  }
}