package numbergames;

import java.util.Scanner;

public class BasicCalculator {
  
  public static void main(String[] args){
    // Set up scanner and gather input
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a = input.nextInt();
    System.out.print("Enter second number: ");
    int b = input.nextInt();
    // Do the operations
    Sum sum = new Sum(a,b);
    System.out.println("The sum is " + sum); 
    Difference diff = new Difference(a,b);
    System.out.println("The difference is " + diff);
  }
}