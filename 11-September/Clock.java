package WorldClock;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * This class returns the "tock" of the WorldClock.
 *
 * @author Douglas Luman
 */

public class Clock {
  
  /**
   * The main entry point for TickTock.
   *
   * @param args The command-line arguments
   */
  public static void main (String[] args){
    System.out.println(tick());
  }
  
  /**
   * Method causing clock to "tock."
   *
   * @param None
   */
  private static String tock () {
    Date date = new Date();
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("hh:mm:ss a");
    String formatted = DATE_FORMAT.format(date.getTime()).toString();
    return formatted;
  } 
  
  /**
   * Method causing clock to "tick," returning a "tock".
   *
   * @param None
   */
  public static String tick (){
    String time = tock();
    return time;
  }
}