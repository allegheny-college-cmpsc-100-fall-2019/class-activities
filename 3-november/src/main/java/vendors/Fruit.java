package vendors;

import java.text.NumberFormat;

/** Creates a fruit object.
 *
 * @author Douglas Luman
 */
public class Fruit {
  
  private String name;
  private double cost;
   
  /** Sets the name of a fruit.
   *
   * @param name Name of fruit
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /** Retrieves the name of fruit.
   *
   */
  public String getName() {
    return this.name;
  }
  
  /** Sets the cost of a fruit.
   *
   * @param cost Cost of the fruit
   */
  public void setCost(double cost) {
    this.cost = cost;
  }
  
  /** Retrieves the cost of a fruit.
   *
   */
  public double getCost() {
    return this.cost;
  }
  
  /** Creates string representation of fruit.
   *
   */
  public String toString() {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    String listing = this.name + " @ " + fmt.format (this.cost);
    return listing;
  }
}