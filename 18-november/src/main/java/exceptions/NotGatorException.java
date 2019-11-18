package exceptions;

/** Creates a custom exception.
 *
 * @author Douglas Luman
 */
public class NotGatorException extends Exception {

  /** Constructor.
   *
   * @param text The custom error text
   */
  public NotGatorException(String text) {
    super(text);
  }
}