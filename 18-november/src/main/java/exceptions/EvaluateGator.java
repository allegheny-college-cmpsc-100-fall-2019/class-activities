package exceptions;

import java.util.ArrayList;

/** Evaluates gators.
 *
 * @author Douglas Luman
 */
public class EvaluateGator {
  
  private static ArrayList<String> animals = new ArrayList<String>();
  public static NotGatorException notGator = new NotGatorException("Not a gator!");
  
  /** Checks the list and throws exception if not there.
   *
   * @param animal An animal to test.
   */
  public static void checkGator(String animal) throws NotGatorException {
    animals.add("Gator");
    animals.add("Alligator");
    animals.add("Crocodile");
    animals.add("Chompers");
    if (!animals.contains(animal)) {
      throw notGator;
    }
  }
}