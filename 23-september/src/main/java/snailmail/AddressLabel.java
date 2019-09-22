package snailmail;

import java.util.Scanner;

/** Requests inputs for street address and prints label-ready text.
 *
 * @author {YOUR NAME HERE}
 */
public class AddressLabel {
  
  /** Entry point for program.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args){
    // Set up Scanner to take from System.in
    Scanner scan = new Scanner(System.in);
    /* 
     * Create prompts by printing text requested, 
     * then implementing Scanner.
     */
    System.out.print("Enter building number: ");
    int buildingNumber = scan.nextInt();
    /*
     * nextInt() doesn't consume the next line character ("\n"), 
     * so we ask the scanner to move along to the next line without
     * assigning the input to a variable. In essence, it creates
     * "garbage" out of it.
     */
    scan.nextLine();
    /*
     * Resume the information request.
     *
     * Use variables: buildingNumber, streetName, cityName, 
     * stateAbbrev, zipCode
     */
    System.out.print("Enter street name: ");
    // TODO Implement function scanning requested input
    System.out.print("Enter city: ");
    // TODO Implement function scanning requested input
    System.out.print("Enter two-letter state: ");
    // TODO Implement function scanning requested input
    System.out.print("Enter zip code: ");
    // TODO Implement function scanning requested input
    System.out.println();
    // TODO Implement print statement to display buildingNumber and streetName
    // TODO Implement print statement to display cityName, stateAbbrev, zipCode
  }
}