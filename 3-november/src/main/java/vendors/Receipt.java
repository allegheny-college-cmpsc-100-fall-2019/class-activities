package vendors;

import java.util.ArrayList;

/** Creates a receipt object.
 *
 * @author Douglas Luman
 */
public class Receipt {

  private ArrayList<Fruit> purchases;
  
  /** Constructor.
   *
   */
  public Receipt() {
    purchases = new ArrayList<Fruit>();
  }
  
  /** Adds a purchase to the list.
   *
   * @param fruit Fruit object to add.
   */
  public void addPurchase(Fruit fruit) {
    this.purchases.add(fruit);
  }
  
  /** Creates a string representation of Receipt.
   *
   */
  public String toString() {
    String receipt = "Your purchases:\n";
    /*
     * TODO Implement for loop
     */
    return receipt;
  }
}