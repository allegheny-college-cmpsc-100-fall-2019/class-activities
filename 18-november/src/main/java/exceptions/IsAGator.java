package exceptions;

import java.util.ArrayList;
import java.util.Scanner;

/** Runs an exceptio test.
 *
 * @author Douglas Luman
 */
public class IsAGator {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String animal;
    do {
      System.out.print("Enter an animal (NO to quit): ");
      animal = input.nextLine();
      try {
        EvaluateGator.checkGator(animal);
        System.out.println("That's a gator.");
      } catch (NotGatorException noGator) {
        if (animal.equalsIgnoreCase("NO")) {
          continue;
        } else {
          System.out.println(noGator);
        }
      }
    }
    while (!animal.equalsIgnoreCase("NO"));
  }
}