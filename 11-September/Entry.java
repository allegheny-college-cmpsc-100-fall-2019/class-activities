package WorldClock;

import WorldClock.Clock;

/**
 * This class asks the World Clock to "tock."
 *
 * @author {YOUR NAME HERE}
 */
public class Entry {
  
  /**
   * The main entry point for Tick.
   *
   * @param args The command-line arguments
   */
  public static void main (String[] args){
    make();
  }
  
  /**
   * The method calling "tick" from the World Clock.
   *
   * @param None
   */
  public static void make (){
    String time = Clock.tick();
    String name = "{YOUR NAME HERE}";
    // Replace all comments (including this one) with the intended text.
    /**
     * Print a string (without a line break) to the screen which reads:
     * It is now {CURRENT TIME} in Meadville.
     */
    System.out.print("In a rather old building named Alden Hall, ");
    /**
     * Add to the sentence printing a string (without a line break)
     * describing what you're up to which includes your name from the
     * variable referenced above. For example, it could read:
     * a student named {YOUR NAME} is currently learning java.
     *
     * But, of course, that is just an example.
     */ 
    /**
     * Beneath this sentence, print a string (without a link break)
     * that describes a physical action that you're doing right now.
     * Examples include: thinking really hard, lazing about (which I hope
     * you're not doing)...anything describing physical activity.
     */
  }
}
