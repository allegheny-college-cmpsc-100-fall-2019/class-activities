package wordproblems;

import java.util.Scanner;

public class PrisonersDilemma {
  public static void main(String[] args){
    // Initialize objects
    String decision = new String();
    Scanner input = new Scanner(System.in);
    // Print and receive input at prompt
    System.out.print("Does Alice defect [T/F]: ");
    decision = input.nextLine().toUpperCase();
    // Set up boolean object
    boolean defectA = decision.equals("T");
    System.out.print("Does Bob defect [T/F]: ");
    decision = input.nextLine().toUpperCase();
    // Set up boolean object
    boolean defectB = decision.equals("T");
    // Initialize point values
    int yearsA = 0;
    int yearsB = 0;
    // Implement the logic
    // Print results
    System.out.println("\nAlice's sentence: " + yearsA + " year(s).");
    System.out.println("\nBob's sentence: " + yearsB + " year(s).");
    if(yearsA <= 1 && yearsB <= 1)
      System.out.println("\nAND THEY LIVE TO CATNAP AGAIN!");
  }
}