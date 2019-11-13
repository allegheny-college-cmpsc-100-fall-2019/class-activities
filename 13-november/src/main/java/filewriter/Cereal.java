package cerealcomma;

/** Creates a "cereal" object.
 *
 * @author Douglas Luman
 */
public class Cereal {
  
  private int shelf;
  private String name;
  private double price;
  
  /** Sets the name of the cereal`.
   *
   * @param name Cereal name
   */
  public void setName(String name) {
    this.name = name;
  }
  
  /** Retrieves the name of the cereal.
   *
   */
  public String getName() {
    return this.name;
  }
  
  /** Sets the price of the cereal.
   *
   * @param price Price of the cereal
   */
  public void setPrice(double price) {
    this.price = price;
  }
  
  /** Retrieves the price of the cereal.
   *
   */
  public double getPrice() {
    return this.price;
  }
  
  /** Sets the shelf the cereal needs to sit on.
   *
   * @param shelf The integer number of the shelf.
   */
  public void setShelf(int shelf) {
    this.shelf = shelf;
  }
  
  /** Retrieves the shelf.
   *
   */
  public int getShelf() {
    return this.shelf;
  }
  
  /** Creates string representation of the cereal for CSV.
   *
   */
  public String toString() {
    return this.name + "," + this.price + "," + this.shelf;
  }
}